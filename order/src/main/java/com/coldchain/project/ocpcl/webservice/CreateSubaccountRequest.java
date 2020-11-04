
package com.coldchain.project.ocpcl.webservice;

import javax.xml.bind.annotation.*;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="account" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}accountType"/>
 *         &lt;element name="subaccountName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="carrierList" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}carrierModListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "account",
    "subaccountName",
    "carrierList"
})
@XmlRootElement(name = "CreateSubaccountRequest")
public class CreateSubaccountRequest {

    protected int account;
    @XmlElement(required = true)
    protected String subaccountName;
    protected CarrierModListType carrierList;

    /**
     * 获取account属性的值。
     * 
     */
    public int getAccount() {
        return account;
    }

    /**
     * 设置account属性的值。
     * 
     */
    public void setAccount(int value) {
        this.account = value;
    }

    /**
     * 获取subaccountName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubaccountName() {
        return subaccountName;
    }

    /**
     * 设置subaccountName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubaccountName(String value) {
        this.subaccountName = value;
    }

    /**
     * 获取carrierList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CarrierModListType }
     *     
     */
    public CarrierModListType getCarrierList() {
        return carrierList;
    }

    /**
     * 设置carrierList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierModListType }
     *     
     */
    public void setCarrierList(CarrierModListType value) {
        this.carrierList = value;
    }

}
