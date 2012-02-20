//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.20 at 03:58:00 AM EST 
//


package org.slc.sli.ingestion.jaxb.domain.edfi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides alternative references for assessment items during interchange. Use XML IDREF to reference a course record that is included in the interchange
 * 
 * <p>Java class for AssessmentItemReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssessmentItemReferenceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ed-fi.org/0100}ReferenceType">
 *       &lt;sequence>
 *         &lt;element name="AssessmentItemIdentity" type="{http://ed-fi.org/0100}AssessmentItemIdentityType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssessmentItemReferenceType", propOrder = {
    "assessmentItemIdentity"
})
public class AssessmentItemReferenceType
    extends ReferenceType
{

    @XmlElement(name = "AssessmentItemIdentity")
    protected AssessmentItemIdentityType assessmentItemIdentity;

    /**
     * Gets the value of the assessmentItemIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentItemIdentityType }
     *     
     */
    public AssessmentItemIdentityType getAssessmentItemIdentity() {
        return assessmentItemIdentity;
    }

    /**
     * Sets the value of the assessmentItemIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentItemIdentityType }
     *     
     */
    public void setAssessmentItemIdentity(AssessmentItemIdentityType value) {
        this.assessmentItemIdentity = value;
    }

}
