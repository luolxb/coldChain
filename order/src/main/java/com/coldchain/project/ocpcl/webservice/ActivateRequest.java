
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
 *         &lt;element name="activate" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="carrier" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}carrierTypeActivate"/>
 *                   &lt;element name="subscriberId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}subscriberIdType"/>
 *                   &lt;element name="accountSubaccount">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="account" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}accountType"/>
 *                             &lt;element name="subaccount" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}subaccountType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="pricePlan" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}pricePlanType"/>
 *                   &lt;element name="assetType" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}assetTypeNameType" minOccurs="0"/>
 *                   &lt;element name="assetId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}assetIdType" minOccurs="0"/>
 *                   &lt;element name="unitId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}unitIdType" minOccurs="0"/>
 *                   &lt;choice minOccurs="0">
 *                     &lt;element name="orbcommActivateParams">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="internetAddress" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}inetAddrType"/>
 *                               &lt;element name="terminalType" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}termTypeType"/>
 *                               &lt;element name="zone" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}zoneType"/>
 *                               &lt;element name="deliveryPlan" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}deliveryPlanType"/>
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
 *                     &lt;element name="inmarsatIdpActivateParams">
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
 *                     &lt;element name="iridiumActivateParams">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="iridiumDestination1" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationActivateType" minOccurs="0"/>
 *                               &lt;element name="iridiumDestination2" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationActivateType" minOccurs="0"/>
 *                               &lt;element name="iridiumDestination3" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationActivateType" minOccurs="0"/>
 *                               &lt;element name="iridiumDestination4" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationActivateType" minOccurs="0"/>
 *                               &lt;element name="iridiumDestination5" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationActivateType" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="tmobileActivateParams">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="roaming" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}tmobileRoamingType"/>
 *                               &lt;element name="blockVoice" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                               &lt;element name="blockSmsFromIm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                               &lt;element name="blockSmsFromEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                               &lt;element name="blockAllSms" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                               &lt;element name="smsBundle" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}tmobileSmsBundleType" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="verizon4gActivateParams">
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
 *                     &lt;element name="globalstarActivateParams">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="unitModel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                               &lt;element name="messageFilterProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                               &lt;element name="xmlGatewayAccount" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}xmlGatewayAcctType"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="globalSimActivateParams">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="smsOption" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}globalSimSmsOptionType"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="magentaActivateParams">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="dataAccessProfile" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}magentaDataAccessProfileType"/>
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
    "activate"
})
@XmlRootElement(name = "ActivateRequest")
public class ActivateRequest {

