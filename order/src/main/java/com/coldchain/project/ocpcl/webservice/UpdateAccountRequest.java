
package com.coldchain.project.ocpcl.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="accountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addCarrierList" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}carrierModListType" minOccurs="0"/>
 *         &lt;element name="removeCarrierList" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}carrierModListType" minOccurs="0"/>
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
    "accountName",
    "addCarrierList",
    "removeCarrierList"
})
@XmlRootElement(name = "UpdateAccountRequest")
public class UpdateAccountRequest {

    protected int account;
    protected String accountName;
    protected CarrierModListType addCarrierList;
    protected CarrierModListType removeCarrierList;

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
     * 获取accountName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * 设置accountName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }

    /**
     * 获取addCarrierList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CarrierModListType }
     *     
     */
    public CarrierModListType getAddCarrierList() {
        return addCarrierList;
    }

    /**
     * 设置addCarrierList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierModListType }
     *     
     */
    public void setAddCarrierList(CarrierModListType value) {
        this.addCarrierList = value;
    }

    /**
     * 获取removeCarrierList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CarrierModListType }
     *     
     */
    public CarrierModListType getRemoveCarrierList() {
        return removeCarrierList;
    }

    /**
     * 设置removeCarrierList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierModListType }
     *     
     */
    public void setRemoveCarrierList(CarrierModListType value) {
        this.removeCarrierList = value;
    }

}
