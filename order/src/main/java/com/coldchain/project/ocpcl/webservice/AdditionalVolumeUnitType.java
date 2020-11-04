
package com.coldchain.project.ocpcl.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>additionalVolumeUnitType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="additionalVolumeUnitType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="KB"/>
 *     &lt;enumeration value="MB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "additionalVolumeUnitType", namespace = "http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11")
@XmlEnum
public enum AdditionalVolumeUnitType {

    KB,
    MB;

    public String value() {
        return name();
    }

    public static AdditionalVolumeUnitType fromValue(String v) {
        return valueOf(v);
    }

}
