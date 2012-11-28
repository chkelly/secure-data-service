//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.16 at 01:39:34 PM EST 
//


package org.slc.sli.test.edfi.entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttendanceEventCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttendanceEventCategoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="In Attendance"/>
 *     &lt;enumeration value="Absence"/>
 *     &lt;enumeration value="Excused Absence"/>
 *     &lt;enumeration value="Unexcused Absence"/>
 *     &lt;enumeration value="Tardy"/>
 *     &lt;enumeration value="Early departure"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AttendanceEventCategoryType")
@XmlEnum
public enum AttendanceEventCategoryType {

    @XmlEnumValue("In Attendance")
    IN_ATTENDANCE("In Attendance"),
    @XmlEnumValue("Absence")
    ABSENCE("Absence"),
    @XmlEnumValue("Excused Absence")
    EXCUSED_ABSENCE("Excused Absence"),
    @XmlEnumValue("Unexcused Absence")
    UNEXCUSED_ABSENCE("Unexcused Absence"),
    @XmlEnumValue("Tardy")
    TARDY("Tardy"),
    @XmlEnumValue("Early departure")
    EARLY_DEPARTURE("Early departure");
    private final String value;

    AttendanceEventCategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AttendanceEventCategoryType fromValue(String v) {
        for (AttendanceEventCategoryType c: AttendanceEventCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
