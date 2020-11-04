
package com.coldchain.project.ocpcl.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>globalSimSmsOptionType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="globalSimSmsOptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALLOW ALL"/>
 *     &lt;enumeration value="ALLOW MT"/>
 *     &lt;enumeration value="ALLOW MO"/>
 *     &lt;enumeration value="BLOCK ALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "globalSimSmsOptionType", namespace = "http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11")
@XmlEnum
public enum GlobalSimSmsOptionType {

    @XmlEnumValue("ALLOW ALL")
    ALLOW_ALL("ALLOW ALL"),
    @XmlEnumValue("ALLOW MT")
    ALLOW_MT("ALLOW MT"),
    @XmlEnumValue("ALLOW MO")
    ALLOW_MO("ALLOW MO"),
    @XmlEnumValue("BLOCK ALL")
    BLOCK_ALL("BLOCK ALL");
    private final String value;

    GlobalSimSmsOptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlobalSimSmsOptionType fromValue(String v) {
        for (GlobalSimSmsOptionType c: GlobalSimSmsOptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
