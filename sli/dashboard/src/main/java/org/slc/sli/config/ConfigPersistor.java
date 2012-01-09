package org.slc.sli.config;

import org.slc.sli.client.MockAPIClient;
import org.slc.sli.entity.CustomData;

/**
 * 
 * ConfigPersistor reads and persists view configuration information.
 * 
 * @author dwu
 */
public class ConfigPersistor {

    private static final String VIEW_CONFIG = "view_config";
    
    /*
     *  Get the view configuration for an entity
     */
    public static ViewConfigSet getConfigSet(String entityId) throws Exception {
    
        // make API call with entity id
        MockAPIClient mockClient = new MockAPIClient();
        CustomData[] customData = mockClient.getCustomData(entityId, VIEW_CONFIG);
        
        // extract data block from custom data field
        if (customData == null || customData.length == 0) {
            return null;
        }
        
        String configStr = customData[0].getCustomData();
        
        // convert data block to POJO
        ViewConfigSet configSet = ConfigUtil.fromXMLString(configStr);
        
        return configSet;
    }
    
    /*
     *  Save the view configurations for an entity
     */
    public static void saveConfigSet(String entityId, ViewConfigSet configSet) throws Exception {
    
        // convert POJO to serialized format
        String configStr = ConfigUtil.toXMLString(configSet);
        
        // add data to custom data field
        CustomData customData = new CustomData();
        customData.setCustomData(configStr);
        
        // make API call
        CustomData[] customDataSet = new CustomData[1];
        customDataSet[0] = customData;
        MockAPIClient mockClient = new MockAPIClient();
        mockClient.saveCustomData(customDataSet, entityId, VIEW_CONFIG);
    }
    
}
