//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.20 at 03:58:29 AM EST 
//


package org.slc.sli.ingestion.jaxb.domain.sli;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * This descriptor defines the fields of certification
 * 				that the SEA
 * 				offers to teachers.
 * 			
 * 
 * <p>Java class for credentialFieldDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="credentialFieldDescriptor">
 *   &lt;complexContent>
 *     &lt;extension base="{}complexObjectType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="codeValue" type="{}codeValue"/>
 *         &lt;element name="description" type="{}description"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "credentialFieldDescriptor", propOrder = {
    "codeValueOrDescription"
})
public class CredentialFieldDescriptor
    extends ComplexObjectType
{

    @XmlElementRefs({
        @XmlElementRef(name = "codeValue", type = JAXBElement.class),
        @XmlElementRef(name = "description", type = JAXBElement.class)
    })
    protected List<JAXBElement<String>> codeValueOrDescription;

    /**
     * Gets the value of the codeValueOrDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codeValueOrDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodeValueOrDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getCodeValueOrDescription() {
        if (codeValueOrDescription == null) {
            codeValueOrDescription = new ArrayList<JAXBElement<String>>();
        }
        return this.codeValueOrDescription;
    }

}
