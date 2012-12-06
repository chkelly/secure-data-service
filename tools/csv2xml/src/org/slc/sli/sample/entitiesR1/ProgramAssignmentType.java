//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.05 at 01:12:38 PM EST 
//


package org.slc.sli.sample.entitiesR1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProgramAssignmentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProgramAssignmentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Regular Education"/>
 *     &lt;enumeration value="Title I-Academic"/>
 *     &lt;enumeration value="Title I-Non-Academic"/>
 *     &lt;enumeration value="Special Education"/>
 *     &lt;enumeration value="Bilingual/English as a Second Language"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProgramAssignmentType")
@XmlEnum
public enum ProgramAssignmentType {

    @XmlEnumValue("Regular Education")
    REGULAR_EDUCATION("Regular Education"),
    @XmlEnumValue("Title I-Academic")
    TITLE_I_ACADEMIC("Title I-Academic"),
    @XmlEnumValue("Title I-Non-Academic")
    TITLE_I_NON_ACADEMIC("Title I-Non-Academic"),
    @XmlEnumValue("Special Education")
    SPECIAL_EDUCATION("Special Education"),
    @XmlEnumValue("Bilingual/English as a Second Language")
    BILINGUAL_ENGLISH_AS_A_SECOND_LANGUAGE("Bilingual/English as a Second Language");
    private final String value;

    ProgramAssignmentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProgramAssignmentType fromValue(String v) {
        for (ProgramAssignmentType c: ProgramAssignmentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
