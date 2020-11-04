
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
 *       &lt;choice>
 *         &lt;element name="enterprise" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}enterpriseType" minOccurs="0"/>
 *         &lt;element name="organization" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}organizationType" minOccurs="0"/>
 *         &lt;element name="account" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}accountType" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "enterprise",
    "organization",
    "account"
})
@XmlRootElement(name = "ListAccountsRequest")
public class ListAccountsRequest {

    protected Integer enterprise;
    protected Integer organization;
    protected Integer account;

    /**
     * 获取enterprise属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEnterprise() {
        return enterprise;
    }

    /**
     * 设置enterprise属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEnterprise(Integer value) {
        this.enterprise = value;
    }

    /**
     * 获取organization属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrganization() {
        return organization;
    }

    /**
     * 设置organization属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrganization(Integer value) {
        this.organization = value;
    }

    /**
     * 获取account属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccount() {
        return account;
    }

    /**
     * 设置account属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccount(Integer value) {
        this.account = value;
    }

}
