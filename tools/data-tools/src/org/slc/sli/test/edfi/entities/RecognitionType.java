//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.04.17 at 01:12:00 PM EDT 
//


package org.slc.sli.test.edfi.entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecognitionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RecognitionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Athletic awards"/>
 *     &lt;enumeration value="Awarding of units of value"/>
 *     &lt;enumeration value="Citizenship award/recognition"/>
 *     &lt;enumeration value="Completion of requirement, but no units of value awarded"/>
 *     &lt;enumeration value="Certificate"/>
 *     &lt;enumeration value="Honor award"/>
 *     &lt;enumeration value="Letter of commendation"/>
 *     &lt;enumeration value="Medals"/>
 *     &lt;enumeration value="Monogram/letter"/>
 *     &lt;enumeration value="Points"/>
 *     &lt;enumeration value="Promotion or advancement"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RecognitionType")
@XmlEnum
public enum RecognitionType {

    @XmlEnumValue("Athletic awards")
    ATHLETIC_AWARDS("Athletic awards"),
    @XmlEnumValue("Awarding of units of value")
    AWARDING_OF_UNITS_OF_VALUE("Awarding of units of value"),
    @XmlEnumValue("Citizenship award/recognition")
    CITIZENSHIP_AWARD_RECOGNITION("Citizenship award/recognition"),
    @XmlEnumValue("Completion of requirement, but no units of value awarded")
    COMPLETION_OF_REQUIREMENT_BUT_NO_UNITS_OF_VALUE_AWARDED("Completion of requirement, but no units of value awarded"),
    @XmlEnumValue("Certificate")
    CERTIFICATE("Certificate"),
    @XmlEnumValue("Honor award")
    HONOR_AWARD("Honor award"),
    @XmlEnumValue("Letter of commendation")
    LETTER_OF_COMMENDATION("Letter of commendation"),
    @XmlEnumValue("Medals")
    MEDALS("Medals"),
    @XmlEnumValue("Monogram/letter")
    MONOGRAM_LETTER("Monogram/letter"),
    @XmlEnumValue("Points")
    POINTS("Points"),
    @XmlEnumValue("Promotion or advancement")
    PROMOTION_OR_ADVANCEMENT("Promotion or advancement"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    RecognitionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecognitionType fromValue(String v) {
        for (RecognitionType c: RecognitionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
