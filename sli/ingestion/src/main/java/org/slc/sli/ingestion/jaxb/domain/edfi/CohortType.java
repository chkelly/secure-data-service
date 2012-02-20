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
 * <p>Java class for CohortType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CohortType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Academic Intervention"/>
 *     &lt;enumeration value="Attendance Intervention"/>
 *     &lt;enumeration value="Discipline Intervention"/>
 *     &lt;enumeration value="Classroom Pullout"/>
 *     &lt;enumeration value="Extracurricular Activity"/>
 *     &lt;enumeration value="Field Trip"/>
 *     &lt;enumeration value="Principal Watch List"/>
 *     &lt;enumeration value="Counselor List"/>
 *     &lt;enumeration value="In-school Suspension"/>
 *     &lt;enumeration value="Study Hall"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CohortType")
@XmlEnum
public enum CohortType {

    @XmlEnumValue("Academic Intervention")
    ACADEMIC_INTERVENTION("Academic Intervention"),
    @XmlEnumValue("Attendance Intervention")
    ATTENDANCE_INTERVENTION("Attendance Intervention"),
    @XmlEnumValue("Discipline Intervention")
    DISCIPLINE_INTERVENTION("Discipline Intervention"),
    @XmlEnumValue("Classroom Pullout")
    CLASSROOM_PULLOUT("Classroom Pullout"),
    @XmlEnumValue("Extracurricular Activity")
    EXTRACURRICULAR_ACTIVITY("Extracurricular Activity"),
    @XmlEnumValue("Field Trip")
    FIELD_TRIP("Field Trip"),
    @XmlEnumValue("Principal Watch List")
    PRINCIPAL_WATCH_LIST("Principal Watch List"),
    @XmlEnumValue("Counselor List")
    COUNSELOR_LIST("Counselor List"),
    @XmlEnumValue("In-school Suspension")
    IN_SCHOOL_SUSPENSION("In-school Suspension"),
    @XmlEnumValue("Study Hall")
    STUDY_HALL("Study Hall"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    CohortType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CohortType fromValue(String v) {
        for (CohortType c: CohortType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
