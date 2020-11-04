
package com.coldchain.project.ocpcl.webservice;

import javax.xml.bind.annotation.*;


/**
 * <p>iridiumDestinationChangeType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="iridiumDestinationChangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iridiumDestAddress" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestAddressType"/>
 *         &lt;element name="iridiumDestDeliveryType" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestDeliveryTypeType" minOccurs="0"/>
 *         &lt;element name="iridiumDestGeoData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="iridiumDestMoAck" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iridiumDestinationChangeType", namespace = "http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11", propOrder = {
    "iridiumDestAddress",
    "iridiumDestDeliveryType",
    "iridiumDestGeoData",
    "iridiumDestMoAck"
})
public class IridiumDestinationChangeType {

    @XmlElement(namespace = "", required = true)
    protected String iridiumDestAddress;
    @XmlElement(namespace = "")
    @XmlSchemaType(name = "string")
    protected IridiumDestDeliveryTypeType iridiumDestDeliveryType;
    @XmlElement(namespace = "")
    protected Boolean iridiumDestGeoData;
    @XmlElement(namespace = "")
    protected Boolean iridiumDestMoAck;

    /**
     * 获取iridiumDestAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIridiumDestAddress() {
        return iridiumDestAddress;
    }

    /**
     * 设置iridiumDestAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIridiumDestAddress(String value) {
        this.iridiumDestAddress = value;
    }

    /**
     * 获取iridiumDestDeliveryType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IridiumDestDeliveryTypeType }
     *     
     */
    public IridiumDestDeliveryTypeType getIridiumDestDeliveryType() {
        return iridiumDestDeliveryType;
    }

    /**
     * 设置iridiumDestDeliveryType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IridiumDestDeliveryTypeType }
     *     
     */
    public void setIridiumDestDeliveryType(IridiumDestDeliveryTypeType value) {
        this.iridiumDestDeliveryType = value;
    }

    /**
     * 获取iridiumDestGeoData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIridiumDestGeoData() {
        return iridiumDestGeoData;
    }

    /**
     * 设置iridiumDestGeoData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIridiumDestGeoData(Boolean value) {
        this.iridiumDestGeoData = value;
    }

    /**
     * 获取iridiumDestMoAck属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIridiumDestMoAck() {
        return iridiumDestMoAck;
    }

    /**
     * 设置iridiumDestMoAck属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIridiumDestMoAck(Boolean value) {
        this.iridiumDestMoAck = value;
    }

}
