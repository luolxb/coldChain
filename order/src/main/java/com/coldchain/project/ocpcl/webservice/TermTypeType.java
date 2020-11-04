
package com.coldchain.project.ocpcl.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>termTypeType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="termTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FIXED"/>
 *     &lt;enumeration value="REGIONAL"/>
 *     &lt;enumeration value="MOBILE"/>
 *     &lt;enumeration value="BINARY FIXED GG"/>
 *     &lt;enumeration value="BINARY REGIONAL GG"/>
 *     &lt;enumeration value="BINARY MOBILE GG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "termTypeType", namespace = "http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11")
@XmlEnum
public enum TermTypeType {

    FIXED("FIXED"),
    REGIONAL("REGIONAL"),
    MOBILE("MOBILE"),
    @XmlEnumValue("BINARY FIXED GG")
    BINARY_FIXED_GG("BINARY FIXED GG"),
    @XmlEnumValue("BINARY REGIONAL GG")
    BINARY_REGIONAL_GG("BINARY REGIONAL GG"),
    @XmlEnumValue("BINARY MOBILE GG")
    BINARY_MOBILE_GG("BINARY MOBILE GG");
    private final String value;

    TermTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TermTypeType fromValue(String v) {
        for (TermTypeType c: TermTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
