
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
 *         &lt;element name="organization" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}organizationType"/>
 *         &lt;element name="accountName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "organization",
    "accountName",
    "carrierList"
})
@XmlRootElement(name = "CreateAccountRequest")
public class CreateAccountRequest {

    protected int organization;
    @XmlElement(required = true)
    protected String accountName;
    protected CarrierModListType carrierList;

    /**
     * 获取organization属性的值。
     * 
     */
    public int getOrganization() {
        return organization;
    }

    /**
     * 设置organization属性的值。
     * 
     */
    public void setOrganization(int value) {
        this.organization = value;
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
