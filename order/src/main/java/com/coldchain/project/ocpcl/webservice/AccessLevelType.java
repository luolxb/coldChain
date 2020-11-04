
package com.coldchain.project.ocpcl.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>accessLevelType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="accessLevelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ORBCOMM"/>
 *     &lt;enumeration value="ENTERPRISE"/>
 *     &lt;enumeration value="ORGANIZATION"/>
 *     &lt;enumeration value="ACCOUNT"/>
 *     &lt;enumeration value="SUBACCOUNT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "accessLevelType", namespace = "http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11")
@XmlEnum
public enum AccessLevelType {

    ORBCOMM,
    ENTERPRISE,
    ORGANIZATION,
    ACCOUNT,
    SUBACCOUNT;

    public String value() {
        return name();
    }

    public static AccessLevelType fromValue(String v) {
        return valueOf(v);
    }

}
