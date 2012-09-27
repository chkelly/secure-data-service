@RALLY_US1107
Feature: Pre-loading of data for sandbox tenants - Ingestion component test

Scenario: Preload Small Sample Data Set
  Given I am using the tenant "TENANT-EDORG"
  And the following collections are empty in datastore:
     | collectionName                            |
     | assessment                                |
     | attendance                                |
     | calendarDate                              |
     | cohort                                    |
     | competencyLevelDescriptor                 |
     | course                                    |
     | courseOffering                            |
     | courseSectionAssociation                  |
     | disciplineAction                          |
     | disciplineIncident                        |
     | educationOrganization                     |
     | educationOrganizationAssociation          |
     | educationOrganizationSchoolAssociation    |
     | grade                                     |
     | gradebookEntry                            |
     | gradingPeriod                             |
     | graduationPlan                            |
     | learningObjective                         |
     | learningStandard                          |
     | parent                                    |
     | program                                   |
     | reportCard                                |
     | school                                    |
     | schoolSessionAssociation                  |
     | section                                   |
     | sectionAssessmentAssociation              |
     | sectionSchoolAssociation                  |
     | session                                   |
     | sessionCourseAssociation                  |
     | staff                                     |
     | staffCohortAssociation                    |
     | staffEducationOrganizationAssociation     |
     | staffProgramAssociation                   |
     | student                                   |
     | studentAcademicRecord                     |
     | studentAssessmentAssociation              |
     | studentCohortAssociation                  |
     | studentCompetency                         |
     | studentCompetencyObjective                |
     | studentDisciplineIncidentAssociation      |
     | studentParentAssociation                  |
     | studentProgramAssociation                 |
     | studentSchoolAssociation                  |
     | studentSectionAssociation                 |
     | studentGradebookEntry                     |
     | studentTranscriptAssociation              |
     | teacher                                   |
     | teacherSchoolAssociation                  |
     | teacherSectionAssociation                 |
   And I create a tenant set to preload data set "small"
   And a batch job log has been created
Then I should see following map of entry counts in the corresponding collections:
     | collectionName                           |              count|
     | assessment                               |                 19|
     | attendance                               |                 75|
     | calendarDate                             |                556|
     | cohort                                   |                  3|
     | competencyLevelDescriptor                |                  0|
     | course                                   |                 95|
     | courseOffering                           |                 95|
     | courseSectionAssociation                 |                  0|
     | disciplineAction                         |                  2|
     | disciplineIncident                       |                  2|
     | educationOrganization                    |                  5|
     | educationOrganizationAssociation         |                  0|
     | educationOrganizationSchoolAssociation   |                  0|
     | grade                                    |                  4|
     | gradebookEntry                           |                 12|
     | gradingPeriod                            |                 17|
     | graduationPlan                           |                  0|
     | learningObjective                        |                135|
     | learningStandard                         |               1463|
     | parent                                   |                  9|
     | program                                  |                  2|
     | reportCard                               |                  2|
     | schoolSessionAssociation                 |                  0|
     | section                                  |                 97|
     | sectionAssessmentAssociation             |                  0|
     | sectionSchoolAssociation                 |                  0|
     | session                                  |                 22|
     | sessionCourseAssociation                 |                  0|
     | staff                                    |                 14|
     | staffCohortAssociation                   |                  3|
     | staffEducationOrganizationAssociation    |                 10|
     | staffProgramAssociation                  |                  3|
     | student                                  |                 78|
     | studentAcademicRecord                    |                117|
     | studentAssessmentAssociation             |                203|
     | studentCohortAssociation                 |                  6|
     | studentCompetency                        |                 59|
     | studentCompetencyObjective               |                  4|
     | studentDisciplineIncidentAssociation     |                  4|
     | studentParentAssociation                 |                  9|
     | studentProgramAssociation                |                  6|
     | studentSchoolAssociation                 |                167|
     | studentSectionAssociation                |                297|
     | studentGradebookEntry                    |                315|
     | studentTranscriptAssociation             |                196|
     | teacherSchoolAssociation                 |                  3|
     | teacherSectionAssociation                |                 11|
    And I should not see an error log file created


Scenario: Preload Small Sample Data Set
   Then I create a tenant set to preload data set "medium"
   And a batch job log has been created
   And I should not see an error log file created
