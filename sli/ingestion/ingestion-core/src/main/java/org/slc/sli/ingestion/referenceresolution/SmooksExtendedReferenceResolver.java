package org.slc.sli.ingestion.referenceresolution;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.milyn.Smooks;
import org.milyn.SmooksException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.slc.sli.ingestion.util.LogUtil;
import org.slc.sli.ingestion.xml.idref.IdRefResolutionHandler;

/**
 *
 * @author tke
 *
 */

public class SmooksExtendedReferenceResolver implements ReferenceResolutionStrategy {
    public static final Logger LOG = LoggerFactory.getLogger(IdRefResolutionHandler.class);

    private Map<String, Smooks> idRefConfigs;

    public Map<String, Smooks> getIdRefConfigs() {
        return idRefConfigs;
    }

    public void setIdRefConfigs(Map<String, Smooks> idRefConfigs) {
        this.idRefConfigs = idRefConfigs;
    }

    /**
     * resolve the reference
     *
     * @param interchange
     *            : Name of interchange
     * @param element
     *            : name of element
     * @param reference
     *            : name of the reference
     * @param content
     *            : the content of the referenced element in XML format
     * @return : the resolved content in XML format. Null if the reference is not supported yet.
     */
    @Override
    public boolean resolve(String xPath, InputStream content, OutputStream converedContent) {
        Smooks smooks = idRefConfigs.get(xPath);

        if (smooks == null) {
            return false;
        }

        try {
            StreamSource source = new StreamSource(content);
            StreamResult result = new StreamResult(converedContent);

            smooks.filterSource(source, result);
        } catch (SmooksException e) {
            LogUtil.debug(LOG, e.getMessage(), e);

            return false;
        }

        return true;
    }
}
