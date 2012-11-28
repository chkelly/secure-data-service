//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.16 at 01:39:34 PM EST 
//


package org.slc.sli.test.edfi.entities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 
 * <p>Java class for SLC-Assessment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SLC-Assessment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ed-fi.org/0100}ComplexObjectType">
 *       &lt;sequence>
 *         &lt;element name="AssessmentTitle" type="{http://ed-fi.org/0100}AssessmentTitle"/>
 *         &lt;element name="AssessmentIdentificationCode" type="{http://ed-fi.org/0100}AssessmentIdentificationCode" maxOccurs="unbounded"/>
 *         &lt;element name="AssessmentCategory" type="{http://ed-fi.org/0100}AssessmentCategoryType" minOccurs="0"/>
 *         &lt;element name="AcademicSubject" type="{http://ed-fi.org/0100}AcademicSubjectType" minOccurs="0"/>
 *         &lt;element name="GradeLevelAssessed" type="{http://ed-fi.org/0100}GradeLevelType" minOccurs="0"/>
 *         &lt;element name="LowestGradeLevelAssessed" type="{http://ed-fi.org/0100}GradeLevelType" minOccurs="0"/>
 *         &lt;element name="AssessmentPerformanceLevel" type="{http://ed-fi.org/0100}AssessmentPerformanceLevel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContentStandard" type="{http://ed-fi.org/0100}ContentStandardType" minOccurs="0"/>
 *         &lt;element name="AssessmentForm" type="{http://ed-fi.org/0100}AssessmentForm" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://ed-fi.org/0100}Version" minOccurs="0"/>
 *         &lt;element name="RevisionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="MaxRawScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Nomenclature" type="{http://ed-fi.org/0100}Nomenclature" minOccurs="0"/>
 *         &lt;element name="AssessmentPeriod" type="{http://ed-fi.org/0100}AssessmentPeriodDescriptorType" minOccurs="0"/>
 *         &lt;element name="AssessmentItemReference" type="{http://ed-fi.org/0100}AssessmentItemReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ObjectiveAssessmentReference" type="{http://ed-fi.org/0100}SLC-ObjectiveAssessmentReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssessmentFamilyReference" type="{http://ed-fi.org/0100}AssessmentFamilyReferenceType" minOccurs="0"/>
 *         &lt;element name="SectionReference" type="{http://ed-fi.org/0100}SLC-SectionReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SLC-Assessment", propOrder = {
    "assessmentTitle",
    "assessmentIdentificationCode",
    "assessmentCategory",
    "academicSubject",
    "gradeLevelAssessed",
    "lowestGradeLevelAssessed",
    "assessmentPerformanceLevel",
    "contentStandard",
    "assessmentForm",
    "version",
    "revisionDate",
    "maxRawScore",
    "nomenclature",
    "assessmentPeriod",
    "assessmentItemReference",
    "objectiveAssessmentReference",
    "assessmentFamilyReference",
    "sectionReference"
})

