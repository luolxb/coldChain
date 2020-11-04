
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
 *         &lt;element name="accessLevel" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}accessLevelType"/>
 *         &lt;element name="enterpriseNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="enterpriseName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="organizationNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="organizationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="accountName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subaccountNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="subaccountName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "accessLevel",
    "enterpriseNumber",
    "enterpriseName",
    "organizationNumber",
    "organizationName",
    "accountNumber",
    "accountName",
    "subaccountNumber",
    "subaccountName"
})
@XmlRootElement(name = "GetUserProfileResponse")
public class GetUserProfileResponse {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AccessLevelType accessLevel;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer enterpriseNumber;
    @XmlElement(required = true, nillable = true)
    protected String enterpriseName;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer organizationNumber;
    @XmlElement(required = true, nillable = true)
    protected String organizationName;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer accountNumber;
    @XmlElement(required = true, nillable = true)
    protected String accountName;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer subaccountNumber;
    @XmlElement(required = true, nillable = true)
    protected String subaccountName;

    /**
     * 获取accessLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccessLevelType }
     *     
     */
    public AccessLevelType getAccessLevel() {
        return accessLevel;
    }

    /**
     * 设置accessLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccessLevelType }
     *     
     */
    public void setAccessLevel(AccessLevelType value) {
        this.accessLevel = value;
    }

    /**
     * 获取enterpriseNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEnterpriseNumber() {
        return enterpriseNumber;
    }

    /**
     * 设置enterpriseNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEnterpriseNumber(Integer value) {
        this.enterpriseNumber = value;
    }

    /**
     * 获取enterpriseName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterpriseName() {
        return enterpriseName;
    }

    /**
     * 设置enterpriseName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterpriseName(String value) {
        this.enterpriseName = value;
    }

    /**
     * 获取organizationNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrganizationNumber() {
        return organizationNumber;
    }

    /**
     * 设置organizationNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrganizationNumber(Integer value) {
        this.organizationNumber = value;
    }

    /**
     * 获取organizationName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * 设置organizationName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * 获取accountNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountNumber() {
        return accountNumber;
    }

    /**
     * 设置accountNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountNumber(Integer value) {
        this.accountNumber = value;
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
     * 获取subaccountNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubaccountNumber() {
        return subaccountNumber;
    }

    /**
     * 设置subaccountNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubaccountNumber(Integer value) {
        this.subaccountNumber = value;
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

}
