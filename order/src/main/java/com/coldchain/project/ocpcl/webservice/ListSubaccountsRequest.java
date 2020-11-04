
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
 *         &lt;element name="accountSubaccount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="account" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}accountType"/>
 *                   &lt;element name="subaccount" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}subaccountType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "account",
    "accountSubaccount"
})
@XmlRootElement(name = "ListSubaccountsRequest")
public class ListSubaccountsRequest {

    protected Integer enterprise;
    protected Integer organization;
    protected Integer account;
    protected AccountSubaccount accountSubaccount;

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

    /**
     * 获取accountSubaccount属性的值。
     *
     * @return
     *     possible object is
     *     {@link AccountSubaccount }
     *
     */
    public AccountSubaccount getAccountSubaccount() {
        return accountSubaccount;
    }

    /**
     * 设置accountSubaccount属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link AccountSubaccount }
     *
     */
    public void setAccountSubaccount(AccountSubaccount value) {
        this.accountSubaccount = value;
    }


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
     *         &lt;element name="subaccount" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}subaccountType"/>
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
        "subaccount"
    })
    public static class AccountSubaccount {

        protected int account;
        protected int subaccount;

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
         * 获取subaccount属性的值。
         * 
         */
        public int getSubaccount() {
            return subaccount;
        }

        /**
         * 设置subaccount属性的值。
         * 
         */
        public void setSubaccount(int value) {
            this.subaccount = value;
        }

    }

}
