
package com.coldchain.project.ocpcl.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>carrierTypeSwap的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="carrierTypeSwap">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ORBCOMM"/>
 *     &lt;enumeration value="TMOBILE"/>
 *     &lt;enumeration value="VERIZON"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "carrierTypeSwap", namespace = "http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11")
@XmlEnum
public enum CarrierTypeSwap {

    ORBCOMM,
    TMOBILE,
    VERIZON;

    public String value() {
        return name();
    }

    public static CarrierTypeSwap fromValue(String v) {
        return valueOf(v);
    }

}
