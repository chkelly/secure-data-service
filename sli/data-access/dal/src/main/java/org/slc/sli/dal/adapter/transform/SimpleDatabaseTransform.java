package org.slc.sli.dal.adapter.transform;

import org.slc.sli.domain.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: srupasinghe
 * Date: 9/12/12
 * Time: 4:12 PM
 * To change this template use File | Settings | File Templates.
 */
@Component
public class SimpleDatabaseTransform implements DatabaseTransform {

    private static final String KEY = "populationServed";
    private static final String NEW_KEY = "newAttribute";

    @Autowired
    @Qualifier("mongoTemplate")
    private MongoTemplate template;

    @Override
    public Entity transformWrite(Entity toTransform) {
        String value = (String) toTransform.getBody().get(NEW_KEY);
        toTransform.getBody().remove(NEW_KEY);
        toTransform.getBody().put(KEY, value);

        return toTransform;
    }

    @Override
    public Entity transformRead(Entity toTransform) {
        String value = (String) toTransform.getBody().get(KEY);
        toTransform.getBody().remove(KEY);
        toTransform.getBody().put(NEW_KEY, value);

        return toTransform;
    }

    @Override
    public boolean isTransformable(String type, int fromVersion, int toVersion) {
        if (type.equals("section")) {
            return true;
        }

        return false;
    }
}
