//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.20 at 03:58:29 AM EST 
//


package org.slc.sli.ingestion.jaxb.domain.sli;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The 10-digit telephone number, including the area
 * 				code, for the
 * 				person.
 * 			
 * 
 * <p>Java class for telephone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="telephone">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="telephoneNumber" type="{}telephoneNumber"/>
 *         &lt;element name="telephoneNumberType" type="{}telephoneNumberType" minOccurs="0"/>
 *         &lt;element name="primaryTelephoneNumberIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "telephone", propOrder = {
    "telephoneNumber",
    "telephoneNumberType",
    "primaryTelephoneNumberIndicator"
})
public class Telephone {

    @XmlElement(required = true)
    protected String telephoneNumber;
    protected TelephoneNumberType telephoneNumberType;
    protected Boolean primaryTelephoneNumberIndicator;

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneNumber(String value) {
        this.telephoneNumber = value;
    }

    /**
     * Gets the value of the telephoneNumberType property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneNumberType }
     *     
     */
    public TelephoneNumberType getTelephoneNumberType() {
        return telephoneNumberType;
    }

    /**
     * Sets the value of the telephoneNumberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneNumberType }
     *     
     */
    public void setTelephoneNumberType(TelephoneNumberType value) {
        this.telephoneNumberType = value;
    }

    /**
     * Gets the value of the primaryTelephoneNumberIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryTelephoneNumberIndicator() {
        return primaryTelephoneNumberIndicator;
    }

    /**
     * Sets the value of the primaryTelephoneNumberIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryTelephoneNumberIndicator(Boolean value) {
        this.primaryTelephoneNumberIndicator = value;
    }

}
