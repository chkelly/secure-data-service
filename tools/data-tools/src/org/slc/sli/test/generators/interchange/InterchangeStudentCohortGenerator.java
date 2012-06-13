package org.slc.sli.test.generators.interchange;

import static org.slc.sli.test.utils.InterchangeWriter.REPORT_INDENTATION;

import java.util.Collection;
import java.util.List;

import org.slc.sli.test.edfi.entities.Cohort;
import org.slc.sli.test.edfi.entities.InterchangeStudentCohort;
import org.slc.sli.test.edfi.entities.StaffCohortAssociation;
import org.slc.sli.test.edfi.entities.StudentCohortAssociation;
import org.slc.sli.test.edfi.entities.meta.CohortMeta;
import org.slc.sli.test.edfi.entities.meta.relations.MetaRelations;
import org.slc.sli.test.generators.CohortGenerator;
import org.slc.sli.test.generators.StaffCohortAssociationGenerator;
import org.slc.sli.test.generators.StudentCohortAssociationGenerator;
import org.slc.sli.test.xmlgen.StateEdFiXmlGenerator;

/**
 * Generates the Student Cohort Interchange as derived from the associations
 * determined during the call to MetaRelations.buildFromSea() in StateEdFiXmlGenerator.
 *
 * @author slee
 *
 */
public class InterchangeStudentCohortGenerator {

    /**
     * Sets up a new Student Cohort Interchange and populates it.
     *
     * @return
     */
    public static InterchangeStudentCohort generate() {
        long startTime = System.currentTimeMillis();

        InterchangeStudentCohort interchange = new InterchangeStudentCohort();
        System.out.println(interchange.getClass().getSimpleName() + ": started");

        List<Object> interchangeObjects = interchange.getCohortOrStudentCohortAssociationOrStaffCohortAssociation();

        addEntitiesToInterchange(interchangeObjects);

        System.out.println(interchange.getClass().getSimpleName() + ": generated " + interchangeObjects.size() + 
                " entries in " + (System.currentTimeMillis() - startTime) + "\n");
        return interchange;
    }

    /**
     * add related Entities To Interchange.
     *
     * @param interchangeObjects
     */
    private static void addEntitiesToInterchange(List<Object> interchangeObjects) {

        generateCohortData(interchangeObjects, MetaRelations.COHORT_MAP.values());
        generateStaffCohortAssociationData(interchangeObjects, MetaRelations.COHORT_MAP.values());
        generateStudentCohortAssociation(interchangeObjects, MetaRelations.COHORT_MAP.values());
    }

    /**
     * Call CohortGenerator to populates data into 
     * the interchange.
     *
     * @param interchangeObjects
     * @param cohortMetas
     */
    private static void generateCohortData(List<Object> interchangeObjects, Collection<CohortMeta> cohortMetas) {
        long startTime = System.currentTimeMillis();
        long count = 0;

        for (CohortMeta cohortMeta : cohortMetas) {
            Cohort retVal;

            if ("medium".equals(StateEdFiXmlGenerator.fidelityOfData)) {
                retVal = CohortGenerator.generateMidFi(cohortMeta);
            } else {
                retVal = CohortGenerator.generateLowFi(cohortMeta);
            }
            interchangeObjects.add(retVal);
            count++;
        }
        
        System.out.println(REPORT_INDENTATION + "generated " + count + " Cohort objects in: "
                + (System.currentTimeMillis() - startTime));
    }

    /**
     * Call StaffCohortAssociationGenerator to populates data into 
     * the interchange.
     *
     * @param interchangeObjects
     * @param cohortMetas
     */
    private static void generateStaffCohortAssociationData(List<Object> interchangeObjects, Collection<CohortMeta> cohortMetas) {
        long startTime = System.currentTimeMillis();
        long count = 0;

        for (CohortMeta cohortMeta : cohortMetas) {
            StaffCohortAssociation retVal;

            if ("medium".equals(StateEdFiXmlGenerator.fidelityOfData)) {
                retVal = StaffCohortAssociationGenerator.generateMedFi(cohortMeta);
            } else {
                retVal = StaffCohortAssociationGenerator.generateLowFi(cohortMeta);
            }
            interchangeObjects.add(retVal);
            count++;
        }
        
        System.out.println(REPORT_INDENTATION + "generated " + count + " StaffCohortAssociation objects in: "
                + (System.currentTimeMillis() - startTime));
    }

    /**
     * Call StaffCohortAssociationGenerator to populates data into 
     * the interchange.
     *
     * @param interchangeObjects
     * @param cohortMetas
     */
    private static void generateStudentCohortAssociation(List<Object> interchangeObjects, Collection<CohortMeta> cohortMetas) {
        long startTime = System.currentTimeMillis();
        long count = 0;

        for (CohortMeta cohortMeta : cohortMetas) {
            
            List<StudentCohortAssociation> retVal;

            if ("medium".equals(StateEdFiXmlGenerator.fidelityOfData)) {
                retVal = StudentCohortAssociationGenerator.generateMedFi(cohortMeta);
            } else {
                retVal = StudentCohortAssociationGenerator.generateLowFi(cohortMeta);
            }
            interchangeObjects.addAll(retVal);
            count += retVal.size();
        }
        
        System.out.println(REPORT_INDENTATION + "generated " + count + " StudentCohortAssociation objects in: "
                + (System.currentTimeMillis() - startTime));
    }
    
}
