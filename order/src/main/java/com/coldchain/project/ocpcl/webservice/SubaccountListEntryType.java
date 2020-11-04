
package com.coldchain.project.ocpcl.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A single subaccount entry.
 * 
 * <p>subaccountListEntryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="subaccountListEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enterpriseNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="organizationNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "subaccountListEntryType", namespace = "http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11", propOrder = {
    "enterpriseNumber",
    "organizationNumber",
    "accountNumber",
    "number",
    "name",
    "carriers"
})
public class SubaccountListEntryType {

    @XmlElement(namespace = "")
    protected int enterpriseNumber;
    @XmlElement(namespace = "")
    protected int organizationNumber;
    @XmlElement(namespace = "")
    protected int accountNumber;
    @XmlElement(namespace = "")
    protected int number;
    @XmlElement(namespace = "", required = true)
    protected String name;
    @XmlElement(namespace = "")
    protected CarrierListType carriers;

    /**
     * 获取enterpriseNumber属性的值。
     * 
     */
    public int getEnterpriseNumber() {
        return enterpriseNumber;
    }

    /**
     * 设置enterpriseNumber属性的值。
     * 
     */
    public void setEnterpriseNumber(int value) {
        this.enterpriseNumber = value;
    }

    /**
     * 获取organizationNumber属性的值。
     * 
     */
    public int getOrganizationNumber() {
        return organizationNumber;
    }

    /**
     * 设置organizationNumber属性的值。
     * 
     */
    public void setOrganizationNumber(int value) {
        this.organizationNumber = value;
    }

    /**
     * 获取accountNumber属性的值。
     * 
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * 设置accountNumber属性的值。
     * 
     */
    public void setAccountNumber(int value) {
        this.accountNumber = value;
    }

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
