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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for data_listType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="data_listType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="location_uri">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="protocol_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="data_format_type" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}dataFormatType"/>
 *         &lt;element name="source_system_cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="load_label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transform_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "data_listType", propOrder = {
    "locationUri",
    "dataFormatType",
    "sourceSystemCd",
    "loadLabel",
    "transformName"
})
public class DataListType {

    @XmlElement(name = "location_uri", required = true)
    protected DataListType.LocationUri locationUri;
    @XmlElement(name = "data_format_type", required = true, defaultValue = "PDO")
    @XmlSchemaType(name = "string")
    protected DataFormatType dataFormatType;
    @XmlElement(name = "source_system_cd", required = true)
    protected String sourceSystemCd;
    @XmlElement(name = "load_label", required = true)
    protected String loadLabel;
    @XmlElement(name = "transform_name", required = true)
    protected String transformName;

    /**
     * Gets the value of the locationUri property.
     * 
     * @return
     *     possible object is
     *     {@link DataListType.LocationUri }
     *     
     */
    public DataListType.LocationUri getLocationUri() {
        return locationUri;
    }

    /**
     * Sets the value of the locationUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataListType.LocationUri }
     *     
     */
    public void setLocationUri(DataListType.LocationUri value) {
        this.locationUri = value;
    }

    /**
     * Gets the value of the dataFormatType property.
     * 
     * @return
     *     possible object is
     *     {@link DataFormatType }
     *     
     */
    public DataFormatType getDataFormatType() {
        return dataFormatType;
    }

    /**
     * Sets the value of the dataFormatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataFormatType }
     *     
     */
    public void setDataFormatType(DataFormatType value) {
        this.dataFormatType = value;
    }

    /**
     * Gets the value of the sourceSystemCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystemCd() {
        return sourceSystemCd;
    }

    /**
     * Sets the value of the sourceSystemCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystemCd(String value) {
        this.sourceSystemCd = value;
    }

    /**
     * Gets the value of the loadLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadLabel() {
        return loadLabel;
    }

    /**
     * Sets the value of the loadLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadLabel(String value) {
        this.loadLabel = value;
    }

    /**
     * Gets the value of the transformName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransformName() {
        return transformName;
    }

    /**
     * Sets the value of the transformName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransformName(String value) {
        this.transformName = value;
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
     *       &lt;attribute name="protocol_name" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class LocationUri {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "protocol_name")
        protected String protocolName;

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
         * Gets the value of the protocolName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProtocolName() {
            return protocolName;
        }

        /**
         * Sets the value of the protocolName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProtocolName(String value) {
            this.protocolName = value;
        }

    }

}
