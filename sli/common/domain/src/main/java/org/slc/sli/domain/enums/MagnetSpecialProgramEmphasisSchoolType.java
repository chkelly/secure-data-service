package org.slc.sli.domain.enums;

import javax.xml.bind.annotation.XmlEnum;
//import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "MagnetSpecialProgramEmphasisSchoolType")
@XmlEnum
public enum MagnetSpecialProgramEmphasisSchoolType {

 //   @XmlEnumValue("All students participate")
    ALL_STUDENTS_PARTICIPATE("All students participate"),
 //   @XmlEnumValue("No students participate")
    NO_STUDENTS_PARTICIPATE("No students participate"),
 //   @XmlEnumValue("Some, but not all, students participate")
    SOME_BUT_NOT_ALL_STUDENTS_PARTICIPATE("Some, but not all, students participate"),
 //   @XmlEnumValue("Unknown")
    NULL("Unknown");
    private final String value;

    MagnetSpecialProgramEmphasisSchoolType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MagnetSpecialProgramEmphasisSchoolType fromValue(String v) {
        for (MagnetSpecialProgramEmphasisSchoolType c : MagnetSpecialProgramEmphasisSchoolType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
    @Override
    public String toString() {
    return value();
    }
}
