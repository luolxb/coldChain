
package com.coldchain.project.ocpcl.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>carrierType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="carrierType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ORBCOMM"/>
 *     &lt;enumeration value="ATT"/>
 *     &lt;enumeration value="CHINAUNICOM"/>
 *     &lt;enumeration value="GLOBALSTAR"/>
 *     &lt;enumeration value="INMARSATIDP"/>
 *     &lt;enumeration value="IRIDIUM"/>
 *     &lt;enumeration value="MAGENTA"/>
 *     &lt;enumeration value="ORANGE"/>
 *     &lt;enumeration value="ORBCOMMGLOBALSIM"/>
 *     &lt;enumeration value="ROGERS"/>
 *     &lt;enumeration value="TMOBILE"/>
 *     &lt;enumeration value="TELEFONICA"/>
 *     &lt;enumeration value="VERIZON"/>
 *     &lt;enumeration value="VODAFONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "carrierType", namespace = "http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11")
@XmlEnum
public enum CarrierType {

    ORBCOMM,
    ATT,
    CHINAUNICOM,
    GLOBALSTAR,
    INMARSATIDP,
    IRIDIUM,
    MAGENTA,
    ORANGE,
    ORBCOMMGLOBALSIM,
    ROGERS,
    TMOBILE,
    TELEFONICA,
    VERIZON,
    VODAFONE;

    public String value() {
        return name();
    }

    public static CarrierType fromValue(String v) {
        return valueOf(v);
    }

}