    protected String callbackEndpoint;
    protected String callbackId;
    @XmlElement(required = true)
    protected List<Activate> activate;

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
     * Gets the value of the activate property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activate property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivate().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Activate }
     *
     *
     */
    public List<Activate> getActivate() {
        if (activate == null) {
            activate = new ArrayList<Activate>();
        }
        return this.activate;
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
     *         &lt;element name="carrier" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}carrierTypeActivate"/>
     *         &lt;element name="subscriberId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}subscriberIdType"/>
     *         &lt;element name="accountSubaccount">
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
     *         &lt;element name="pricePlan" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}pricePlanType"/>
     *         &lt;element name="assetType" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}assetTypeNameType" minOccurs="0"/>
     *         &lt;element name="assetId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}assetIdType" minOccurs="0"/>
     *         &lt;element name="unitId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}unitIdType" minOccurs="0"/>
     *         &lt;choice minOccurs="0">
     *           &lt;element name="orbcommActivateParams">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="internetAddress" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}inetAddrType"/>
     *                     &lt;element name="terminalType" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}termTypeType"/>
     *                     &lt;element name="zone" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}zoneType"/>
     *                     &lt;element name="deliveryPlan" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}deliveryPlanType"/>
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
     *           &lt;element name="inmarsatIdpActivateParams">
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
     *           &lt;element name="iridiumActivateParams">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="iridiumDestination1" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationActivateType" minOccurs="0"/>
     *                     &lt;element name="iridiumDestination2" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationActivateType" minOccurs="0"/>
     *                     &lt;element name="iridiumDestination3" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationActivateType" minOccurs="0"/>
     *                     &lt;element name="iridiumDestination4" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationActivateType" minOccurs="0"/>
     *                     &lt;element name="iridiumDestination5" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationActivateType" minOccurs="0"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="tmobileActivateParams">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="roaming" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}tmobileRoamingType"/>
     *                     &lt;element name="blockVoice" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                     &lt;element name="blockSmsFromIm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                     &lt;element name="blockSmsFromEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                     &lt;element name="blockAllSms" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                     &lt;element name="smsBundle" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}tmobileSmsBundleType" minOccurs="0"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="verizon4gActivateParams">
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
     *           &lt;element name="globalstarActivateParams">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="unitModel" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                     &lt;element name="messageFilterProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                     &lt;element name="xmlGatewayAccount" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}xmlGatewayAcctType"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="globalSimActivateParams">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="smsOption" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}globalSimSmsOptionType"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="magentaActivateParams">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="dataAccessProfile" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}magentaDataAccessProfileType"/>
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
        "orbcommActivateParams",
        "inmarsatIdpActivateParams",
        "iridiumActivateParams",
        "tmobileActivateParams",
        "verizon4GActivateParams",
        "globalstarActivateParams",
        "globalSimActivateParams",
        "magentaActivateParams"
    })
    public static class Activate {

        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected CarrierTypeActivate carrier;
        @XmlElement(required = true)
        protected String subscriberId;
        @XmlElement(required = true)
        protected AccountSubaccount accountSubaccount;
        @XmlElement(required = true)
        protected String pricePlan;
        protected String assetType;
        protected String assetId;
        protected String unitId;
        protected OrbcommActivateParams orbcommActivateParams;
        protected InmarsatIdpActivateParams inmarsatIdpActivateParams;
        protected IridiumActivateParams iridiumActivateParams;
        protected TmobileActivateParams tmobileActivateParams;
        @XmlElement(name = "verizon4gActivateParams")
        protected Verizon4GActivateParams verizon4GActivateParams;
        protected GlobalstarActivateParams globalstarActivateParams;
        protected GlobalSimActivateParams globalSimActivateParams;
        protected MagentaActivateParams magentaActivateParams;

        /**
         * 获取carrier属性的值。
         *
         * @return
         *     possible object is
         *     {@link CarrierTypeActivate }
         *
         */
        public CarrierTypeActivate getCarrier() {
            return carrier;
        }

        /**
         * 设置carrier属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link CarrierTypeActivate }
         *
         */
        public void setCarrier(CarrierTypeActivate value) {
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
         * 获取orbcommActivateParams属性的值。
         *
         * @return
         *     possible object is
         *     {@link OrbcommActivateParams }
         *
         */
        public OrbcommActivateParams getOrbcommActivateParams() {
            return orbcommActivateParams;
        }

        /**
         * 设置orbcommActivateParams属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link OrbcommActivateParams }
         *
         */
        public void setOrbcommActivateParams(OrbcommActivateParams value) {
            this.orbcommActivateParams = value;
        }

        /**
         * 获取inmarsatIdpActivateParams属性的值。
         *
         * @return
         *     possible object is
         *     {@link InmarsatIdpActivateParams }
         *
         */
        public InmarsatIdpActivateParams getInmarsatIdpActivateParams() {
            return inmarsatIdpActivateParams;
        }

        /**
         * 设置inmarsatIdpActivateParams属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link InmarsatIdpActivateParams }
         *
         */
        public void setInmarsatIdpActivateParams(InmarsatIdpActivateParams value) {
            this.inmarsatIdpActivateParams = value;
        }

        /**
         * 获取iridiumActivateParams属性的值。
         *
         * @return
         *     possible object is
         *     {@link IridiumActivateParams }
         *
         */
        public IridiumActivateParams getIridiumActivateParams() {
            return iridiumActivateParams;
        }

        /**
         * 设置iridiumActivateParams属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link IridiumActivateParams }
         *
         */
        public void setIridiumActivateParams(IridiumActivateParams value) {
            this.iridiumActivateParams = value;
        }

        /**
         * 获取tmobileActivateParams属性的值。
         *
         * @return
         *     possible object is
         *     {@link TmobileActivateParams }
         *
         */
        public TmobileActivateParams getTmobileActivateParams() {
            return tmobileActivateParams;
        }

        /**
         * 设置tmobileActivateParams属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link TmobileActivateParams }
         *
         */
        public void setTmobileActivateParams(TmobileActivateParams value) {
            this.tmobileActivateParams = value;
        }

        /**
         * 获取verizon4GActivateParams属性的值。
         *
         * @return
         *     possible object is
         *     {@link Verizon4GActivateParams }
         *
         */
        public Verizon4GActivateParams getVerizon4GActivateParams() {
            return verizon4GActivateParams;
        }

        /**
         * 设置verizon4GActivateParams属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Verizon4GActivateParams }
         *
         */
        public void setVerizon4GActivateParams(Verizon4GActivateParams value) {
            this.verizon4GActivateParams = value;
        }

        /**
         * 获取globalstarActivateParams属性的值。
         *
         * @return
         *     possible object is
         *     {@link GlobalstarActivateParams }
         *
         */
        public GlobalstarActivateParams getGlobalstarActivateParams() {
            return globalstarActivateParams;
        }

        /**
         * 设置globalstarActivateParams属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link GlobalstarActivateParams }
         *
         */
        public void setGlobalstarActivateParams(GlobalstarActivateParams value) {
            this.globalstarActivateParams = value;
        }

        /**
         * 获取globalSimActivateParams属性的值。
         *
         * @return
         *     possible object is
         *     {@link GlobalSimActivateParams }
         *
         */
        public GlobalSimActivateParams getGlobalSimActivateParams() {
            return globalSimActivateParams;
        }

        /**
         * 设置globalSimActivateParams属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link GlobalSimActivateParams }
         *
         */
        public void setGlobalSimActivateParams(GlobalSimActivateParams value) {
            this.globalSimActivateParams = value;
        }

        /**
         * 获取magentaActivateParams属性的值。
         *
         * @return
         *     possible object is
         *     {@link MagentaActivateParams }
         *
         */
        public MagentaActivateParams getMagentaActivateParams() {
            return magentaActivateParams;
        }

        /**
         * 设置magentaActivateParams属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link MagentaActivateParams }
         *
         */
        public void setMagentaActivateParams(MagentaActivateParams value) {
            this.magentaActivateParams = value;
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
         *         &lt;element name="smsOption" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}globalSimSmsOptionType"/>
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
        public static class GlobalSimActivateParams {

            @XmlElement(required = true)
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
         *         &lt;element name="unitModel" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="messageFilterProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="xmlGatewayAccount" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}xmlGatewayAcctType"/>
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
        public static class GlobalstarActivateParams {

            @XmlElement(required = true)
            protected String unitModel;
            @XmlElement(required = true)
            protected String messageFilterProfile;
            @XmlElement(required = true)
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
        public static class InmarsatIdpActivateParams {

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
         *         &lt;element name="iridiumDestination1" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationActivateType" minOccurs="0"/>
         *         &lt;element name="iridiumDestination2" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationActivateType" minOccurs="0"/>
         *         &lt;element name="iridiumDestination3" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationActivateType" minOccurs="0"/>
         *         &lt;element name="iridiumDestination4" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationActivateType" minOccurs="0"/>
         *         &lt;element name="iridiumDestination5" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationActivateType" minOccurs="0"/>
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
        public static class IridiumActivateParams {

            protected IridiumDestinationActivateType iridiumDestination1;
            protected IridiumDestinationActivateType iridiumDestination2;
            protected IridiumDestinationActivateType iridiumDestination3;
            protected IridiumDestinationActivateType iridiumDestination4;
            protected IridiumDestinationActivateType iridiumDestination5;

            /**
             * 获取iridiumDestination1属性的值。
             * 
             * @return
             *     possible object is
             *     {@link IridiumDestinationActivateType }
             *     
             */
            public IridiumDestinationActivateType getIridiumDestination1() {
                return iridiumDestination1;
            }

            /**
             * 设置iridiumDestination1属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link IridiumDestinationActivateType }
             *     
             */
            public void setIridiumDestination1(IridiumDestinationActivateType value) {
                this.iridiumDestination1 = value;
            }

            /**
             * 获取iridiumDestination2属性的值。
             * 
             * @return
             *     possible object is
             *     {@link IridiumDestinationActivateType }
             *     
             */
            public IridiumDestinationActivateType getIridiumDestination2() {
                return iridiumDestination2;
            }

            /**
             * 设置iridiumDestination2属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link IridiumDestinationActivateType }
             *     
             */
            public void setIridiumDestination2(IridiumDestinationActivateType value) {
                this.iridiumDestination2 = value;
            }

            /**
             * 获取iridiumDestination3属性的值。
             * 
             * @return
             *     possible object is
             *     {@link IridiumDestinationActivateType }
             *     
             */
            public IridiumDestinationActivateType getIridiumDestination3() {
                return iridiumDestination3;
            }

            /**
             * 设置iridiumDestination3属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link IridiumDestinationActivateType }
             *     
             */
            public void setIridiumDestination3(IridiumDestinationActivateType value) {
                this.iridiumDestination3 = value;
            }

            /**
             * 获取iridiumDestination4属性的值。
             * 
             * @return
             *     possible object is
             *     {@link IridiumDestinationActivateType }
             *     
             */
            public IridiumDestinationActivateType getIridiumDestination4() {
                return iridiumDestination4;
            }

            /**
             * 设置iridiumDestination4属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link IridiumDestinationActivateType }
             *     
             */
            public void setIridiumDestination4(IridiumDestinationActivateType value) {
                this.iridiumDestination4 = value;
            }

            /**
             * 获取iridiumDestination5属性的值。
             * 
             * @return
             *     possible object is
             *     {@link IridiumDestinationActivateType }
             *     
             */
            public IridiumDestinationActivateType getIridiumDestination5() {
                return iridiumDestination5;
            }

            /**
             * 设置iridiumDestination5属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link IridiumDestinationActivateType }
             *     
             */
            public void setIridiumDestination5(IridiumDestinationActivateType value) {
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
         *         &lt;element name="dataAccessProfile" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}magentaDataAccessProfileType"/>
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
        public static class MagentaActivateParams {

            @XmlElement(required = true)
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
         *         &lt;element name="internetAddress" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}inetAddrType"/>
         *         &lt;element name="terminalType" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}termTypeType"/>
         *         &lt;element name="zone" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}zoneType"/>
         *         &lt;element name="deliveryPlan" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}deliveryPlanType"/>
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
        public static class OrbcommActivateParams {

            @XmlElement(required = true)
            protected String internetAddress;
            @XmlElement(required = true)
            @XmlSchemaType(name = "string")
            protected TermTypeType terminalType;
            @XmlElement(required = true)
            protected String zone;
            protected int deliveryPlan;
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
             */
            public int getDeliveryPlan() {
                return deliveryPlan;
            }

            /**
             * 设置deliveryPlan属性的值。
             * 
             */
            public void setDeliveryPlan(int value) {
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
         *         &lt;element name="roaming" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}tmobileRoamingType"/>
         *         &lt;element name="blockVoice" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="blockSmsFromIm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="blockSmsFromEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="blockAllSms" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="smsBundle" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}tmobileSmsBundleType" minOccurs="0"/>
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
            "roaming",
            "blockVoice",
            "blockSmsFromIm",
            "blockSmsFromEmail",
            "blockAllSms",
            "smsBundle"
        })
        public static class TmobileActivateParams {

            @XmlElement(required = true)
            @XmlSchemaType(name = "string")
            protected TmobileRoamingType roaming;
            protected boolean blockVoice;
            protected boolean blockSmsFromIm;
            protected boolean blockSmsFromEmail;
            protected boolean blockAllSms;
            protected String smsBundle;

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
             */
            public boolean isBlockVoice() {
                return blockVoice;
            }

            /**
             * 设置blockVoice属性的值。
             * 
             */
            public void setBlockVoice(boolean value) {
                this.blockVoice = value;
            }

            /**
             * 获取blockSmsFromIm属性的值。
             * 
             */
            public boolean isBlockSmsFromIm() {
                return blockSmsFromIm;
            }

            /**
             * 设置blockSmsFromIm属性的值。
             * 
             */
            public void setBlockSmsFromIm(boolean value) {
                this.blockSmsFromIm = value;
            }

            /**
             * 获取blockSmsFromEmail属性的值。
             * 
             */
            public boolean isBlockSmsFromEmail() {
                return blockSmsFromEmail;
            }

            /**
             * 设置blockSmsFromEmail属性的值。
             * 
             */
            public void setBlockSmsFromEmail(boolean value) {
                this.blockSmsFromEmail = value;
            }

            /**
             * 获取blockAllSms属性的值。
             * 
             */
            public boolean isBlockAllSms() {
                return blockAllSms;
            }

            /**
             * 设置blockAllSms属性的值。
             * 
             */
            public void setBlockAllSms(boolean value) {
                this.blockAllSms = value;
            }

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
        public static class Verizon4GActivateParams {

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
