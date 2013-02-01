/*
 * Copyright 2012-2013 inBloom, Inc. and its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.04.20 at 03:09:04 PM EDT 
//


package org.slc.sli.sample.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The 10-digit telephone number, including the area code, for the person.
 * 
 * <p>Java class for Telephone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Telephone">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TelephoneNumber" type="{http://ed-fi.org/0100}TelephoneNumber"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TelephoneNumberType" type="{http://ed-fi.org/0100}TelephoneNumberType" />
 *       &lt;attribute name="PrimaryTelephoneNumberIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Telephone", propOrder = {
    "telephoneNumber"
})
public class Telephone {

    @XmlElement(name = "TelephoneNumber", required = true)
    protected String telephoneNumber;
    @XmlAttribute(name = "TelephoneNumberType")
    protected TelephoneNumberType telephoneNumberType;
    @XmlAttribute(name = "PrimaryTelephoneNumberIndicator")
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
