
package com.coldchain.project.ocpcl.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>blockTypeType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="blockTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AUTOMATIC"/>
 *     &lt;enumeration value="MANUAL"/>
 *     &lt;enumeration value="BY OPERATOR"/>
 *     &lt;enumeration value="ACCOUNT"/>
 *     &lt;enumeration value="SUBACCOUNT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "blockTypeType", namespace = "http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11")
@XmlEnum
public enum BlockTypeType {

    AUTOMATIC("AUTOMATIC"),
    MANUAL("MANUAL"),
    @XmlEnumValue("BY OPERATOR")
    BY_OPERATOR("BY OPERATOR"),
    ACCOUNT("ACCOUNT"),
    SUBACCOUNT("SUBACCOUNT");
    private final String value;

    BlockTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BlockTypeType fromValue(String v) {
        for (BlockTypeType c: BlockTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
