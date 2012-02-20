//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.20 at 03:58:00 AM EST 
//


package org.slc.sli.ingestion.jaxb.domain.edfi;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This educational entity represents the cumulative record of academic achievement for a student.
 * 
 * <p>Java class for StudentAcademicRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentAcademicRecord">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ed-fi.org/0100}ComplexObjectType">
 *       &lt;sequence>
 *         &lt;element name="CumulativeCreditsEarned" type="{http://ed-fi.org/0100}Credits" minOccurs="0"/>
 *         &lt;element name="CumulativeCreditsAttempted" type="{http://ed-fi.org/0100}Credits" minOccurs="0"/>
 *         &lt;element name="CumulativeGradePointsEarned" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CumulativeGradePointAverage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="GradeValueQualifier" type="{http://ed-fi.org/0100}GradeValueQualifier" minOccurs="0"/>
 *         &lt;element name="ClassRanking" type="{http://ed-fi.org/0100}ClassRanking" minOccurs="0"/>
 *         &lt;element name="AcademicHonors" type="{http://ed-fi.org/0100}AcademicHonor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Recognitions" type="{http://ed-fi.org/0100}Recognition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProjectedGraduationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="StudentReference" type="{http://ed-fi.org/0100}StudentReferenceType"/>
 *         &lt;element name="SessionReference" type="{http://ed-fi.org/0100}SessionReferenceType"/>
 *         &lt;element name="ReportCardReference" type="{http://ed-fi.org/0100}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DiplomaReference" type="{http://ed-fi.org/0100}ReferenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentAcademicRecord", propOrder = {
    "cumulativeCreditsEarned",
    "cumulativeCreditsAttempted",
    "cumulativeGradePointsEarned",
    "cumulativeGradePointAverage",
    "gradeValueQualifier",
    "classRanking",
    "academicHonors",
    "recognitions",
    "projectedGraduationDate",
    "studentReference",
    "sessionReference",
    "reportCardReference",
    "diplomaReference"
})
@XmlSeeAlso({
    StudentAcademicRecordExtendedType.class
})
public class StudentAcademicRecord
    extends ComplexObjectType
{

    @XmlElement(name = "CumulativeCreditsEarned")
    protected Credits cumulativeCreditsEarned;
    @XmlElement(name = "CumulativeCreditsAttempted")
    protected Credits cumulativeCreditsAttempted;
    @XmlElement(name = "CumulativeGradePointsEarned")
    protected BigDecimal cumulativeGradePointsEarned;
    @XmlElement(name = "CumulativeGradePointAverage")
    protected BigDecimal cumulativeGradePointAverage;
    @XmlElement(name = "GradeValueQualifier")
    protected String gradeValueQualifier;
    @XmlElement(name = "ClassRanking")
    protected ClassRanking classRanking;
    @XmlElement(name = "AcademicHonors")
    protected List<AcademicHonor> academicHonors;
    @XmlElement(name = "Recognitions")
    protected List<Recognition> recognitions;
    @XmlElement(name = "ProjectedGraduationDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar projectedGraduationDate;
    @XmlElement(name = "StudentReference", required = true)
    protected StudentReferenceType studentReference;
    @XmlElement(name = "SessionReference", required = true)
    protected SessionReferenceType sessionReference;
    @XmlElement(name = "ReportCardReference")
    protected List<ReferenceType> reportCardReference;
    @XmlElement(name = "DiplomaReference")
    protected ReferenceType diplomaReference;

    /**
     * Gets the value of the cumulativeCreditsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link Credits }
     *     
     */
    public Credits getCumulativeCreditsEarned() {
        return cumulativeCreditsEarned;
    }

    /**
     * Sets the value of the cumulativeCreditsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Credits }
     *     
     */
    public void setCumulativeCreditsEarned(Credits value) {
        this.cumulativeCreditsEarned = value;
    }

    /**
     * Gets the value of the cumulativeCreditsAttempted property.
     * 
     * @return
     *     possible object is
     *     {@link Credits }
     *     
     */
    public Credits getCumulativeCreditsAttempted() {
        return cumulativeCreditsAttempted;
    }

    /**
     * Sets the value of the cumulativeCreditsAttempted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Credits }
     *     
     */
    public void setCumulativeCreditsAttempted(Credits value) {
        this.cumulativeCreditsAttempted = value;
    }

    /**
     * Gets the value of the cumulativeGradePointsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCumulativeGradePointsEarned() {
        return cumulativeGradePointsEarned;
    }

    /**
     * Sets the value of the cumulativeGradePointsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCumulativeGradePointsEarned(BigDecimal value) {
        this.cumulativeGradePointsEarned = value;
    }

    /**
     * Gets the value of the cumulativeGradePointAverage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCumulativeGradePointAverage() {
        return cumulativeGradePointAverage;
    }

    /**
     * Sets the value of the cumulativeGradePointAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCumulativeGradePointAverage(BigDecimal value) {
        this.cumulativeGradePointAverage = value;
    }

    /**
     * Gets the value of the gradeValueQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGradeValueQualifier() {
        return gradeValueQualifier;
    }

    /**
     * Sets the value of the gradeValueQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGradeValueQualifier(String value) {
        this.gradeValueQualifier = value;
    }

    /**
     * Gets the value of the classRanking property.
     * 
     * @return
     *     possible object is
     *     {@link ClassRanking }
     *     
     */
    public ClassRanking getClassRanking() {
        return classRanking;
    }

    /**
     * Sets the value of the classRanking property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassRanking }
     *     
     */
    public void setClassRanking(ClassRanking value) {
        this.classRanking = value;
    }

    /**
     * Gets the value of the academicHonors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the academicHonors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcademicHonors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcademicHonor }
     * 
     * 
     */
    public List<AcademicHonor> getAcademicHonors() {
        if (academicHonors == null) {
            academicHonors = new ArrayList<AcademicHonor>();
        }
        return this.academicHonors;
    }

    /**
     * Gets the value of the recognitions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recognitions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecognitions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Recognition }
     * 
     * 
     */
    public List<Recognition> getRecognitions() {
        if (recognitions == null) {
            recognitions = new ArrayList<Recognition>();
        }
        return this.recognitions;
    }

    /**
     * Gets the value of the projectedGraduationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getProjectedGraduationDate() {
        return projectedGraduationDate;
    }

    /**
     * Sets the value of the projectedGraduationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectedGraduationDate(Calendar value) {
        this.projectedGraduationDate = value;
    }

    /**
     * Gets the value of the studentReference property.
     * 
     * @return
     *     possible object is
     *     {@link StudentReferenceType }
     *     
     */
    public StudentReferenceType getStudentReference() {
        return studentReference;
    }

    /**
     * Sets the value of the studentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentReferenceType }
     *     
     */
    public void setStudentReference(StudentReferenceType value) {
        this.studentReference = value;
    }

    /**
     * Gets the value of the sessionReference property.
     * 
     * @return
     *     possible object is
     *     {@link SessionReferenceType }
     *     
     */
    public SessionReferenceType getSessionReference() {
        return sessionReference;
    }

    /**
     * Sets the value of the sessionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionReferenceType }
     *     
     */
    public void setSessionReference(SessionReferenceType value) {
        this.sessionReference = value;
    }

    /**
     * Gets the value of the reportCardReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportCardReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportCardReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getReportCardReference() {
        if (reportCardReference == null) {
            reportCardReference = new ArrayList<ReferenceType>();
        }
        return this.reportCardReference;
    }

    /**
     * Gets the value of the diplomaReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getDiplomaReference() {
        return diplomaReference;
    }

    /**
     * Sets the value of the diplomaReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setDiplomaReference(ReferenceType value) {
        this.diplomaReference = value;
    }

}
