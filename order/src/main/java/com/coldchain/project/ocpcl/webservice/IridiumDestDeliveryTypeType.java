
package com.coldchain.project.ocpcl.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>iridiumDestDeliveryTypeType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="iridiumDestDeliveryTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IP"/>
 *     &lt;enumeration value="EMAIL"/>
 *     &lt;enumeration value="IRIDIUM_DEVICE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "iridiumDestDeliveryTypeType", namespace = "http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11")
@XmlEnum
public enum IridiumDestDeliveryTypeType {

    IP,
    EMAIL,
    IRIDIUM_DEVICE;

    public String value() {
        return name();
    }

    public static IridiumDestDeliveryTypeType fromValue(String v) {
        return valueOf(v);
    }

}
