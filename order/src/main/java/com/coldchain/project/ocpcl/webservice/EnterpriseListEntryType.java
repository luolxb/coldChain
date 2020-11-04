
package com.coldchain.project.ocpcl.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A single enterprise entry.
 * 
 * <p>enterpriseListEntryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="enterpriseListEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="carriers" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}carrierListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enterpriseListEntryType", namespace = "http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11", propOrder = {
    "number",
    "name",
    "carriers"
})
public class EnterpriseListEntryType {

    @XmlElement(namespace = "")
    protected int number;
    @XmlElement(namespace = "", required = true)
    protected String name;
    @XmlElement(namespace = "")
    protected CarrierListType carriers;

    /**
     * 获取number属性的值。
     * 
     */
    public int getNumber() {
        return number;
    }

    /**
     * 设置number属性的值。
     * 
     */
    public void setNumber(int value) {
        this.number = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取carriers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CarrierListType }
     *     
     */
    public CarrierListType getCarriers() {
        return carriers;
    }

    /**
     * 设置carriers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierListType }
     *     
     */
    public void setCarriers(CarrierListType value) {
        this.carriers = value;
    }

}
