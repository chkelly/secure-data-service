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
 * <p>Java class for personalTitlePrefixType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="personalTitlePrefixType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Colonel"/>
 *     &lt;enumeration value="Dr"/>
 *     &lt;enumeration value="Mr"/>
 *     &lt;enumeration value="Mrs"/>
 *     &lt;enumeration value="Ms"/>
 *     &lt;enumeration value="Reverend"/>
 *     &lt;enumeration value="Sr"/>
 *     &lt;enumeration value="Sister"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "personalTitlePrefixType")
@XmlEnum
public enum PersonalTitlePrefixType {

    @XmlEnumValue("Colonel")
    COLONEL("Colonel"),
    @XmlEnumValue("Dr")
    DR("Dr"),
    @XmlEnumValue("Mr")
    MR("Mr"),
    @XmlEnumValue("Mrs")
    MRS("Mrs"),
    @XmlEnumValue("Ms")
    MS("Ms"),
    @XmlEnumValue("Reverend")
    REVEREND("Reverend"),
    @XmlEnumValue("Sr")
    SR("Sr"),
    @XmlEnumValue("Sister")
    SISTER("Sister");
    private final String value;

    PersonalTitlePrefixType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PersonalTitlePrefixType fromValue(String v) {
        for (PersonalTitlePrefixType c: PersonalTitlePrefixType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
