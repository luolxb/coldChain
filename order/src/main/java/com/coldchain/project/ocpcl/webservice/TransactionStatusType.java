
package com.coldchain.project.ocpcl.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>transactionStatusType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="transactionStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IN PROGRESS"/>
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="SUCCESS"/>
 *     &lt;enumeration value="FAILED"/>
 *     &lt;enumeration value="NO CHANGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "transactionStatusType", namespace = "http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11")
@XmlEnum
public enum TransactionStatusType {

    @XmlEnumValue("IN PROGRESS")
    IN_PROGRESS("IN PROGRESS"),
    PENDING("PENDING"),
    SUCCESS("SUCCESS"),
    FAILED("FAILED"),
    @XmlEnumValue("NO CHANGE")
    NO_CHANGE("NO CHANGE");
    private final String value;

    TransactionStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionStatusType fromValue(String v) {
        for (TransactionStatusType c: TransactionStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
