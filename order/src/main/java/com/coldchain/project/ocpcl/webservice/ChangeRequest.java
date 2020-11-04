
package com.coldchain.project.ocpcl.webservice;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="callbackEndpoint" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}callbackEndpointType" minOccurs="0"/>
 *         &lt;element name="callbackId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}callbackIdType" minOccurs="0"/>
 *         &lt;element name="change" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="carrier" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}carrierType"/>
 *                   &lt;element name="subscriberId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}subscriberIdType"/>
 *                   &lt;element name="accountSubaccount" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="account" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}accountType"/>
 *                             &lt;element name="subaccount" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}subaccountStockType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="pricePlan" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}pricePlanType" minOccurs="0"/>
 *                   &lt;element name="assetType" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}assetTypeNameType" minOccurs="0"/>
 *                   &lt;element name="assetId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}assetIdType" minOccurs="0"/>
 *                   &lt;element name="unitId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}unitIdType" minOccurs="0"/>
 *                   &lt;element name="unsuspendDate" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}unsuspendDateType" minOccurs="0"/>
 *                   &lt;choice minOccurs="0">
 *                     &lt;element name="orbcommChangeParams">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="internetAddress" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}inetAddrType" minOccurs="0"/>
 *                               &lt;element name="terminalType" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}termTypeType" minOccurs="0"/>
 *                               &lt;element name="zone" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}zoneType" minOccurs="0"/>
 *                               &lt;element name="deliveryPlan" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}deliveryPlanType" minOccurs="0"/>
 *                               &lt;element name="xmlGatewayAccount" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}xmlGatewayAcctType" minOccurs="0"/>
 *                               &lt;element name="messageBlocking" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}messageBlockingType" minOccurs="0"/>
 *                               &lt;element name="ataUse" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}ataUseType" minOccurs="0"/>
 *                               &lt;element name="ata" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
 *                               &lt;element name="speedDial1" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
 *                               &lt;element name="speedDial2" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
 *                               &lt;element name="speedDial3" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
 *                               &lt;element name="speedDial4" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
 *                               &lt;element name="speedDial5" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
 *                               &lt;element name="speedDial6" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
 *                               &lt;element name="speedDial7" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
 *                               &lt;element name="speedDial8" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="inmarsatIdpChangeParams">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="xmlGatewayAccount" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}xmlGatewayAcctType"/>
 *                               &lt;element name="speedDial2" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
 *                               &lt;element name="speedDial3" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
 *                               &lt;element name="speedDial4" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
 *                               &lt;element name="speedDial5" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
 *                               &lt;element name="speedDial6" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
 *                               &lt;element name="speedDial7" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
 *                               &lt;element name="speedDial8" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="iridiumChangeParams">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="iridiumDestination1" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationChangeType" minOccurs="0"/>
 *                               &lt;element name="iridiumDestination2" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationChangeType" minOccurs="0"/>
 *                               &lt;element name="iridiumDestination3" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationChangeType" minOccurs="0"/>
 *                               &lt;element name="iridiumDestination4" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationChangeType" minOccurs="0"/>
 *                               &lt;element name="iridiumDestination5" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationChangeType" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="tmobileChangeParams">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="smsBundle" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}tmobileSmsBundleType" minOccurs="0"/>
 *                               &lt;element name="roaming" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}tmobileRoamingType" minOccurs="0"/>
 *                               &lt;element name="blockVoice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                               &lt;element name="blockSmsFromIm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                               &lt;element name="blockSmsFromEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                               &lt;element name="blockAllSms" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="verizon4gChangeParams">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="imei" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imeiType"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="globalstarChangeParams">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="unitModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                               &lt;element name="messageFilterProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                               &lt;element name="xmlGatewayAccount" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}xmlGatewayAcctType" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="globalSimChangeParams">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="smsOption" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}globalSimSmsOptionType" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="magentaChangeParams">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="unblockDate" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}unblockDateType" minOccurs="0"/>
 *                               &lt;element name="dataAccessProfile" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}magentaDataAccessProfileType" minOccurs="0"/>
 *                               &lt;element name="fraudProfile" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}magentaFraudProfileType" minOccurs="0"/>
 *                               &lt;element name="limitProfile" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}magentaLimitProfileType" minOccurs="0"/>
 *                               &lt;element name="barringProfile" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}magentaBarringProfileType" minOccurs="0"/>
 *                               &lt;element name="customerClient" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}customerClientType" minOccurs="0"/>
 *                               &lt;element name="vehicle" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}vehicleType" minOccurs="0"/>
 *                               &lt;element name="sn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}snType" minOccurs="0"/>
 *                               &lt;element name="company" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}companyType" minOccurs="0"/>
 *                               &lt;element name="simReturn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}magentaSimReturnType" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "callbackEndpoint",
    "callbackId",
    "change"
})
@XmlRootElement(name = "ChangeRequest")
public class ChangeRequest {

