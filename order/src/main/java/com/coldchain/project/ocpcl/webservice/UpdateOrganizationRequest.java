
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
 *         &lt;element name="organization" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}organizationType"/>
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "organization",
    "orgName",
    "addCarrierList",
    "removeCarrierList"
})
@XmlRootElement(name = "UpdateOrganizationRequest")
public class UpdateOrganizationRequest {

    protected int organization;
    protected String orgName;
    protected CarrierModListType addCarrierList;
    protected CarrierModListType removeCarrierList;

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
