
package com.coldchain.project.ocpcl.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tmobileRoamingType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="tmobileRoamingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INTL"/>
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="US_CAN"/>
 *     &lt;enumeration value="US"/>
 *     &lt;enumeration value="NOROAM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tmobileRoamingType", namespace = "http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11")
@XmlEnum
public enum TmobileRoamingType {

    INTL,
    NA,
    US_CAN,
    US,
    NOROAM;

    public String value() {
        return name();
    }

    public static TmobileRoamingType fromValue(String v) {
        return valueOf(v);
    }

}
