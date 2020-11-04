
package com.coldchain.project.ocpcl.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>statusType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="statusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVENTORY"/>
 *     &lt;enumeration value="TEST"/>
 *     &lt;enumeration value="READY"/>
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="INACTIVE"/>
 *     &lt;enumeration value="SUSPENDED"/>
 *     &lt;enumeration value="BLOCKED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statusType", namespace = "http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11")
@XmlEnum
public enum StatusType {

    INVENTORY,
    TEST,
    READY,
    ACTIVE,
    INACTIVE,
    SUSPENDED,
    BLOCKED;

    public String value() {
        return name();
    }

    public static StatusType fromValue(String v) {
        return valueOf(v);
    }

}
