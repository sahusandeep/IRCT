/*
 *  This file is part of i2b2-Java-API.
 *
 *  The i2b2-Java-API is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  i2b2-Java-API is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with i2b2-Java-API.  If not, see <http://www.gnu.org/licenses/>.
 */

package edu.harvard.hms.dbmi.i2b2.api.crc.xml.loader;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for missing_term_report_responseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="missing_term_report_responseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="missing_term_report">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="concept_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}missing_term_set_reportType"/>
 *                   &lt;element name="observer_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}missing_term_set_reportType"/>
 *                   &lt;element name="modifier_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}missing_term_set_reportType"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="upload_id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="missing_codes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="concept_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}missing_codes_concept_setType"/>
 *                   &lt;element name="observer_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}missing_codes_observer_setType"/>
 *                   &lt;element name="modifier_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}missing_codes_modifier_setType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "missing_term_report_responseType", propOrder = {
    "missingTermReport",
    "missingCodes"
})
public class MissingTermReportResponseType {

    @XmlElement(name = "missing_term_report", required = true)
    protected MissingTermReportResponseType.MissingTermReport missingTermReport;
    @XmlElement(name = "missing_codes", required = true)
    protected MissingTermReportResponseType.MissingCodes missingCodes;

    /**
     * Gets the value of the missingTermReport property.
     * 
     * @return
     *     possible object is
     *     {@link MissingTermReportResponseType.MissingTermReport }
     *     
     */
    public MissingTermReportResponseType.MissingTermReport getMissingTermReport() {
        return missingTermReport;
    }

    /**
     * Sets the value of the missingTermReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link MissingTermReportResponseType.MissingTermReport }
     *     
     */
    public void setMissingTermReport(MissingTermReportResponseType.MissingTermReport value) {
        this.missingTermReport = value;
    }

    /**
     * Gets the value of the missingCodes property.
     * 
     * @return
     *     possible object is
     *     {@link MissingTermReportResponseType.MissingCodes }
     *     
     */
    public MissingTermReportResponseType.MissingCodes getMissingCodes() {
        return missingCodes;
    }

    /**
     * Sets the value of the missingCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link MissingTermReportResponseType.MissingCodes }
     *     
     */
    public void setMissingCodes(MissingTermReportResponseType.MissingCodes value) {
        this.missingCodes = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="concept_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}missing_codes_concept_setType"/>
     *         &lt;element name="observer_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}missing_codes_observer_setType"/>
     *         &lt;element name="modifier_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}missing_codes_modifier_setType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "conceptSet",
        "observerSet",
        "modifierSet"
    })
    public static class MissingCodes {

        @XmlElement(name = "concept_set", required = true)
        protected MissingCodesConceptSetType conceptSet;
        @XmlElement(name = "observer_set", required = true)
        protected MissingCodesObserverSetType observerSet;
        @XmlElement(name = "modifier_set", required = true)
        protected MissingCodesModifierSetType modifierSet;

        /**
         * Gets the value of the conceptSet property.
         * 
         * @return
         *     possible object is
         *     {@link MissingCodesConceptSetType }
         *     
         */
        public MissingCodesConceptSetType getConceptSet() {
            return conceptSet;
        }

        /**
         * Sets the value of the conceptSet property.
         * 
         * @param value
         *     allowed object is
         *     {@link MissingCodesConceptSetType }
         *     
         */
        public void setConceptSet(MissingCodesConceptSetType value) {
            this.conceptSet = value;
        }

        /**
         * Gets the value of the observerSet property.
         * 
         * @return
         *     possible object is
         *     {@link MissingCodesObserverSetType }
         *     
         */
        public MissingCodesObserverSetType getObserverSet() {
            return observerSet;
        }

        /**
         * Sets the value of the observerSet property.
         * 
         * @param value
         *     allowed object is
         *     {@link MissingCodesObserverSetType }
         *     
         */
        public void setObserverSet(MissingCodesObserverSetType value) {
            this.observerSet = value;
        }

        /**
         * Gets the value of the modifierSet property.
         * 
         * @return
         *     possible object is
         *     {@link MissingCodesModifierSetType }
         *     
         */
        public MissingCodesModifierSetType getModifierSet() {
            return modifierSet;
        }

        /**
         * Sets the value of the modifierSet property.
         * 
         * @param value
         *     allowed object is
         *     {@link MissingCodesModifierSetType }
         *     
         */
        public void setModifierSet(MissingCodesModifierSetType value) {
            this.modifierSet = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="concept_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}missing_term_set_reportType"/>
     *         &lt;element name="observer_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}missing_term_set_reportType"/>
     *         &lt;element name="modifier_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}missing_term_set_reportType"/>
     *       &lt;/sequence>
     *       &lt;attribute name="upload_id" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "conceptSet",
        "observerSet",
        "modifierSet"
    })
    public static class MissingTermReport {

        @XmlElement(name = "concept_set", required = true)
        protected MissingTermSetReportType conceptSet;
        @XmlElement(name = "observer_set", required = true)
        protected MissingTermSetReportType observerSet;
        @XmlElement(name = "modifier_set", required = true)
        protected MissingTermSetReportType modifierSet;
        @XmlAttribute(name = "upload_id")
        protected Integer uploadId;

        /**
         * Gets the value of the conceptSet property.
         * 
         * @return
         *     possible object is
         *     {@link MissingTermSetReportType }
         *     
         */
        public MissingTermSetReportType getConceptSet() {
            return conceptSet;
        }

        /**
         * Sets the value of the conceptSet property.
         * 
         * @param value
         *     allowed object is
         *     {@link MissingTermSetReportType }
         *     
         */
        public void setConceptSet(MissingTermSetReportType value) {
            this.conceptSet = value;
        }

        /**
         * Gets the value of the observerSet property.
         * 
         * @return
         *     possible object is
         *     {@link MissingTermSetReportType }
         *     
         */
        public MissingTermSetReportType getObserverSet() {
            return observerSet;
        }

        /**
         * Sets the value of the observerSet property.
         * 
         * @param value
         *     allowed object is
         *     {@link MissingTermSetReportType }
         *     
         */
        public void setObserverSet(MissingTermSetReportType value) {
            this.observerSet = value;
        }

        /**
         * Gets the value of the modifierSet property.
         * 
         * @return
         *     possible object is
         *     {@link MissingTermSetReportType }
         *     
         */
        public MissingTermSetReportType getModifierSet() {
            return modifierSet;
        }

        /**
         * Sets the value of the modifierSet property.
         * 
         * @param value
         *     allowed object is
         *     {@link MissingTermSetReportType }
         *     
         */
        public void setModifierSet(MissingTermSetReportType value) {
            this.modifierSet = value;
        }

        /**
         * Gets the value of the uploadId property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getUploadId() {
            return uploadId;
        }

        /**
         * Sets the value of the uploadId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setUploadId(Integer value) {
            this.uploadId = value;
        }

    }

}