@XmlRootElement(name = "Assessment")
public class SLCAssessment
    extends ComplexObjectType
{

    @XmlElement(name = "AssessmentTitle", required = true)
    protected String assessmentTitle;
    @XmlElement(name = "AssessmentIdentificationCode", required = true)
    protected List<AssessmentIdentificationCode> assessmentIdentificationCode;
    @XmlElement(name = "AssessmentCategory")
    protected AssessmentCategoryType assessmentCategory;
    @XmlElement(name = "AcademicSubject")
    protected AcademicSubjectType academicSubject;
    @XmlElement(name = "GradeLevelAssessed")
    protected GradeLevelType gradeLevelAssessed;
    @XmlElement(name = "LowestGradeLevelAssessed")
    protected GradeLevelType lowestGradeLevelAssessed;
    @XmlElement(name = "AssessmentPerformanceLevel")
    protected List<AssessmentPerformanceLevel> assessmentPerformanceLevel;
    @XmlElement(name = "ContentStandard")
    protected ContentStandardType contentStandard;
    @XmlElement(name = "AssessmentForm")
    protected String assessmentForm;
    @XmlElement(name = "Version")
    protected Integer version;
    @XmlElement(name = "RevisionDate")
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected String revisionDate;
    @XmlElement(name = "MaxRawScore")
    protected Integer maxRawScore;
    @XmlElement(name = "Nomenclature")
    protected String nomenclature;
    @XmlElement(name = "AssessmentPeriod")
    protected AssessmentPeriodDescriptorType assessmentPeriod;
    @XmlElement(name = "AssessmentItemReference")
    protected List<AssessmentItemReferenceType> assessmentItemReference;
    @XmlElement(name = "ObjectiveAssessmentReference")
    protected List<SLCObjectiveAssessmentReferenceType> objectiveAssessmentReference;
    @XmlElement(name = "AssessmentFamilyReference")
    protected AssessmentFamilyReferenceType assessmentFamilyReference;
    @XmlElement(name = "SectionReference")
    protected List<SLCSectionReferenceType> sectionReference;

    /**
     * Gets the value of the assessmentTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentTitle() {
        return assessmentTitle;
    }

    /**
     * Sets the value of the assessmentTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentTitle(String value) {
        this.assessmentTitle = value;
    }

    /**
     * Gets the value of the assessmentIdentificationCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessmentIdentificationCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessmentIdentificationCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssessmentIdentificationCode }
     * 
     * 
     */
    public List<AssessmentIdentificationCode> getAssessmentIdentificationCode() {
        if (assessmentIdentificationCode == null) {
            assessmentIdentificationCode = new ArrayList<AssessmentIdentificationCode>();
        }
        return this.assessmentIdentificationCode;
    }

    /**
     * Gets the value of the assessmentCategory property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentCategoryType }
     *     
     */
    public AssessmentCategoryType getAssessmentCategory() {
        return assessmentCategory;
    }

    /**
     * Sets the value of the assessmentCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentCategoryType }
     *     
     */
    public void setAssessmentCategory(AssessmentCategoryType value) {
        this.assessmentCategory = value;
    }

    /**
     * Gets the value of the academicSubject property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicSubjectType }
     *     
     */
    public AcademicSubjectType getAcademicSubject() {
        return academicSubject;
    }

    /**
     * Sets the value of the academicSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicSubjectType }
     *     
     */
    public void setAcademicSubject(AcademicSubjectType value) {
        this.academicSubject = value;
    }

    /**
     * Gets the value of the gradeLevelAssessed property.
     * 
     * @return
     *     possible object is
     *     {@link GradeLevelType }
     *     
     */
    public GradeLevelType getGradeLevelAssessed() {
        return gradeLevelAssessed;
    }

    /**
     * Sets the value of the gradeLevelAssessed property.
     * 
     * @param value
     *     allowed object is
     *     {@link GradeLevelType }
     *     
     */
    public void setGradeLevelAssessed(GradeLevelType value) {
        this.gradeLevelAssessed = value;
    }

    /**
     * Gets the value of the lowestGradeLevelAssessed property.
     * 
     * @return
     *     possible object is
     *     {@link GradeLevelType }
     *     
     */
    public GradeLevelType getLowestGradeLevelAssessed() {
        return lowestGradeLevelAssessed;
    }

    /**
     * Sets the value of the lowestGradeLevelAssessed property.
     * 
     * @param value
     *     allowed object is
     *     {@link GradeLevelType }
     *     
     */
    public void setLowestGradeLevelAssessed(GradeLevelType value) {
        this.lowestGradeLevelAssessed = value;
    }

    /**
     * Gets the value of the assessmentPerformanceLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessmentPerformanceLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessmentPerformanceLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssessmentPerformanceLevel }
     * 
     * 
     */
    public List<AssessmentPerformanceLevel> getAssessmentPerformanceLevel() {
        if (assessmentPerformanceLevel == null) {
            assessmentPerformanceLevel = new ArrayList<AssessmentPerformanceLevel>();
        }
        return this.assessmentPerformanceLevel;
    }

    /**
     * Gets the value of the contentStandard property.
     * 
     * @return
     *     possible object is
     *     {@link ContentStandardType }
     *     
     */
    public ContentStandardType getContentStandard() {
        return contentStandard;
    }

    /**
     * Sets the value of the contentStandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentStandardType }
     *     
     */
    public void setContentStandard(ContentStandardType value) {
        this.contentStandard = value;
    }

    /**
     * Gets the value of the assessmentForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentForm() {
        return assessmentForm;
    }

    /**
     * Sets the value of the assessmentForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentForm(String value) {
        this.assessmentForm = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersion(Integer value) {
        this.version = value;
    }

    /**
     * Gets the value of the revisionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionDate() {
        return revisionDate;
    }

    /**
     * Sets the value of the revisionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionDate(String value) {
        this.revisionDate = value;
    }

    /**
     * Gets the value of the maxRawScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxRawScore() {
        return maxRawScore;
    }

    /**
     * Sets the value of the maxRawScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxRawScore(Integer value) {
        this.maxRawScore = value;
    }

    /**
     * Gets the value of the nomenclature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomenclature() {
        return nomenclature;
    }

    /**
     * Sets the value of the nomenclature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomenclature(String value) {
        this.nomenclature = value;
    }

    /**
     * Gets the value of the assessmentPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentPeriodDescriptorType }
     *     
     */
    public AssessmentPeriodDescriptorType getAssessmentPeriod() {
        return assessmentPeriod;
    }

    /**
     * Sets the value of the assessmentPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentPeriodDescriptorType }
     *     
     */
    public void setAssessmentPeriod(AssessmentPeriodDescriptorType value) {
        this.assessmentPeriod = value;
    }

    /**
     * Gets the value of the assessmentItemReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessmentItemReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessmentItemReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssessmentItemReferenceType }
     * 
     * 
     */
    public List<AssessmentItemReferenceType> getAssessmentItemReference() {
        if (assessmentItemReference == null) {
            assessmentItemReference = new ArrayList<AssessmentItemReferenceType>();
        }
        return this.assessmentItemReference;
    }

    /**
     * Gets the value of the objectiveAssessmentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectiveAssessmentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectiveAssessmentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SLCObjectiveAssessmentReferenceType }
     * 
     * 
     */
    public List<SLCObjectiveAssessmentReferenceType> getObjectiveAssessmentReference() {
        if (objectiveAssessmentReference == null) {
            objectiveAssessmentReference = new ArrayList<SLCObjectiveAssessmentReferenceType>();
        }
        return this.objectiveAssessmentReference;
    }

    /**
     * Gets the value of the assessmentFamilyReference property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentFamilyReferenceType }
     *     
     */
    public AssessmentFamilyReferenceType getAssessmentFamilyReference() {
        return assessmentFamilyReference;
    }

    /**
     * Sets the value of the assessmentFamilyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentFamilyReferenceType }
     *     
     */
    public void setAssessmentFamilyReference(AssessmentFamilyReferenceType value) {
        this.assessmentFamilyReference = value;
    }

    /**
     * Gets the value of the sectionReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sectionReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSectionReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SLCSectionReferenceType }
     * 
     * 
     */
    public List<SLCSectionReferenceType> getSectionReference() {
        if (sectionReference == null) {
            sectionReference = new ArrayList<SLCSectionReferenceType>();
        }
        return this.sectionReference;
    }

}
