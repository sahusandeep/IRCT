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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outputOptionTimeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="outputOptionTimeType">
 *   &lt;restriction base="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}tokenType">
 *     &lt;enumeration value="nozone"/>
 *     &lt;enumeration value="withzone"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "outputOptionTimeType")
@XmlEnum
public enum OutputOptionTimeType {


    /**
     * No Zone
     * 
     */
    @XmlEnumValue("nozone")
    NOZONE("nozone"),

    /**
     * With Zone
     * 
     */
    @XmlEnumValue("withzone")
    WITHZONE("withzone");
    private final String value;

    OutputOptionTimeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutputOptionTimeType fromValue(String v) {
        for (OutputOptionTimeType c: OutputOptionTimeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
