//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.20 at 03:58:00 AM EST 
//


package org.slc.sli.ingestion.jaxb.domain.edfi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="StudentAcademicRecord" type="{http://ed-fi.org/0100}StudentAcademicRecord"/>
 *         &lt;element name="CourseTranscript" type="{http://ed-fi.org/0100}CourseTranscript"/>
 *         &lt;element name="ReportCard" type="{http://ed-fi.org/0100}ReportCard"/>
 *         &lt;element name="Grade" type="{http://ed-fi.org/0100}Grade"/>
 *         &lt;element name="StudentCompetency" type="{http://ed-fi.org/0100}StudentCompetency"/>
 *         &lt;element name="Diploma" type="{http://ed-fi.org/0100}Diploma"/>
 *         &lt;element name="GradebookEntry" type="{http://ed-fi.org/0100}GradebookEntry"/>
 *         &lt;element name="StudentGradebookEntry" type="{http://ed-fi.org/0100}StudentGradebookEntry"/>
 *         &lt;element name="CompentencyLevelDescriptor" type="{http://ed-fi.org/0100}CompetencyLevelDescriptor"/>
 *         &lt;element name="LearningObjective" type="{http://ed-fi.org/0100}LearningObjective"/>
 *         &lt;element name="StudentCompentencyObjective" type="{http://ed-fi.org/0100}StudentCompetencyObjective"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "studentAcademicRecordOrCourseTranscriptOrReportCard"
})
@XmlRootElement(name = "InterchangeStudentGrade")
public class InterchangeStudentGrade {

    @XmlElements({
        @XmlElement(name = "CompentencyLevelDescriptor", type = CompetencyLevelDescriptor.class),
        @XmlElement(name = "StudentGradebookEntry", type = StudentGradebookEntry.class),
        @XmlElement(name = "StudentCompentencyObjective", type = StudentCompetencyObjective.class),
        @XmlElement(name = "GradebookEntry", type = GradebookEntry.class),
        @XmlElement(name = "Diploma", type = Diploma.class),
        @XmlElement(name = "Grade", type = Grade.class),
        @XmlElement(name = "LearningObjective", type = LearningObjective.class),
        @XmlElement(name = "CourseTranscript", type = CourseTranscript.class),
        @XmlElement(name = "ReportCard", type = ReportCard.class),
        @XmlElement(name = "StudentCompetency", type = StudentCompetency.class),
        @XmlElement(name = "StudentAcademicRecord", type = StudentAcademicRecord.class)
    })
    protected List<ComplexObjectType> studentAcademicRecordOrCourseTranscriptOrReportCard;

    /**
     * Gets the value of the studentAcademicRecordOrCourseTranscriptOrReportCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studentAcademicRecordOrCourseTranscriptOrReportCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudentAcademicRecordOrCourseTranscriptOrReportCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompetencyLevelDescriptor }
     * {@link StudentGradebookEntry }
     * {@link StudentCompetencyObjective }
     * {@link GradebookEntry }
     * {@link Diploma }
     * {@link Grade }
     * {@link LearningObjective }
     * {@link CourseTranscript }
     * {@link ReportCard }
     * {@link StudentCompetency }
     * {@link StudentAcademicRecord }
     * 
     * 
     */
    public List<ComplexObjectType> getStudentAcademicRecordOrCourseTranscriptOrReportCard() {
        if (studentAcademicRecordOrCourseTranscriptOrReportCard == null) {
            studentAcademicRecordOrCourseTranscriptOrReportCard = new ArrayList<ComplexObjectType>();
        }
        return this.studentAcademicRecordOrCourseTranscriptOrReportCard;
    }

}
