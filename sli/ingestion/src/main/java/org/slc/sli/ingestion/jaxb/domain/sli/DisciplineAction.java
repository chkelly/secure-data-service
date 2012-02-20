//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.20 at 03:58:29 AM EST 
//


package org.slc.sli.ingestion.jaxb.domain.sli;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This event entity represents actions taken by an
 * 				education
 * 				organization after a disruptive event that is recorded as a
 * 				discipline incident.
 * 			
 * 
 * <p>Java class for disciplineAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="disciplineAction">
 *   &lt;complexContent>
 *     &lt;extension base="{}complexObjectType">
 *       &lt;sequence>
 *         &lt;element name="disciplineActionIdentifier" type="{}disciplineActionIdentifier"/>
 *         &lt;element name="disciplines" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="disciplineDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="disciplineActionLength" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="actualDisciplineActionLength" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="disciplineActionLengthDifferenceReason" type="{}disciplineActionLengthDifferenceReasonType" minOccurs="0"/>
 *         &lt;element name="studentReference" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="disciplineIncidentReference" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="staffReference" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="responsibilitySchoolReference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="assignmentSchoolReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "disciplineAction", propOrder = {
    "disciplineActionIdentifier",
    "disciplines",
    "disciplineDate",
    "disciplineActionLength",
    "actualDisciplineActionLength",
    "disciplineActionLengthDifferenceReason",
    "studentReference",
    "disciplineIncidentReference",
    "staffReference",
    "responsibilitySchoolReference",
    "assignmentSchoolReference"
})
public class DisciplineAction
    extends ComplexObjectType
{

    @XmlElement(required = true)
    protected String disciplineActionIdentifier;
    @XmlElement(required = true)
    protected List<String> disciplines;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar disciplineDate;
    protected BigInteger disciplineActionLength;
    protected BigInteger actualDisciplineActionLength;
    protected DisciplineActionLengthDifferenceReasonType disciplineActionLengthDifferenceReason;
    @XmlElement(required = true)
    protected List<String> studentReference;
    @XmlElement(required = true)
    protected List<String> disciplineIncidentReference;
    protected List<String> staffReference;
    @XmlElement(required = true)
    protected String responsibilitySchoolReference;
    protected String assignmentSchoolReference;

    /**
     * Gets the value of the disciplineActionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisciplineActionIdentifier() {
        return disciplineActionIdentifier;
    }

    /**
     * Sets the value of the disciplineActionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisciplineActionIdentifier(String value) {
        this.disciplineActionIdentifier = value;
    }

    /**
     * Gets the value of the disciplines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disciplines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisciplines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDisciplines() {
        if (disciplines == null) {
            disciplines = new ArrayList<String>();
        }
        return this.disciplines;
    }

    /**
     * Gets the value of the disciplineDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDisciplineDate() {
        return disciplineDate;
    }

    /**
     * Sets the value of the disciplineDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisciplineDate(Calendar value) {
        this.disciplineDate = value;
    }

    /**
     * Gets the value of the disciplineActionLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDisciplineActionLength() {
        return disciplineActionLength;
    }

    /**
     * Sets the value of the disciplineActionLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDisciplineActionLength(BigInteger value) {
        this.disciplineActionLength = value;
    }

    /**
     * Gets the value of the actualDisciplineActionLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getActualDisciplineActionLength() {
        return actualDisciplineActionLength;
    }

    /**
     * Sets the value of the actualDisciplineActionLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setActualDisciplineActionLength(BigInteger value) {
        this.actualDisciplineActionLength = value;
    }

    /**
     * Gets the value of the disciplineActionLengthDifferenceReason property.
     * 
     * @return
     *     possible object is
     *     {@link DisciplineActionLengthDifferenceReasonType }
     *     
     */
    public DisciplineActionLengthDifferenceReasonType getDisciplineActionLengthDifferenceReason() {
        return disciplineActionLengthDifferenceReason;
    }

    /**
     * Sets the value of the disciplineActionLengthDifferenceReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisciplineActionLengthDifferenceReasonType }
     *     
     */
    public void setDisciplineActionLengthDifferenceReason(DisciplineActionLengthDifferenceReasonType value) {
        this.disciplineActionLengthDifferenceReason = value;
    }

    /**
     * Gets the value of the studentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStudentReference() {
        if (studentReference == null) {
            studentReference = new ArrayList<String>();
        }
        return this.studentReference;
    }

    /**
     * Gets the value of the disciplineIncidentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disciplineIncidentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisciplineIncidentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDisciplineIncidentReference() {
        if (disciplineIncidentReference == null) {
            disciplineIncidentReference = new ArrayList<String>();
        }
        return this.disciplineIncidentReference;
    }

    /**
     * Gets the value of the staffReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the staffReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStaffReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStaffReference() {
        if (staffReference == null) {
            staffReference = new ArrayList<String>();
        }
        return this.staffReference;
    }

    /**
     * Gets the value of the responsibilitySchoolReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsibilitySchoolReference() {
        return responsibilitySchoolReference;
    }

    /**
     * Sets the value of the responsibilitySchoolReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsibilitySchoolReference(String value) {
        this.responsibilitySchoolReference = value;
    }

    /**
     * Gets the value of the assignmentSchoolReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignmentSchoolReference() {
        return assignmentSchoolReference;
    }

    /**
     * Sets the value of the assignmentSchoolReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignmentSchoolReference(String value) {
        this.assignmentSchoolReference = value;
    }

}
