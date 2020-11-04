
package com.coldchain.project.ocpcl.webservice;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="account" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}accountType" minOccurs="0"/>
 *         &lt;element name="unitId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}unitIdType" minOccurs="0"/>
 *         &lt;element name="saasUnitId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}saasUnitIdType" minOccurs="0"/>
 *         &lt;element name="subscriberId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}subscriberIdType" minOccurs="0"/>
 *         &lt;element name="subaccount" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}subaccountStockType" minOccurs="0"/>
 *         &lt;element name="carrier" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}carrierType" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}statusType" minOccurs="0"/>
 *         &lt;element name="assetType" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}assetTypeNameType" minOccurs="0"/>
 *         &lt;element name="assetId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}assetIdType" minOccurs="0"/>
 *         &lt;element name="pricePlan" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}pricePlanType" minOccurs="0"/>
 *         &lt;element name="assignedRangeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="assignedRangeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="activatedRangeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="activatedRangeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastModifiedRangeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastModifiedRangeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="includeSaasUnitId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pageOffset" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}pageOffsetType" minOccurs="0"/>
 *         &lt;element name="pageSize" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}pageSizeType" minOccurs="0"/>
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
    "unitId",
    "saasUnitId",
    "subscriberId",
    "subaccount",
    "carrier",
    "status",
    "assetType",
    "assetId",
    "pricePlan",
    "assignedRangeFrom",
    "assignedRangeTo",
    "activatedRangeFrom",
    "activatedRangeTo",
    "lastModifiedRangeFrom",
    "lastModifiedRangeTo",
    "includeSaasUnitId",
    "pageOffset",
    "pageSize"
})
@XmlRootElement(name = "ListSubscribersRequest")
public class ListSubscribersRequest {

    protected Integer account;
    protected String unitId;
    protected String saasUnitId;
    protected String subscriberId;
    protected String subaccount;
    @XmlSchemaType(name = "string")
    protected CarrierType carrier;
    @XmlSchemaType(name = "string")
    protected StatusType status;
    protected String assetType;
    protected String assetId;
    protected String pricePlan;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar assignedRangeFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar assignedRangeTo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activatedRangeFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activatedRangeTo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedRangeFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedRangeTo;
    protected Boolean includeSaasUnitId;
    protected Integer pageOffset;
    protected Integer pageSize;

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
     * 获取unitId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitId() {
        return unitId;
    }

    /**
     * 设置unitId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitId(String value) {
        this.unitId = value;
    }

    /**
     * 获取saasUnitId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaasUnitId() {
        return saasUnitId;
    }

    /**
     * 设置saasUnitId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaasUnitId(String value) {
        this.saasUnitId = value;
    }

    /**
     * 获取subscriberId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberId() {
        return subscriberId;
    }

    /**
     * 设置subscriberId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberId(String value) {
        this.subscriberId = value;
    }

    /**
     * 获取subaccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubaccount() {
        return subaccount;
    }

    /**
     * 设置subaccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubaccount(String value) {
        this.subaccount = value;
    }

    /**
     * 获取carrier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CarrierType }
     *     
     */
    public CarrierType getCarrier() {
        return carrier;
    }

    /**
     * 设置carrier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierType }
     *     
     */
    public void setCarrier(CarrierType value) {
        this.carrier = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * 获取assetType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetType() {
        return assetType;
    }

    /**
     * 设置assetType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetType(String value) {
        this.assetType = value;
    }

    /**
     * 获取assetId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetId() {
        return assetId;
    }

    /**
     * 设置assetId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetId(String value) {
        this.assetId = value;
    }

    /**
     * 获取pricePlan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricePlan() {
        return pricePlan;
    }

    /**
     * 设置pricePlan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricePlan(String value) {
        this.pricePlan = value;
    }

    /**
     * 获取assignedRangeFrom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssignedRangeFrom() {
        return assignedRangeFrom;
    }

    /**
     * 设置assignedRangeFrom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssignedRangeFrom(XMLGregorianCalendar value) {
        this.assignedRangeFrom = value;
    }

    /**
     * 获取assignedRangeTo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssignedRangeTo() {
        return assignedRangeTo;
    }

    /**
     * 设置assignedRangeTo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssignedRangeTo(XMLGregorianCalendar value) {
        this.assignedRangeTo = value;
    }

    /**
     * 获取activatedRangeFrom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivatedRangeFrom() {
        return activatedRangeFrom;
    }

    /**
     * 设置activatedRangeFrom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivatedRangeFrom(XMLGregorianCalendar value) {
        this.activatedRangeFrom = value;
    }

    /**
     * 获取activatedRangeTo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivatedRangeTo() {
        return activatedRangeTo;
    }

    /**
     * 设置activatedRangeTo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivatedRangeTo(XMLGregorianCalendar value) {
        this.activatedRangeTo = value;
    }

    /**
     * 获取lastModifiedRangeFrom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedRangeFrom() {
        return lastModifiedRangeFrom;
    }

    /**
     * 设置lastModifiedRangeFrom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedRangeFrom(XMLGregorianCalendar value) {
        this.lastModifiedRangeFrom = value;
    }

    /**
     * 获取lastModifiedRangeTo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedRangeTo() {
        return lastModifiedRangeTo;
    }

    /**
     * 设置lastModifiedRangeTo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedRangeTo(XMLGregorianCalendar value) {
        this.lastModifiedRangeTo = value;
    }

    /**
     * 获取includeSaasUnitId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSaasUnitId() {
        return includeSaasUnitId;
    }

    /**
     * 设置includeSaasUnitId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSaasUnitId(Boolean value) {
        this.includeSaasUnitId = value;
    }

    /**
     * 获取pageOffset属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageOffset() {
        return pageOffset;
    }

    /**
     * 设置pageOffset属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageOffset(Integer value) {
        this.pageOffset = value;
    }

    /**
     * 获取pageSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * 设置pageSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageSize(Integer value) {
        this.pageSize = value;
    }

}
