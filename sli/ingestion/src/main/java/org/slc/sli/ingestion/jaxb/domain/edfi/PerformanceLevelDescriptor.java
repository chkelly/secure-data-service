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
 * This descriptor defines various levels or thresholds for performance on the assessment.  
 * 
 * <p>Java class for PerformanceLevelDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerformanceLevelDescriptor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ed-fi.org/0100}ComplexObjectType">
 *       &lt;sequence>
 *         &lt;element name="CodeValue" type="{http://ed-fi.org/0100}CodeValue" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://ed-fi.org/0100}Description"/>
 *         &lt;element name="PerformanceBaseConversion" type="{http://ed-fi.org/0100}PerformanceBaseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceLevelDescriptor", propOrder = {
    "codeValue",
    "description",
    "performanceBaseConversion"
})
public class PerformanceLevelDescriptor
    extends ComplexObjectType
{

    @XmlElement(name = "CodeValue")
    protected String codeValue;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "PerformanceBaseConversion")
    protected PerformanceBaseType performanceBaseConversion;

    /**
     * Gets the value of the codeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeValue() {
        return codeValue;
    }

    /**
     * Sets the value of the codeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeValue(String value) {
        this.codeValue = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the performanceBaseConversion property.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceBaseType }
     *     
     */
    public PerformanceBaseType getPerformanceBaseConversion() {
        return performanceBaseConversion;
    }

    /**
     * Sets the value of the performanceBaseConversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceBaseType }
     *     
     */
    public void setPerformanceBaseConversion(PerformanceBaseType value) {
        this.performanceBaseConversion = value;
    }

}
