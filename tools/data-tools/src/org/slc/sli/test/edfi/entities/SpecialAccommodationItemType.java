/*
 * Copyright 2012 Shared Learning Collaborative, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.05.31 at 09:35:49 AM EDT 
//


package org.slc.sli.test.edfi.entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialAccommodationItemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpecialAccommodationItemType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Presentation"/>
 *     &lt;enumeration value="Response"/>
 *     &lt;enumeration value="Setting"/>
 *     &lt;enumeration value="Timing and Scheduling"/>
 *     &lt;enumeration value="Large Print"/>
 *     &lt;enumeration value="Dyslexia Bundled"/>
 *     &lt;enumeration value="Oral Administration"/>
 *     &lt;enumeration value="Adjustable swivel arm"/>
 *     &lt;enumeration value="Adjustable table height"/>
 *     &lt;enumeration value="Braille"/>
 *     &lt;enumeration value="Enlarged monitor view"/>
 *     &lt;enumeration value="Extra time"/>
 *     &lt;enumeration value="Large print booklet"/>
 *     &lt;enumeration value="Multi-day administration"/>
 *     &lt;enumeration value="Recorder or amanuensis"/>
 *     &lt;enumeration value="Separate room"/>
 *     &lt;enumeration value="Signer/sign language interpreter"/>
 *     &lt;enumeration value="Special furniture"/>
 *     &lt;enumeration value="Special lighting"/>
 *     &lt;enumeration value="Track ball"/>
 *     &lt;enumeration value="Untimed"/>
 *     &lt;enumeration value="Enlarged keyboard"/>
 *     &lt;enumeration value="Additional example items/tasks"/>
 *     &lt;enumeration value="Administration in several sessions"/>
 *     &lt;enumeration value="Answers written directly in test booklet"/>
 *     &lt;enumeration value="Assessment in native language"/>
 *     &lt;enumeration value="Arithmetic table (math or science)"/>
 *     &lt;enumeration value="Assistive device that does not interfere with independent work of the student"/>
 *     &lt;enumeration value="Assistive device that does interfere with independent work of the student"/>
 *     &lt;enumeration value="Audiotape or CD"/>
 *     &lt;enumeration value="Audio cassette player"/>
 *     &lt;enumeration value="Braille writer, no thesaurus, spell- or grammar-checker"/>
 *     &lt;enumeration value="Breaks during testing"/>
 *     &lt;enumeration value="Calculator (math or science)"/>
 *     &lt;enumeration value="Clarify directions"/>
 *     &lt;enumeration value="Colored lenses"/>
 *     &lt;enumeration value="Computer administration"/>
 *     &lt;enumeration value="Cranmer abacus"/>
 *     &lt;enumeration value="Cueing"/>
 *     &lt;enumeration value="Dictionary in English"/>
 *     &lt;enumeration value="Dictionary in native language"/>
 *     &lt;enumeration value="Dictated oral repsonse (to a proctor)"/>
 *     &lt;enumeration value="Directions read aloud or explained"/>
 *     &lt;enumeration value="Examiner familiarity"/>
 *     &lt;enumeration value="Font enlarged beyond print version requirements"/>
 *     &lt;enumeration value="Foreign language interpreter"/>
 *     &lt;enumeration value="Foreign language interpreter for instructions, ask questions"/>
 *     &lt;enumeration value="Format"/>
 *     &lt;enumeration value="Hospital/home testing"/>
 *     &lt;enumeration value="Linguistic modification of test directions"/>
 *     &lt;enumeration value="Magnification device"/>
 *     &lt;enumeration value="Manually coded English or American Sign Language to present test questions"/>
 *     &lt;enumeration value="Math manipulatives (math or science)"/>
 *     &lt;enumeration value="Modification of linguistic complexity"/>
 *     &lt;enumeration value="Multiple test sessions"/>
 *     &lt;enumeration value="Oral directions in the native language"/>
 *     &lt;enumeration value="Paraphrasing"/>
 *     &lt;enumeration value="Physical supports"/>
 *     &lt;enumeration value="Response dictated in American Sign Language"/>
 *     &lt;enumeration value="Response in native language"/>
 *     &lt;enumeration value="Scheduled extended time"/>
 *     &lt;enumeration value="Separate room with other English Learners under supervision of district employee"/>
 *     &lt;enumeration value="Signer/sign language for instructions, ask questions"/>
 *     &lt;enumeration value="Simplified language"/>
 *     &lt;enumeration value="Small-group or individual administration"/>
 *     &lt;enumeration value="Speech recognition system"/>
 *     &lt;enumeration value="Spell-checker"/>
 *     &lt;enumeration value="Specialized setting"/>
 *     &lt;enumeration value="Student read aloud"/>
 *     &lt;enumeration value="Student-requested extended time"/>
 *     &lt;enumeration value="Supervised test breaks"/>
 *     &lt;enumeration value="Technological aid"/>
 *     &lt;enumeration value="Test administrator marked / wrote test at student's direction"/>
 *     &lt;enumeration value="Test adminstrator read questions aloud"/>
 *     &lt;enumeration value="Test administered at best time of day for student handwriting issues"/>
 *     &lt;enumeration value="Text changes in vocabulary"/>
 *     &lt;enumeration value="Translation dictionary"/>
 *     &lt;enumeration value="Verbalized problem-solving"/>
 *     &lt;enumeration value="Video cassette"/>
 *     &lt;enumeration value="Visual cues"/>
 *     &lt;enumeration value="Word processor"/>
 *     &lt;enumeration value="Word processor / typewriter / computer with thesaurus / spell-checker / grammar-checker turned off"/>
 *     &lt;enumeration value="Word processor / typewriter / computer with thesaurus/ spell-checker/ grammar-checker enabled on essay response portion of test"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpecialAccommodationItemType")
@XmlEnum
public enum SpecialAccommodationItemType {

    @XmlEnumValue("Presentation")
    PRESENTATION("Presentation"),
    @XmlEnumValue("Response")
    RESPONSE("Response"),
    @XmlEnumValue("Setting")
    SETTING("Setting"),
    @XmlEnumValue("Timing and Scheduling")
    TIMING_AND_SCHEDULING("Timing and Scheduling"),
    @XmlEnumValue("Large Print")
    LARGE_PRINT("Large Print"),
    @XmlEnumValue("Dyslexia Bundled")
    DYSLEXIA_BUNDLED("Dyslexia Bundled"),
    @XmlEnumValue("Oral Administration")
    ORAL_ADMINISTRATION("Oral Administration"),
    @XmlEnumValue("Adjustable swivel arm")
    ADJUSTABLE_SWIVEL_ARM("Adjustable swivel arm"),
    @XmlEnumValue("Adjustable table height")
    ADJUSTABLE_TABLE_HEIGHT("Adjustable table height"),
    @XmlEnumValue("Braille")
    BRAILLE("Braille"),
    @XmlEnumValue("Enlarged monitor view")
    ENLARGED_MONITOR_VIEW("Enlarged monitor view"),
    @XmlEnumValue("Extra time")
    EXTRA_TIME("Extra time"),
    @XmlEnumValue("Large print booklet")
    LARGE_PRINT_BOOKLET("Large print booklet"),
    @XmlEnumValue("Multi-day administration")
    MULTI_DAY_ADMINISTRATION("Multi-day administration"),
    @XmlEnumValue("Recorder or amanuensis")
    RECORDER_OR_AMANUENSIS("Recorder or amanuensis"),
    @XmlEnumValue("Separate room")
    SEPARATE_ROOM("Separate room"),
    @XmlEnumValue("Signer/sign language interpreter")
    SIGNER_SIGN_LANGUAGE_INTERPRETER("Signer/sign language interpreter"),
    @XmlEnumValue("Special furniture")
    SPECIAL_FURNITURE("Special furniture"),
    @XmlEnumValue("Special lighting")
    SPECIAL_LIGHTING("Special lighting"),
    @XmlEnumValue("Track ball")
    TRACK_BALL("Track ball"),
    @XmlEnumValue("Untimed")
    UNTIMED("Untimed"),
    @XmlEnumValue("Enlarged keyboard")
    ENLARGED_KEYBOARD("Enlarged keyboard"),
    @XmlEnumValue("Additional example items/tasks")
    ADDITIONAL_EXAMPLE_ITEMS_TASKS("Additional example items/tasks"),
    @XmlEnumValue("Administration in several sessions")
    ADMINISTRATION_IN_SEVERAL_SESSIONS("Administration in several sessions"),
    @XmlEnumValue("Answers written directly in test booklet")
    ANSWERS_WRITTEN_DIRECTLY_IN_TEST_BOOKLET("Answers written directly in test booklet"),
    @XmlEnumValue("Assessment in native language")
    ASSESSMENT_IN_NATIVE_LANGUAGE("Assessment in native language"),
    @XmlEnumValue("Arithmetic table (math or science)")
    ARITHMETIC_TABLE_MATH_OR_SCIENCE("Arithmetic table (math or science)"),
    @XmlEnumValue("Assistive device that does not interfere with independent work of the student")
    ASSISTIVE_DEVICE_THAT_DOES_NOT_INTERFERE_WITH_INDEPENDENT_WORK_OF_THE_STUDENT("Assistive device that does not interfere with independent work of the student"),
    @XmlEnumValue("Assistive device that does interfere with independent work of the student")
    ASSISTIVE_DEVICE_THAT_DOES_INTERFERE_WITH_INDEPENDENT_WORK_OF_THE_STUDENT("Assistive device that does interfere with independent work of the student"),
    @XmlEnumValue("Audiotape or CD")
    AUDIOTAPE_OR_CD("Audiotape or CD"),
    @XmlEnumValue("Audio cassette player")
    AUDIO_CASSETTE_PLAYER("Audio cassette player"),
    @XmlEnumValue("Braille writer, no thesaurus, spell- or grammar-checker")
    BRAILLE_WRITER_NO_THESAURUS_SPELL_OR_GRAMMAR_CHECKER("Braille writer, no thesaurus, spell- or grammar-checker"),
    @XmlEnumValue("Breaks during testing")
    BREAKS_DURING_TESTING("Breaks during testing"),
    @XmlEnumValue("Calculator (math or science)")
    CALCULATOR_MATH_OR_SCIENCE("Calculator (math or science)"),
    @XmlEnumValue("Clarify directions")
    CLARIFY_DIRECTIONS("Clarify directions"),
    @XmlEnumValue("Colored lenses")
    COLORED_LENSES("Colored lenses"),
    @XmlEnumValue("Computer administration")
    COMPUTER_ADMINISTRATION("Computer administration"),
    @XmlEnumValue("Cranmer abacus")
    CRANMER_ABACUS("Cranmer abacus"),
    @XmlEnumValue("Cueing")
    CUEING("Cueing"),
    @XmlEnumValue("Dictionary in English")
    DICTIONARY_IN_ENGLISH("Dictionary in English"),
    @XmlEnumValue("Dictionary in native language")
    DICTIONARY_IN_NATIVE_LANGUAGE("Dictionary in native language"),
    @XmlEnumValue("Dictated oral repsonse (to a proctor)")
    DICTATED_ORAL_REPSONSE_TO_A_PROCTOR("Dictated oral repsonse (to a proctor)"),
    @XmlEnumValue("Directions read aloud or explained")
    DIRECTIONS_READ_ALOUD_OR_EXPLAINED("Directions read aloud or explained"),
    @XmlEnumValue("Examiner familiarity")
    EXAMINER_FAMILIARITY("Examiner familiarity"),
    @XmlEnumValue("Font enlarged beyond print version requirements")
    FONT_ENLARGED_BEYOND_PRINT_VERSION_REQUIREMENTS("Font enlarged beyond print version requirements"),
    @XmlEnumValue("Foreign language interpreter")
    FOREIGN_LANGUAGE_INTERPRETER("Foreign language interpreter"),
    @XmlEnumValue("Foreign language interpreter for instructions, ask questions")
    FOREIGN_LANGUAGE_INTERPRETER_FOR_INSTRUCTIONS_ASK_QUESTIONS("Foreign language interpreter for instructions, ask questions"),
    @XmlEnumValue("Format")
    FORMAT("Format"),
    @XmlEnumValue("Hospital/home testing")
    HOSPITAL_HOME_TESTING("Hospital/home testing"),
    @XmlEnumValue("Linguistic modification of test directions")
    LINGUISTIC_MODIFICATION_OF_TEST_DIRECTIONS("Linguistic modification of test directions"),
    @XmlEnumValue("Magnification device")
    MAGNIFICATION_DEVICE("Magnification device"),
    @XmlEnumValue("Manually coded English or American Sign Language to present test questions")
    MANUALLY_CODED_ENGLISH_OR_AMERICAN_SIGN_LANGUAGE_TO_PRESENT_TEST_QUESTIONS("Manually coded English or American Sign Language to present test questions"),
    @XmlEnumValue("Math manipulatives (math or science)")
    MATH_MANIPULATIVES_MATH_OR_SCIENCE("Math manipulatives (math or science)"),
    @XmlEnumValue("Modification of linguistic complexity")
    MODIFICATION_OF_LINGUISTIC_COMPLEXITY("Modification of linguistic complexity"),
    @XmlEnumValue("Multiple test sessions")
    MULTIPLE_TEST_SESSIONS("Multiple test sessions"),
    @XmlEnumValue("Oral directions in the native language")
    ORAL_DIRECTIONS_IN_THE_NATIVE_LANGUAGE("Oral directions in the native language"),
    @XmlEnumValue("Paraphrasing")
    PARAPHRASING("Paraphrasing"),
    @XmlEnumValue("Physical supports")
    PHYSICAL_SUPPORTS("Physical supports"),
    @XmlEnumValue("Response dictated in American Sign Language")
    RESPONSE_DICTATED_IN_AMERICAN_SIGN_LANGUAGE("Response dictated in American Sign Language"),
    @XmlEnumValue("Response in native language")
    RESPONSE_IN_NATIVE_LANGUAGE("Response in native language"),
    @XmlEnumValue("Scheduled extended time")
    SCHEDULED_EXTENDED_TIME("Scheduled extended time"),
    @XmlEnumValue("Separate room with other English Learners under supervision of district employee")
    SEPARATE_ROOM_WITH_OTHER_ENGLISH_LEARNERS_UNDER_SUPERVISION_OF_DISTRICT_EMPLOYEE("Separate room with other English Learners under supervision of district employee"),
    @XmlEnumValue("Signer/sign language for instructions, ask questions")
    SIGNER_SIGN_LANGUAGE_FOR_INSTRUCTIONS_ASK_QUESTIONS("Signer/sign language for instructions, ask questions"),
    @XmlEnumValue("Simplified language")
    SIMPLIFIED_LANGUAGE("Simplified language"),
    @XmlEnumValue("Small-group or individual administration")
    SMALL_GROUP_OR_INDIVIDUAL_ADMINISTRATION("Small-group or individual administration"),
    @XmlEnumValue("Speech recognition system")
    SPEECH_RECOGNITION_SYSTEM("Speech recognition system"),
    @XmlEnumValue("Spell-checker")
    SPELL_CHECKER("Spell-checker"),
    @XmlEnumValue("Specialized setting")
    SPECIALIZED_SETTING("Specialized setting"),
    @XmlEnumValue("Student read aloud")
    STUDENT_READ_ALOUD("Student read aloud"),
    @XmlEnumValue("Student-requested extended time")
    STUDENT_REQUESTED_EXTENDED_TIME("Student-requested extended time"),
    @XmlEnumValue("Supervised test breaks")
    SUPERVISED_TEST_BREAKS("Supervised test breaks"),
    @XmlEnumValue("Technological aid")
    TECHNOLOGICAL_AID("Technological aid"),
    @XmlEnumValue("Test administrator marked / wrote test at student's direction")
    TEST_ADMINISTRATOR_MARKED_WROTE_TEST_AT_STUDENT_S_DIRECTION("Test administrator marked / wrote test at student's direction"),
    @XmlEnumValue("Test adminstrator read questions aloud")
    TEST_ADMINSTRATOR_READ_QUESTIONS_ALOUD("Test adminstrator read questions aloud"),
    @XmlEnumValue("Test administered at best time of day for student handwriting issues")
    TEST_ADMINISTERED_AT_BEST_TIME_OF_DAY_FOR_STUDENT_HANDWRITING_ISSUES("Test administered at best time of day for student handwriting issues"),
    @XmlEnumValue("Text changes in vocabulary")
    TEXT_CHANGES_IN_VOCABULARY("Text changes in vocabulary"),
    @XmlEnumValue("Translation dictionary")
    TRANSLATION_DICTIONARY("Translation dictionary"),
    @XmlEnumValue("Verbalized problem-solving")
    VERBALIZED_PROBLEM_SOLVING("Verbalized problem-solving"),
    @XmlEnumValue("Video cassette")
    VIDEO_CASSETTE("Video cassette"),
    @XmlEnumValue("Visual cues")
    VISUAL_CUES("Visual cues"),
    @XmlEnumValue("Word processor")
    WORD_PROCESSOR("Word processor"),
    @XmlEnumValue("Word processor / typewriter / computer with thesaurus / spell-checker / grammar-checker turned off")
    WORD_PROCESSOR_TYPEWRITER_COMPUTER_WITH_THESAURUS_SPELL_CHECKER_GRAMMAR_CHECKER_TURNED_OFF("Word processor / typewriter / computer with thesaurus / spell-checker / grammar-checker turned off"),
    @XmlEnumValue("Word processor / typewriter / computer with thesaurus/ spell-checker/ grammar-checker enabled on essay response portion of test")
    WORD_PROCESSOR_TYPEWRITER_COMPUTER_WITH_THESAURUS_SPELL_CHECKER_GRAMMAR_CHECKER_ENABLED_ON_ESSAY_RESPONSE_PORTION_OF_TEST("Word processor / typewriter / computer with thesaurus/ spell-checker/ grammar-checker enabled on essay response portion of test"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    SpecialAccommodationItemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpecialAccommodationItemType fromValue(String v) {
        for (SpecialAccommodationItemType c: SpecialAccommodationItemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
