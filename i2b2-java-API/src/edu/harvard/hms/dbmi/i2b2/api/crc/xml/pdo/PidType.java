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

package edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for pidType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pidType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="patient_id">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.i2b2.org/xsd/hive/pdo/1.1/>patientIdType">
 *                 &lt;attGroup ref="{http://www.i2b2.org/xsd/hive/pdo/1.1/}techDataAttributeGroup"/>
 *                 &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="patient_map_id" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attGroup ref="{http://www.i2b2.org/xsd/hive/pdo/1.1/}techDataAttributeGroup"/>
 *                 &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" default="HIVE" />
 *                 &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
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
@XmlType(name = "pidType", namespace = "http://www.i2b2.org/xsd/hive/pdo/1.1/", propOrder = {
    "patientId",
    "patientMapId"
})
public class PidType {

    @XmlElement(name = "patient_id", required = true)
    protected PidType.PatientId patientId;
    @XmlElement(name = "patient_map_id")
    protected List<PidType.PatientMapId> patientMapId;

    /**
     * Gets the value of the patientId property.
     * 
     * @return
     *     possible object is
     *     {@link PidType.PatientId }
     *     
     */
    public PidType.PatientId getPatientId() {
        return patientId;
    }

    /**
     * Sets the value of the patientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PidType.PatientId }
     *     
     */
    public void setPatientId(PidType.PatientId value) {
        this.patientId = value;
    }

    /**
     * Gets the value of the patientMapId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the patientMapId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPatientMapId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PidType.PatientMapId }
     * 
     * 
     */
    public List<PidType.PatientMapId> getPatientMapId() {
        if (patientMapId == null) {
            patientMapId = new ArrayList<PidType.PatientMapId>();
        }
        return this.patientMapId;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.i2b2.org/xsd/hive/pdo/1.1/>patientIdType">
     *       &lt;attGroup ref="{http://www.i2b2.org/xsd/hive/pdo/1.1/}techDataAttributeGroup"/>
     *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PatientId
        extends PatientIdType
    {

        @XmlAttribute(name = "status")
        protected String status;
        @XmlAttribute(name = "update_date")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar updateDate;
        @XmlAttribute(name = "download_date")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar downloadDate;
        @XmlAttribute(name = "import_date")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar importDate;
        @XmlAttribute(name = "sourcesystem_cd")
        protected String sourcesystemCd;
        @XmlAttribute(name = "upload_id")
        protected String uploadId;

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * Gets the value of the updateDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getUpdateDate() {
            return updateDate;
        }

        /**
         * Sets the value of the updateDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setUpdateDate(XMLGregorianCalendar value) {
            this.updateDate = value;
        }

        /**
         * Gets the value of the downloadDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDownloadDate() {
            return downloadDate;
        }

        /**
         * Sets the value of the downloadDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDownloadDate(XMLGregorianCalendar value) {
            this.downloadDate = value;
        }

        /**
         * Gets the value of the importDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getImportDate() {
            return importDate;
        }

        /**
         * Sets the value of the importDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setImportDate(XMLGregorianCalendar value) {
            this.importDate = value;
        }

        /**
         * Gets the value of the sourcesystemCd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSourcesystemCd() {
            return sourcesystemCd;
        }

        /**
         * Sets the value of the sourcesystemCd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSourcesystemCd(String value) {
            this.sourcesystemCd = value;
        }

        /**
         * Gets the value of the uploadId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUploadId() {
            return uploadId;
        }

        /**
         * Sets the value of the uploadId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUploadId(String value) {
            this.uploadId = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attGroup ref="{http://www.i2b2.org/xsd/hive/pdo/1.1/}techDataAttributeGroup"/>
     *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" default="HIVE" />
     *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class PatientMapId {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "source")
        protected String source;
        @XmlAttribute(name = "status")
        protected String status;
        @XmlAttribute(name = "update_date")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar updateDate;
        @XmlAttribute(name = "download_date")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar downloadDate;
        @XmlAttribute(name = "import_date")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar importDate;
        @XmlAttribute(name = "sourcesystem_cd")
        protected String sourcesystemCd;
        @XmlAttribute(name = "upload_id")
        protected String uploadId;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the source property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            if (source == null) {
                return "HIVE";
            } else {
                return source;
            }
        }

        /**
         * Sets the value of the source property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * Gets the value of the updateDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getUpdateDate() {
            return updateDate;
        }

        /**
         * Sets the value of the updateDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setUpdateDate(XMLGregorianCalendar value) {
            this.updateDate = value;
        }

        /**
         * Gets the value of the downloadDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDownloadDate() {
            return downloadDate;
        }

        /**
         * Sets the value of the downloadDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDownloadDate(XMLGregorianCalendar value) {
            this.downloadDate = value;
        }

        /**
         * Gets the value of the importDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getImportDate() {
            return importDate;
        }

        /**
         * Sets the value of the importDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setImportDate(XMLGregorianCalendar value) {
            this.importDate = value;
        }

        /**
         * Gets the value of the sourcesystemCd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSourcesystemCd() {
            return sourcesystemCd;
        }

        /**
         * Sets the value of the sourcesystemCd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSourcesystemCd(String value) {
            this.sourcesystemCd = value;
        }

        /**
         * Gets the value of the uploadId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUploadId() {
            return uploadId;
        }

        /**
         * Sets the value of the uploadId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUploadId(String value) {
            this.uploadId = value;
        }

    }

}
