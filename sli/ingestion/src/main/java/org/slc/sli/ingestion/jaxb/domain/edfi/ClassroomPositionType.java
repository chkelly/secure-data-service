//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.20 at 03:58:00 AM EST 
//


package org.slc.sli.ingestion.jaxb.domain.edfi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClassroomPositionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClassroomPositionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Teacher of Record"/>
 *     &lt;enumeration value="Assistant Teacher"/>
 *     &lt;enumeration value="Support Teacher"/>
 *     &lt;enumeration value="Substitute Teacher"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClassroomPositionType")
@XmlEnum
public enum ClassroomPositionType {

    @XmlEnumValue("Teacher of Record")
    TEACHER_OF_RECORD("Teacher of Record"),
    @XmlEnumValue("Assistant Teacher")
    ASSISTANT_TEACHER("Assistant Teacher"),
    @XmlEnumValue("Support Teacher")
    SUPPORT_TEACHER("Support Teacher"),
    @XmlEnumValue("Substitute Teacher")
    SUBSTITUTE_TEACHER("Substitute Teacher");
    private final String value;

    ClassroomPositionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClassroomPositionType fromValue(String v) {
        for (ClassroomPositionType c: ClassroomPositionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
