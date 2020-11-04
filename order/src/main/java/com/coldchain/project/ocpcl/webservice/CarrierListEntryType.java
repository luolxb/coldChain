
package com.coldchain.project.ocpcl.webservice;

import javax.xml.bind.annotation.*;


/**
 * A single carrier entry.
 * 
 * <p>carrierListEntryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="carrierListEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carrier" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}carrierType"/>
 *         &lt;element name="carrierDisplay" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "carrierListEntryType", namespace = "http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11", propOrder = {
    "carrier",
    "carrierDisplay",
    "pricePlans"
})
public class CarrierListEntryType {

    @XmlElement(namespace = "", required = true)
    @XmlSchemaType(name = "string")
    protected CarrierType carrier;
    @XmlElement(namespace = "", required = true)
    protected String carrierDisplay;
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
     * 获取carrierDisplay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierDisplay() {
        return carrierDisplay;
    }

    /**
     * 设置carrierDisplay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierDisplay(String value) {
        this.carrierDisplay = value;
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
