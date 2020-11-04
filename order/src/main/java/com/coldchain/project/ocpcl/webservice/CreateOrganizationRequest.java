
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
 *         &lt;element name="enterprise" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}enterpriseType"/>
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "enterprise",
    "orgName",
    "carrierList"
})
@XmlRootElement(name = "CreateOrganizationRequest")
public class CreateOrganizationRequest {

    protected int enterprise;
    @XmlElement(required = true)
    protected String orgName;
    protected CarrierModListType carrierList;

    /**
     * 获取enterprise属性的值。
     * 
     */
    public int getEnterprise() {
        return enterprise;
    }

    /**
     * 设置enterprise属性的值。
     * 
     */
    public void setEnterprise(int value) {
        this.enterprise = value;
    }

    /**
     * 获取orgName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * 设置orgName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgName(String value) {
        this.orgName = value;
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
