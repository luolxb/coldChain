
package com.coldchain.project.ocpcl.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>operationStatusType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="operationStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IN PROGRESS"/>
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="COMPLETED"/>
 *     &lt;enumeration value="COMPLETED WITH FAILURES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "operationStatusType", namespace = "http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11")
@XmlEnum
public enum OperationStatusType {

    @XmlEnumValue("IN PROGRESS")
    IN_PROGRESS("IN PROGRESS"),
    PENDING("PENDING"),
    COMPLETED("COMPLETED"),
    @XmlEnumValue("COMPLETED WITH FAILURES")
    COMPLETED_WITH_FAILURES("COMPLETED WITH FAILURES");
    private final String value;

    OperationStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperationStatusType fromValue(String v) {
        for (OperationStatusType c: OperationStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
