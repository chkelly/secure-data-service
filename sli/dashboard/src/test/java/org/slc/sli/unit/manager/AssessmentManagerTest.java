package org.slc.sli.unit.manager;


import static org.junit.Assert.assertEquals;


import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;


import org.slc.sli.client.MockAPIClient;
import org.slc.sli.config.ViewConfig;
import org.slc.sli.entity.Assessment;
import org.slc.sli.entity.assessmentmetadata.AssessmentMetaData;
import org.slc.sli.manager.AssessmentManager;
import org.slc.sli.manager.ConfigManager;

import static org.powermock.api.mockito.PowerMockito.when;

/**
 * Unit tests for the StudentManager class.
 * 
 */
public class AssessmentManagerTest {

    @Before
    public void setup() {
        
    }

    @Test
    public void testGetAssessments() throws Exception {
        
        String[] studentIdArray = {"453827070", "943715230"};
        List<String> studentIds = Arrays.asList(studentIdArray);
        ViewConfig config = ConfigManager.getInstance().getConfig("lkim", "IL_3-8_ELA"); // this view has ISAT Reading and ISAT Writing
        AssessmentManager aManager = AssessmentManager.getInstance(); 
        MockAPIClient mockClient = PowerMockito.spy(new MockAPIClient());
        when(mockClient.getFilename("mock_data/lkim/school.json")).thenReturn("src/test/resources/mock_data/lkim/school.json");
        when(mockClient.getFilename("mock_data/lkim/custom_view_config.json")).thenReturn("src/test/resources/mock_data/lkim/custom_view_config.json");
        aManager.setApiClient(mockClient);
        List<Assessment> assmts = aManager.getAssessments("lkim", studentIds, config);
        assertEquals(109, assmts.size()); 
    }
    

    @Test
    public void testGetAssessmentMetaData() throws Exception {
        AssessmentManager aManager = AssessmentManager.getInstance(); 
        MockAPIClient mockClient = PowerMockito.spy(new MockAPIClient());
        when(mockClient.getFilename("mock_data/assessment_meta_data.json")).thenReturn("src/test/resources/mock_data/assessment_meta_data.json");
        aManager.setApiClient(mockClient);
        List<AssessmentMetaData> metaData = aManager.getAssessmentMetaData("lkim");
        assertEquals(3, metaData.size()); // mock data has now 3 families: ISAT Reading, ISAT Writing, and DIBELS Next
    }
}
