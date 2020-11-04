
package com.coldchain.project.ocpcl.webservice;

import javax.xml.bind.annotation.*;


/**
 * A single carrier entry.
 * 
 * <p>carrierModListEntryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="carrierModListEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carrier" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}carrierType"/>
 *         &lt;element name="pricePlans" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}pricePlanListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "carrierModListEntryType", namespace = "http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11", propOrder = {
    "carrier",
    "pricePlans"
})
public class CarrierModListEntryType {

    @XmlElement(namespace = "", required = true)
    @XmlSchemaType(name = "string")
    protected CarrierType carrier;
    @XmlElement(namespace = "")
    protected PricePlanListType pricePlans;

    /**
     * 获取carrier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CarrierType }
     *     
     */
    public CarrierType getCarrier() {
        return carrier;
    }

    /**
     * 设置carrier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierType }
     *     
     */
    public void setCarrier(CarrierType value) {
        this.carrier = value;
    }

    /**
     * 获取pricePlans属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PricePlanListType }
     *     
     */
    public PricePlanListType getPricePlans() {
        return pricePlans;
    }

    /**
     * 设置pricePlans属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PricePlanListType }
     *     
     */
    public void setPricePlans(PricePlanListType value) {
        this.pricePlans = value;
    }

}
