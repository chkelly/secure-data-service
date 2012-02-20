//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.20 at 03:58:29 AM EST 
//


package org.slc.sli.ingestion.jaxb.domain.sli;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This entity holds the score and or performance
 * 				levels earned for an objective assessment by a student.
 * 			
 * 
 * <p>Java class for studentObjectiveAssessment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="studentObjectiveAssessment">
 *   &lt;complexContent>
 *     &lt;extension base="{}complexObjectType">
 *       &lt;sequence>
 *         &lt;element name="scoreResults" type="{}scoreResult" maxOccurs="unbounded"/>
 *         &lt;element name="performanceLevelDescriptors" type="{}performanceLevelDescriptor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="objectiveAssessment" type="{}objectiveAssessment"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "studentObjectiveAssessment", propOrder = {
    "scoreResults",
    "performanceLevelDescriptors",
    "objectiveAssessment"
})
public class StudentObjectiveAssessment
    extends ComplexObjectType
{

    @XmlElement(required = true)
    protected List<ScoreResult> scoreResults;
    protected List<PerformanceLevelDescriptor> performanceLevelDescriptors;
    @XmlElement(required = true)
    protected ObjectiveAssessment objectiveAssessment;

    /**
     * Gets the value of the scoreResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScoreResult }
     * 
     * 
     */
    public List<ScoreResult> getScoreResults() {
        if (scoreResults == null) {
            scoreResults = new ArrayList<ScoreResult>();
        }
        return this.scoreResults;
    }

    /**
     * Gets the value of the performanceLevelDescriptors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the performanceLevelDescriptors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerformanceLevelDescriptors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerformanceLevelDescriptor }
     * 
     * 
     */
    public List<PerformanceLevelDescriptor> getPerformanceLevelDescriptors() {
        if (performanceLevelDescriptors == null) {
            performanceLevelDescriptors = new ArrayList<PerformanceLevelDescriptor>();
        }
        return this.performanceLevelDescriptors;
    }

    /**
     * Gets the value of the objectiveAssessment property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectiveAssessment }
     *     
     */
    public ObjectiveAssessment getObjectiveAssessment() {
        return objectiveAssessment;
    }

    /**
     * Sets the value of the objectiveAssessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectiveAssessment }
     *     
     */
    public void setObjectiveAssessment(ObjectiveAssessment value) {
        this.objectiveAssessment = value;
    }

}
