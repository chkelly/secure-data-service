//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.20 at 03:58:29 AM EST 
//


package org.slc.sli.ingestion.jaxb.domain.sli;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addressType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="addressType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Home"/>
 *     &lt;enumeration value="Physical"/>
 *     &lt;enumeration value="Billing"/>
 *     &lt;enumeration value="Mailing"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Temporary"/>
 *     &lt;enumeration value="Work"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "addressType")
@XmlEnum
public enum AddressType {

    @XmlEnumValue("Home")
    HOME("Home"),
    @XmlEnumValue("Physical")
    PHYSICAL("Physical"),
    @XmlEnumValue("Billing")
    BILLING("Billing"),
    @XmlEnumValue("Mailing")
    MAILING("Mailing"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Temporary")
    TEMPORARY("Temporary"),
    @XmlEnumValue("Work")
    WORK("Work");
    private final String value;

    AddressType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AddressType fromValue(String v) {
        for (AddressType c: AddressType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
