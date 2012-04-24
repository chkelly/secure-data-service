package org.slc.sli.ingestion.dal;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.index.Index;
import org.springframework.data.mongodb.core.index.IndexDefinition;
import org.springframework.data.mongodb.core.query.Order;

/** Mongo indexes manager, which loads the indexes from the json configuration file.
 *
 * @author tke
 *
 */

public final class MongoIndexManager {
    private static final Logger LOG = LoggerFactory.getLogger(MongoIndexManager.class);

    private Map<String, List<IndexDefinition>> collectionIndexes = null;
    private List<InputStream> indexesConfigs;

    private IndexResourcePatternResolver indexResolver;

    private String indexRootDir;

    /**
     * Create the indexes map for all collections
     *
     * @param indexesIput : the list of InputStream for all the indexes files
     * @return
     */
    public Map<String, List<IndexDefinition>> createIndexes(String batchJobId) {

        indexesConfigs = indexResolver.findAllIndexes(indexRootDir);
        List<MongoIndexConfig> mongoIndexConfigs = new ArrayList<MongoIndexConfig>();

        if (collectionIndexes == null) {
            collectionIndexes = new HashMap<String, List<IndexDefinition>>();
        }

        try {
            for (InputStream indexesConfig : indexesConfigs) {
                mongoIndexConfigs.add(MongoIndexConfig.parse(indexesConfig));
            }

            for (MongoIndexConfig mongoIndexConfig : mongoIndexConfigs) {
                List<IndexDefinition> indexList;
                String collectionName = mongoIndexConfig.getCollection() + "_" + batchJobId;
                if (!collectionIndexes.containsKey(collectionName)) {
                    indexList = new ArrayList<IndexDefinition>();
                } else {
                    indexList = collectionIndexes.get(collectionName);
                }
                    indexList.add(createIndexDefinition(mongoIndexConfig.getIndexFields()));
                    collectionIndexes.put(collectionName, indexList);
            }

        } catch (IOException e) {
            throw new RuntimeException("Failed to create the indexes");
        }

        return collectionIndexes;
    }

    /**Create index definition from buffered reader
     *
     * @param fields : the fields read from the config files
     * @param collectionName : name of the collection the indexes to be created for
     * @return
     * @throws IOException
     */
    public IndexDefinition createIndexDefinition(List<Map<String, String>> fields) throws IOException {
        Index index = new Index();

        for (Map<String, String> field : fields) {
            index.on(field.get("name"), field.get("position").equals("1") ? Order.ASCENDING : Order.DESCENDING);
        }
        return index;
    }

    /**Set indexes for all the collections
     *
     * @param template : mongo template to set the index
     */
    public void setIndex(MongoTemplate template) {
        Set<String> collections = collectionIndexes.keySet();

        for (String collection : collections) {
            for (IndexDefinition index : collectionIndexes.get(collection)) {
                if (!template.collectionExists(collection)) {
                    template.createCollection(collection);
                }
                try {
                    template.ensureIndex(index, collection);
                } catch (Exception e) {
                    LOG.error("Failed to create mongo indexes");
                }
            }
        }
    }

    public String getIndexRootDir() {
        return indexRootDir;
    }

    public void setIndexRootDir(String indexRootDir) {
        this.indexRootDir = indexRootDir;
    }

    public List<InputStream> getIndexesConfigs() {
        return indexesConfigs;
    }

    public void setIndexesConfigs(List<InputStream> indexesConfigs) {
        this.indexesConfigs = indexesConfigs;
    }

    public IndexResourcePatternResolver getIndexResolver() {
        return indexResolver;
    }

    public void setIndexResolver(IndexResourcePatternResolver indexResolver) {
        this.indexResolver = indexResolver;
    }

}
