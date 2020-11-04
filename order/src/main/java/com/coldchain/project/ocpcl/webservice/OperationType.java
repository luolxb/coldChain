
package com.coldchain.project.ocpcl.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>operationType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="operationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ASSIGN"/>
 *     &lt;enumeration value="ACTIVATE"/>
 *     &lt;enumeration value="CHANGE"/>
 *     &lt;enumeration value="SUSPEND"/>
 *     &lt;enumeration value="UNSUSPEND"/>
 *     &lt;enumeration value="DEACTIVATE"/>
 *     &lt;enumeration value="SWAP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "operationType", namespace = "http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11")
@XmlEnum
public enum OperationType {

    ASSIGN,
    ACTIVATE,
    CHANGE,
    SUSPEND,
    UNSUSPEND,
    DEACTIVATE,
    SWAP;

    public String value() {
        return name();
    }

    public static OperationType fromValue(String v) {
        return valueOf(v);
    }

}