    protected String callbackEndpoint;
    protected String callbackId;
    @XmlElement(required = true)
    protected List<Change> change;

    /**
     * 获取callbackEndpoint属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCallbackEndpoint() {
        return callbackEndpoint;
    }

    /**
     * 设置callbackEndpoint属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCallbackEndpoint(String value) {
        this.callbackEndpoint = value;
    }

    /**
     * 获取callbackId属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCallbackId() {
        return callbackId;
    }

    /**
     * 设置callbackId属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCallbackId(String value) {
        this.callbackId = value;
    }

    /**
     * Gets the value of the change property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the change property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChange().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Change }
     *
     *
     */
    public List<Change> getChange() {
        if (change == null) {
            change = new ArrayList<Change>();
        }
        return this.change;
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
     *         &lt;element name="carrier" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}carrierType"/>
     *         &lt;element name="subscriberId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}subscriberIdType"/>
     *         &lt;element name="accountSubaccount" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="account" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}accountType"/>
     *                   &lt;element name="subaccount" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}subaccountStockType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="pricePlan" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}pricePlanType" minOccurs="0"/>
     *         &lt;element name="assetType" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}assetTypeNameType" minOccurs="0"/>
     *         &lt;element name="assetId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}assetIdType" minOccurs="0"/>
     *         &lt;element name="unitId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}unitIdType" minOccurs="0"/>
     *         &lt;element name="unsuspendDate" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}unsuspendDateType" minOccurs="0"/>
     *         &lt;choice minOccurs="0">
     *           &lt;element name="orbcommChangeParams">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="internetAddress" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}inetAddrType" minOccurs="0"/>
     *                     &lt;element name="terminalType" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}termTypeType" minOccurs="0"/>
     *                     &lt;element name="zone" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}zoneType" minOccurs="0"/>
     *                     &lt;element name="deliveryPlan" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}deliveryPlanType" minOccurs="0"/>
     *                     &lt;element name="xmlGatewayAccount" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}xmlGatewayAcctType" minOccurs="0"/>
     *                     &lt;element name="messageBlocking" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}messageBlockingType" minOccurs="0"/>
     *                     &lt;element name="ataUse" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}ataUseType" minOccurs="0"/>
     *                     &lt;element name="ata" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
     *                     &lt;element name="speedDial1" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
     *                     &lt;element name="speedDial2" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
     *                     &lt;element name="speedDial3" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
     *                     &lt;element name="speedDial4" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
     *                     &lt;element name="speedDial5" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
     *                     &lt;element name="speedDial6" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
     *                     &lt;element name="speedDial7" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
     *                     &lt;element name="speedDial8" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="inmarsatIdpChangeParams">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="xmlGatewayAccount" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}xmlGatewayAcctType"/>
     *                     &lt;element name="speedDial2" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
     *                     &lt;element name="speedDial3" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
     *                     &lt;element name="speedDial4" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
     *                     &lt;element name="speedDial5" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
     *                     &lt;element name="speedDial6" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
     *                     &lt;element name="speedDial7" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
     *                     &lt;element name="speedDial8" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="iridiumChangeParams">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="iridiumDestination1" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationChangeType" minOccurs="0"/>
     *                     &lt;element name="iridiumDestination2" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationChangeType" minOccurs="0"/>
     *                     &lt;element name="iridiumDestination3" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationChangeType" minOccurs="0"/>
     *                     &lt;element name="iridiumDestination4" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationChangeType" minOccurs="0"/>
     *                     &lt;element name="iridiumDestination5" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationChangeType" minOccurs="0"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="tmobileChangeParams">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="smsBundle" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}tmobileSmsBundleType" minOccurs="0"/>
     *                     &lt;element name="roaming" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}tmobileRoamingType" minOccurs="0"/>
     *                     &lt;element name="blockVoice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                     &lt;element name="blockSmsFromIm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                     &lt;element name="blockSmsFromEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                     &lt;element name="blockAllSms" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="verizon4gChangeParams">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="imei" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imeiType"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="globalstarChangeParams">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="unitModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                     &lt;element name="messageFilterProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                     &lt;element name="xmlGatewayAccount" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}xmlGatewayAcctType" minOccurs="0"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="globalSimChangeParams">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="smsOption" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}globalSimSmsOptionType" minOccurs="0"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="magentaChangeParams">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="unblockDate" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}unblockDateType" minOccurs="0"/>
     *                     &lt;element name="dataAccessProfile" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}magentaDataAccessProfileType" minOccurs="0"/>
     *                     &lt;element name="fraudProfile" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}magentaFraudProfileType" minOccurs="0"/>
     *                     &lt;element name="limitProfile" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}magentaLimitProfileType" minOccurs="0"/>
     *                     &lt;element name="barringProfile" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}magentaBarringProfileType" minOccurs="0"/>
     *                     &lt;element name="customerClient" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}customerClientType" minOccurs="0"/>
     *                     &lt;element name="vehicle" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}vehicleType" minOccurs="0"/>
     *                     &lt;element name="sn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}snType" minOccurs="0"/>
     *                     &lt;element name="company" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}companyType" minOccurs="0"/>
     *                     &lt;element name="simReturn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}magentaSimReturnType" minOccurs="0"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
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
        "carrier",
        "subscriberId",
        "accountSubaccount",
        "pricePlan",
        "assetType",
        "assetId",
        "unitId",
        "unsuspendDate",
        "orbcommChangeParams",
        "inmarsatIdpChangeParams",
        "iridiumChangeParams",
        "tmobileChangeParams",
        "verizon4GChangeParams",
        "globalstarChangeParams",
        "globalSimChangeParams",
        "magentaChangeParams"
    })
    public static class Change {

        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected CarrierType carrier;
        @XmlElement(required = true)
        protected String subscriberId;
        protected AccountSubaccount accountSubaccount;
        protected String pricePlan;
        protected String assetType;
        protected String assetId;
        protected String unitId;
        protected String unsuspendDate;
        protected OrbcommChangeParams orbcommChangeParams;
        protected InmarsatIdpChangeParams inmarsatIdpChangeParams;
        protected IridiumChangeParams iridiumChangeParams;
        protected TmobileChangeParams tmobileChangeParams;
        @XmlElement(name = "verizon4gChangeParams")
        protected Verizon4GChangeParams verizon4GChangeParams;
        protected GlobalstarChangeParams globalstarChangeParams;
        protected GlobalSimChangeParams globalSimChangeParams;
        protected MagentaChangeParams magentaChangeParams;

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
         * 获取unsuspendDate属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getUnsuspendDate() {
            return unsuspendDate;
        }

        /**
         * 设置unsuspendDate属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setUnsuspendDate(String value) {
            this.unsuspendDate = value;
        }

        /**
         * 获取orbcommChangeParams属性的值。
         *
         * @return
         *     possible object is
         *     {@link OrbcommChangeParams }
         *
         */
        public OrbcommChangeParams getOrbcommChangeParams() {
            return orbcommChangeParams;
        }

        /**
         * 设置orbcommChangeParams属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link OrbcommChangeParams }
         *
         */
        public void setOrbcommChangeParams(OrbcommChangeParams value) {
            this.orbcommChangeParams = value;
        }

        /**
         * 获取inmarsatIdpChangeParams属性的值。
         *
         * @return
         *     possible object is
         *     {@link InmarsatIdpChangeParams }
         *
         */
        public InmarsatIdpChangeParams getInmarsatIdpChangeParams() {
            return inmarsatIdpChangeParams;
        }

        /**
         * 设置inmarsatIdpChangeParams属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link InmarsatIdpChangeParams }
         *
         */
        public void setInmarsatIdpChangeParams(InmarsatIdpChangeParams value) {
            this.inmarsatIdpChangeParams = value;
        }

        /**
         * 获取iridiumChangeParams属性的值。
         *
         * @return
         *     possible object is
         *     {@link IridiumChangeParams }
         *
         */
        public IridiumChangeParams getIridiumChangeParams() {
            return iridiumChangeParams;
        }

        /**
         * 设置iridiumChangeParams属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link IridiumChangeParams }
         *
         */
        public void setIridiumChangeParams(IridiumChangeParams value) {
            this.iridiumChangeParams = value;
        }

        /**
         * 获取tmobileChangeParams属性的值。
         *
         * @return
         *     possible object is
         *     {@link TmobileChangeParams }
         *
         */
        public TmobileChangeParams getTmobileChangeParams() {
            return tmobileChangeParams;
        }

        /**
         * 设置tmobileChangeParams属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link TmobileChangeParams }
         *
         */
        public void setTmobileChangeParams(TmobileChangeParams value) {
            this.tmobileChangeParams = value;
        }

        /**
         * 获取verizon4GChangeParams属性的值。
         *
         * @return
         *     possible object is
         *     {@link Verizon4GChangeParams }
         *
         */
        public Verizon4GChangeParams getVerizon4GChangeParams() {
            return verizon4GChangeParams;
        }

        /**
         * 设置verizon4GChangeParams属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Verizon4GChangeParams }
         *
         */
        public void setVerizon4GChangeParams(Verizon4GChangeParams value) {
            this.verizon4GChangeParams = value;
        }

        /**
         * 获取globalstarChangeParams属性的值。
         *
         * @return
         *     possible object is
         *     {@link GlobalstarChangeParams }
         *
         */
        public GlobalstarChangeParams getGlobalstarChangeParams() {
            return globalstarChangeParams;
        }

        /**
         * 设置globalstarChangeParams属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link GlobalstarChangeParams }
         *
         */
        public void setGlobalstarChangeParams(GlobalstarChangeParams value) {
            this.globalstarChangeParams = value;
        }

        /**
         * 获取globalSimChangeParams属性的值。
         *
         * @return
         *     possible object is
         *     {@link GlobalSimChangeParams }
         *
         */
        public GlobalSimChangeParams getGlobalSimChangeParams() {
            return globalSimChangeParams;
        }

        /**
         * 设置globalSimChangeParams属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link GlobalSimChangeParams }
         *
         */
        public void setGlobalSimChangeParams(GlobalSimChangeParams value) {
            this.globalSimChangeParams = value;
        }

        /**
         * 获取magentaChangeParams属性的值。
         *
         * @return
         *     possible object is
         *     {@link MagentaChangeParams }
         *
         */
        public MagentaChangeParams getMagentaChangeParams() {
            return magentaChangeParams;
        }

        /**
         * 设置magentaChangeParams属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link MagentaChangeParams }
         *
         */
        public void setMagentaChangeParams(MagentaChangeParams value) {
            this.magentaChangeParams = value;
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
         *         &lt;element name="subaccount" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}subaccountStockType"/>
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
            @XmlElement(required = true)
            protected String subaccount;

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
         *         &lt;element name="smsOption" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}globalSimSmsOptionType" minOccurs="0"/>
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
            "smsOption"
        })
        public static class GlobalSimChangeParams {

            @XmlSchemaType(name = "string")
            protected GlobalSimSmsOptionType smsOption;

            /**
             * 获取smsOption属性的值。
             * 
             * @return
             *     possible object is
             *     {@link GlobalSimSmsOptionType }
             *     
             */
            public GlobalSimSmsOptionType getSmsOption() {
                return smsOption;
            }

            /**
             * 设置smsOption属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link GlobalSimSmsOptionType }
             *     
             */
            public void setSmsOption(GlobalSimSmsOptionType value) {
                this.smsOption = value;
            }

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
         *         &lt;element name="unitModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="messageFilterProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="xmlGatewayAccount" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}xmlGatewayAcctType" minOccurs="0"/>
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
            "unitModel",
            "messageFilterProfile",
            "xmlGatewayAccount"
        })
        public static class GlobalstarChangeParams {

            protected String unitModel;
            protected String messageFilterProfile;
            protected String xmlGatewayAccount;

            /**
             * 获取unitModel属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnitModel() {
                return unitModel;
            }

            /**
             * 设置unitModel属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnitModel(String value) {
                this.unitModel = value;
            }

            /**
             * 获取messageFilterProfile属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMessageFilterProfile() {
                return messageFilterProfile;
            }

            /**
             * 设置messageFilterProfile属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMessageFilterProfile(String value) {
                this.messageFilterProfile = value;
            }

            /**
             * 获取xmlGatewayAccount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXmlGatewayAccount() {
                return xmlGatewayAccount;
            }

            /**
             * 设置xmlGatewayAccount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXmlGatewayAccount(String value) {
                this.xmlGatewayAccount = value;
            }

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
         *         &lt;element name="xmlGatewayAccount" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}xmlGatewayAcctType"/>
         *         &lt;element name="speedDial2" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
         *         &lt;element name="speedDial3" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
         *         &lt;element name="speedDial4" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
         *         &lt;element name="speedDial5" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
         *         &lt;element name="speedDial6" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
         *         &lt;element name="speedDial7" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
         *         &lt;element name="speedDial8" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
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
            "xmlGatewayAccount",
            "speedDial2",
            "speedDial3",
            "speedDial4",
            "speedDial5",
            "speedDial6",
            "speedDial7",
            "speedDial8"
        })
        public static class InmarsatIdpChangeParams {

            @XmlElement(required = true)
            protected String xmlGatewayAccount;
            protected String speedDial2;
            protected String speedDial3;
            protected String speedDial4;
            protected String speedDial5;
            protected String speedDial6;
            protected String speedDial7;
            protected String speedDial8;

            /**
             * 获取xmlGatewayAccount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXmlGatewayAccount() {
                return xmlGatewayAccount;
            }

            /**
             * 设置xmlGatewayAccount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXmlGatewayAccount(String value) {
                this.xmlGatewayAccount = value;
            }

            /**
             * 获取speedDial2属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSpeedDial2() {
                return speedDial2;
            }

            /**
             * 设置speedDial2属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSpeedDial2(String value) {
                this.speedDial2 = value;
            }

            /**
             * 获取speedDial3属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSpeedDial3() {
                return speedDial3;
            }

            /**
             * 设置speedDial3属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSpeedDial3(String value) {
                this.speedDial3 = value;
            }

            /**
             * 获取speedDial4属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSpeedDial4() {
                return speedDial4;
            }

            /**
             * 设置speedDial4属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSpeedDial4(String value) {
                this.speedDial4 = value;
            }

            /**
             * 获取speedDial5属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSpeedDial5() {
                return speedDial5;
            }

            /**
             * 设置speedDial5属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSpeedDial5(String value) {
                this.speedDial5 = value;
            }

            /**
             * 获取speedDial6属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSpeedDial6() {
                return speedDial6;
            }

            /**
             * 设置speedDial6属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSpeedDial6(String value) {
                this.speedDial6 = value;
            }

            /**
             * 获取speedDial7属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSpeedDial7() {
                return speedDial7;
            }

            /**
             * 设置speedDial7属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSpeedDial7(String value) {
                this.speedDial7 = value;
            }

            /**
             * 获取speedDial8属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSpeedDial8() {
                return speedDial8;
            }

            /**
             * 设置speedDial8属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSpeedDial8(String value) {
                this.speedDial8 = value;
            }

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
         *         &lt;element name="iridiumDestination1" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationChangeType" minOccurs="0"/>
         *         &lt;element name="iridiumDestination2" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationChangeType" minOccurs="0"/>
         *         &lt;element name="iridiumDestination3" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationChangeType" minOccurs="0"/>
         *         &lt;element name="iridiumDestination4" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationChangeType" minOccurs="0"/>
         *         &lt;element name="iridiumDestination5" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationChangeType" minOccurs="0"/>
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
            "iridiumDestination1",
            "iridiumDestination2",
            "iridiumDestination3",
            "iridiumDestination4",
            "iridiumDestination5"
        })
        public static class IridiumChangeParams {

            protected IridiumDestinationChangeType iridiumDestination1;
            protected IridiumDestinationChangeType iridiumDestination2;
            protected IridiumDestinationChangeType iridiumDestination3;
            protected IridiumDestinationChangeType iridiumDestination4;
            protected IridiumDestinationChangeType iridiumDestination5;

            /**
             * 获取iridiumDestination1属性的值。
             * 
             * @return
             *     possible object is
             *     {@link IridiumDestinationChangeType }
             *     
             */
            public IridiumDestinationChangeType getIridiumDestination1() {
                return iridiumDestination1;
            }

            /**
             * 设置iridiumDestination1属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link IridiumDestinationChangeType }
             *     
             */
            public void setIridiumDestination1(IridiumDestinationChangeType value) {
                this.iridiumDestination1 = value;
            }

            /**
             * 获取iridiumDestination2属性的值。
             * 
             * @return
             *     possible object is
             *     {@link IridiumDestinationChangeType }
             *     
             */
            public IridiumDestinationChangeType getIridiumDestination2() {
                return iridiumDestination2;
            }

            /**
             * 设置iridiumDestination2属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link IridiumDestinationChangeType }
             *     
             */
            public void setIridiumDestination2(IridiumDestinationChangeType value) {
                this.iridiumDestination2 = value;
            }

            /**
             * 获取iridiumDestination3属性的值。
             * 
             * @return
             *     possible object is
             *     {@link IridiumDestinationChangeType }
             *     
             */
            public IridiumDestinationChangeType getIridiumDestination3() {
                return iridiumDestination3;
            }

            /**
             * 设置iridiumDestination3属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link IridiumDestinationChangeType }
             *     
             */
            public void setIridiumDestination3(IridiumDestinationChangeType value) {
                this.iridiumDestination3 = value;
            }

            /**
             * 获取iridiumDestination4属性的值。
             * 
             * @return
             *     possible object is
             *     {@link IridiumDestinationChangeType }
             *     
             */
            public IridiumDestinationChangeType getIridiumDestination4() {
                return iridiumDestination4;
            }

            /**
             * 设置iridiumDestination4属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link IridiumDestinationChangeType }
             *     
             */
            public void setIridiumDestination4(IridiumDestinationChangeType value) {
                this.iridiumDestination4 = value;
            }

            /**
             * 获取iridiumDestination5属性的值。
             * 
             * @return
             *     possible object is
             *     {@link IridiumDestinationChangeType }
             *     
             */
            public IridiumDestinationChangeType getIridiumDestination5() {
                return iridiumDestination5;
            }

            /**
             * 设置iridiumDestination5属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link IridiumDestinationChangeType }
             *     
             */
            public void setIridiumDestination5(IridiumDestinationChangeType value) {
                this.iridiumDestination5 = value;
            }

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
         *         &lt;element name="unblockDate" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}unblockDateType" minOccurs="0"/>
         *         &lt;element name="dataAccessProfile" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}magentaDataAccessProfileType" minOccurs="0"/>
         *         &lt;element name="fraudProfile" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}magentaFraudProfileType" minOccurs="0"/>
         *         &lt;element name="limitProfile" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}magentaLimitProfileType" minOccurs="0"/>
         *         &lt;element name="barringProfile" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}magentaBarringProfileType" minOccurs="0"/>
         *         &lt;element name="customerClient" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}customerClientType" minOccurs="0"/>
         *         &lt;element name="vehicle" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}vehicleType" minOccurs="0"/>
         *         &lt;element name="sn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}snType" minOccurs="0"/>
         *         &lt;element name="company" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}companyType" minOccurs="0"/>
         *         &lt;element name="simReturn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}magentaSimReturnType" minOccurs="0"/>
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
            "unblockDate",
            "dataAccessProfile",
            "fraudProfile",
            "limitProfile",
            "barringProfile",
            "customerClient",
            "vehicle",
            "sn",
            "company",
            "simReturn"
        })
        public static class MagentaChangeParams {

            protected String unblockDate;
            protected String dataAccessProfile;
            protected String fraudProfile;
            protected String limitProfile;
            protected String barringProfile;
            protected String customerClient;
            protected String vehicle;
            protected String sn;
            protected String company;
            protected String simReturn;

            /**
             * 获取unblockDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnblockDate() {
                return unblockDate;
            }

            /**
             * 设置unblockDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnblockDate(String value) {
                this.unblockDate = value;
            }

            /**
             * 获取dataAccessProfile属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDataAccessProfile() {
                return dataAccessProfile;
            }

            /**
             * 设置dataAccessProfile属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDataAccessProfile(String value) {
                this.dataAccessProfile = value;
            }

            /**
             * 获取fraudProfile属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFraudProfile() {
                return fraudProfile;
            }

            /**
             * 设置fraudProfile属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFraudProfile(String value) {
                this.fraudProfile = value;
            }

            /**
             * 获取limitProfile属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLimitProfile() {
                return limitProfile;
            }

            /**
             * 设置limitProfile属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLimitProfile(String value) {
                this.limitProfile = value;
            }

            /**
             * 获取barringProfile属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBarringProfile() {
                return barringProfile;
            }

            /**
             * 设置barringProfile属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBarringProfile(String value) {
                this.barringProfile = value;
            }

            /**
             * 获取customerClient属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerClient() {
                return customerClient;
            }

            /**
             * 设置customerClient属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerClient(String value) {
                this.customerClient = value;
            }

            /**
             * 获取vehicle属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVehicle() {
                return vehicle;
            }

            /**
             * 设置vehicle属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVehicle(String value) {
                this.vehicle = value;
            }

            /**
             * 获取sn属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSn() {
                return sn;
            }

            /**
             * 设置sn属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSn(String value) {
                this.sn = value;
            }

            /**
             * 获取company属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCompany() {
                return company;
            }

            /**
             * 设置company属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCompany(String value) {
                this.company = value;
            }

            /**
             * 获取simReturn属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSimReturn() {
                return simReturn;
            }

            /**
             * 设置simReturn属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSimReturn(String value) {
                this.simReturn = value;
            }

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
         *         &lt;element name="internetAddress" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}inetAddrType" minOccurs="0"/>
         *         &lt;element name="terminalType" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}termTypeType" minOccurs="0"/>
         *         &lt;element name="zone" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}zoneType" minOccurs="0"/>
         *         &lt;element name="deliveryPlan" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}deliveryPlanType" minOccurs="0"/>
         *         &lt;element name="xmlGatewayAccount" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}xmlGatewayAcctType" minOccurs="0"/>
         *         &lt;element name="messageBlocking" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}messageBlockingType" minOccurs="0"/>
         *         &lt;element name="ataUse" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}ataUseType" minOccurs="0"/>
         *         &lt;element name="ata" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
         *         &lt;element name="speedDial1" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
         *         &lt;element name="speedDial2" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
         *         &lt;element name="speedDial3" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
         *         &lt;element name="speedDial4" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
         *         &lt;element name="speedDial5" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
         *         &lt;element name="speedDial6" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
         *         &lt;element name="speedDial7" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
         *         &lt;element name="speedDial8" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType" minOccurs="0"/>
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
            "internetAddress",
            "terminalType",
            "zone",
            "deliveryPlan",
            "xmlGatewayAccount",
            "messageBlocking",
            "ataUse",
            "ata",
            "speedDial1",
            "speedDial2",
            "speedDial3",
            "speedDial4",
            "speedDial5",
            "speedDial6",
            "speedDial7",
            "speedDial8"
        })
        public static class OrbcommChangeParams {

            protected String internetAddress;
            @XmlSchemaType(name = "string")
            protected TermTypeType terminalType;
            protected String zone;
            protected Integer deliveryPlan;
            protected String xmlGatewayAccount;
            protected String messageBlocking;
            protected String ataUse;
            protected String ata;
            protected String speedDial1;
            protected String speedDial2;
            protected String speedDial3;
            protected String speedDial4;
            protected String speedDial5;
            protected String speedDial6;
            protected String speedDial7;
            protected String speedDial8;

            /**
             * 获取internetAddress属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInternetAddress() {
                return internetAddress;
            }

            /**
             * 设置internetAddress属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInternetAddress(String value) {
                this.internetAddress = value;
            }

            /**
             * 获取terminalType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link TermTypeType }
             *     
             */
            public TermTypeType getTerminalType() {
                return terminalType;
            }

            /**
             * 设置terminalType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link TermTypeType }
             *     
             */
            public void setTerminalType(TermTypeType value) {
                this.terminalType = value;
            }

            /**
             * 获取zone属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZone() {
                return zone;
            }

            /**
             * 设置zone属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZone(String value) {
                this.zone = value;
            }

            /**
             * 获取deliveryPlan属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getDeliveryPlan() {
                return deliveryPlan;
            }

            /**
             * 设置deliveryPlan属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setDeliveryPlan(Integer value) {
                this.deliveryPlan = value;
            }

            /**
             * 获取xmlGatewayAccount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXmlGatewayAccount() {
                return xmlGatewayAccount;
            }

            /**
             * 设置xmlGatewayAccount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXmlGatewayAccount(String value) {
                this.xmlGatewayAccount = value;
            }

            /**
             * 获取messageBlocking属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMessageBlocking() {
                return messageBlocking;
            }

            /**
             * 设置messageBlocking属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMessageBlocking(String value) {
                this.messageBlocking = value;
            }

            /**
             * 获取ataUse属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAtaUse() {
                return ataUse;
            }

            /**
             * 设置ataUse属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAtaUse(String value) {
                this.ataUse = value;
            }

            /**
             * 获取ata属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAta() {
                return ata;
            }

            /**
             * 设置ata属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAta(String value) {
                this.ata = value;
            }

            /**
             * 获取speedDial1属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSpeedDial1() {
                return speedDial1;
            }

            /**
             * 设置speedDial1属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSpeedDial1(String value) {
                this.speedDial1 = value;
            }

            /**
             * 获取speedDial2属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSpeedDial2() {
                return speedDial2;
            }

            /**
             * 设置speedDial2属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSpeedDial2(String value) {
                this.speedDial2 = value;
            }

            /**
             * 获取speedDial3属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSpeedDial3() {
                return speedDial3;
            }

            /**
             * 设置speedDial3属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSpeedDial3(String value) {
                this.speedDial3 = value;
            }

            /**
             * 获取speedDial4属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSpeedDial4() {
                return speedDial4;
            }

            /**
             * 设置speedDial4属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSpeedDial4(String value) {
                this.speedDial4 = value;
            }

            /**
             * 获取speedDial5属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSpeedDial5() {
                return speedDial5;
            }

            /**
             * 设置speedDial5属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSpeedDial5(String value) {
                this.speedDial5 = value;
            }

            /**
             * 获取speedDial6属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSpeedDial6() {
                return speedDial6;
            }

            /**
             * 设置speedDial6属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSpeedDial6(String value) {
                this.speedDial6 = value;
            }

            /**
             * 获取speedDial7属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSpeedDial7() {
                return speedDial7;
            }

            /**
             * 设置speedDial7属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSpeedDial7(String value) {
                this.speedDial7 = value;
            }

            /**
             * 获取speedDial8属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSpeedDial8() {
                return speedDial8;
            }

            /**
             * 设置speedDial8属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSpeedDial8(String value) {
                this.speedDial8 = value;
            }

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
         *         &lt;element name="smsBundle" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}tmobileSmsBundleType" minOccurs="0"/>
         *         &lt;element name="roaming" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}tmobileRoamingType" minOccurs="0"/>
         *         &lt;element name="blockVoice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="blockSmsFromIm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="blockSmsFromEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="blockAllSms" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
            "smsBundle",
            "roaming",
            "blockVoice",
            "blockSmsFromIm",
            "blockSmsFromEmail",
            "blockAllSms"
        })
        public static class TmobileChangeParams {

            protected String smsBundle;
            @XmlSchemaType(name = "string")
            protected TmobileRoamingType roaming;
            protected Boolean blockVoice;
            protected Boolean blockSmsFromIm;
            protected Boolean blockSmsFromEmail;
            protected Boolean blockAllSms;

            /**
             * 获取smsBundle属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSmsBundle() {
                return smsBundle;
            }

            /**
             * 设置smsBundle属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSmsBundle(String value) {
                this.smsBundle = value;
            }

            /**
             * 获取roaming属性的值。
             * 
             * @return
             *     possible object is
             *     {@link TmobileRoamingType }
             *     
             */
            public TmobileRoamingType getRoaming() {
                return roaming;
            }

            /**
             * 设置roaming属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link TmobileRoamingType }
             *     
             */
            public void setRoaming(TmobileRoamingType value) {
                this.roaming = value;
            }

            /**
             * 获取blockVoice属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isBlockVoice() {
                return blockVoice;
            }

            /**
             * 设置blockVoice属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setBlockVoice(Boolean value) {
                this.blockVoice = value;
            }

            /**
             * 获取blockSmsFromIm属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isBlockSmsFromIm() {
                return blockSmsFromIm;
            }

            /**
             * 设置blockSmsFromIm属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setBlockSmsFromIm(Boolean value) {
                this.blockSmsFromIm = value;
            }

            /**
             * 获取blockSmsFromEmail属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isBlockSmsFromEmail() {
                return blockSmsFromEmail;
            }

            /**
             * 设置blockSmsFromEmail属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setBlockSmsFromEmail(Boolean value) {
                this.blockSmsFromEmail = value;
            }

            /**
             * 获取blockAllSms属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isBlockAllSms() {
                return blockAllSms;
            }

            /**
             * 设置blockAllSms属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setBlockAllSms(Boolean value) {
                this.blockAllSms = value;
            }

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
         *         &lt;element name="imei" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imeiType"/>
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
            "imei"
        })
        public static class Verizon4GChangeParams {

            @XmlElement(required = true)
            protected String imei;

            /**
             * 获取imei属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getImei() {
                return imei;
            }

            /**
             * 设置imei属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setImei(String value) {
                this.imei = value;
            }

        }

    }

}
