
package com.coldchain.project.ocpcl.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
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
 *         &lt;element name="operation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="operationId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}idAttrType"/>
 *                   &lt;element name="callbackId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}callbackIdType"/>
 *                   &lt;element name="status" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}operationStatusType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="listSubscribers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="subscriberCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="subscriber" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="subscriberId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}subscriberIdType"/>
 *                             &lt;element name="carrier" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}carrierType"/>
 *                             &lt;element name="carrierDisplay" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="status" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}statusType"/>
 *                             &lt;element name="account" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}accountType"/>
 *                             &lt;element name="subaccount" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}subaccountStockType"/>
 *                             &lt;element name="pricePlan" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}pricePlanType"/>
 *                             &lt;element name="assetType" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}assetTypeNameType"/>
 *                             &lt;element name="assetId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}assetIdType"/>
 *                             &lt;element name="unitId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}unitIdType"/>
 *                             &lt;element name="saasUnitId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}saasUnitIdType" minOccurs="0"/>
 *                             &lt;element name="assigned" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="activated" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="lastModified" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="endBillDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="unsuspendDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;choice minOccurs="0">
 *                               &lt;element name="att">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
 *                                         &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="rogers">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
 *                                         &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="telefonica">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
 *                                         &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="chinaUnicom">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
 *                                         &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="vodafone">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
 *                                         &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="orbcomm">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="internetAddress" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}inetAddrType"/>
 *                                         &lt;element name="terminalType" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}termTypeType"/>
 *                                         &lt;element name="zone" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}zoneType"/>
 *                                         &lt;element name="deliveryPlan" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}deliveryPlanType"/>
 *                                         &lt;element name="xmlGatewayAccount" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}xmlGatewayAcctType"/>
 *                                         &lt;element name="messageBlocking" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}messageBlockingType"/>
 *                                         &lt;element name="ataUse" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}ataUseType"/>
 *                                         &lt;element name="ata" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
 *                                         &lt;element name="speedDial1" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
 *                                         &lt;element name="speedDial2" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
 *                                         &lt;element name="speedDial3" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
 *                                         &lt;element name="speedDial4" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
 *                                         &lt;element name="speedDial5" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
 *                                         &lt;element name="speedDial6" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
 *                                         &lt;element name="speedDial7" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
 *                                         &lt;element name="speedDial8" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="inmarsatIdp">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="xmlGatewayAccount" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}xmlGatewayAcctType"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="orange">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="serialNum" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}serialNumType"/>
 *                                         &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
 *                                         &lt;element name="imei" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imeiType"/>
 *                                         &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="tmobile">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
 *                                         &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
 *                                         &lt;element name="roaming" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}tmobileRoamingType"/>
 *                                         &lt;element name="blockVoice" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                         &lt;element name="blockSmsFromIm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                         &lt;element name="blockSmsFromEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                         &lt;element name="blockAllSms" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                         &lt;element name="smsBundle" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}tmobileSmsBundleType"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="verizon4g">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
 *                                         &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
 *                                         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="imei" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imeiType"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="verizonCdma">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="mdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
 *                                         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="globalstar">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="unitModel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="messageFilterProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="xmlGatewayAccount" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}xmlGatewayAcctType"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="iridium">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="iridiumDestination1" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationActivateType" minOccurs="0"/>
 *                                         &lt;element name="iridiumDestination2" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationActivateType" minOccurs="0"/>
 *                                         &lt;element name="iridiumDestination3" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationActivateType" minOccurs="0"/>
 *                                         &lt;element name="iridiumDestination4" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationActivateType" minOccurs="0"/>
 *                                         &lt;element name="iridiumDestination5" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}iridiumDestinationActivateType" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="globalSim">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
 *                                         &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
 *                                         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="smsOption" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="secondaryImsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
 *                                         &lt;element name="secondaryMsisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="magenta">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="dataAccessProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="fraudProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="limitProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="barringProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="customerClient" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="vehicle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="sn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="simReturn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="blockType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="unblockDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/choice>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="listEnterprises" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="enterpriseList" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}enterpriseListType"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="listOrganizations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="organizationList" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}organizationListType"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="listAccounts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="accountList" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}accountListType"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="listSubaccounts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="subaccountList" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}subaccountListType"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="createOrganization" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="organization" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}organizationType"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="createAccount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="account" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}accountType"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="createSubaccount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="subaccount" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}subaccountType"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="updateOrganization" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="updateAccount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="updateSubaccount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="operationPollResponse" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="operationId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}idAttrType"/>
 *                   &lt;element name="callbackId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}callbackIdType"/>
 *                   &lt;element name="callbackEndpoint" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}callbackEndpointType"/>
 *                   &lt;element name="type" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}operationType"/>
 *                   &lt;element name="status" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}operationStatusType"/>
 *                   &lt;element name="submittedBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="submittedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="completedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="inProgress" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="noChange" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="failed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="pending" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="transactions">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="transaction" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="subscriberId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}subscriberIdType"/>
 *                                       &lt;element name="carrier" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}carrierType"/>
 *                                       &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
 *                                       &lt;element name="submittedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                       &lt;element name="completedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                       &lt;element name="status" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}transactionStatusType"/>
 *                                       &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="listMessageFilterProfiles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="messageFilterProfile" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="rfChannel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="deltaTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="retries" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="retryMin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="retryMax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="powerLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="listZones" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="zone" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}zoneType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="listAssetTypes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assetType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="accountNumber" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}accountType"/>
 *                             &lt;element name="assetTypeName" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}assetTypeNameType"/>
 *                             &lt;element name="assetTypeAbbreviation" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}assetTypeNameAbbrType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="listDeliveryPlans" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="deliveryPlan" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="accountNumber" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}accountType"/>
 *                             &lt;element name="deliveryPlan" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}deliveryPlanType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
    "operation",
    "listSubscribers",
    "listEnterprises",
    "listOrganizations",
    "listAccounts",
    "listSubaccounts",
    "createOrganization",
    "createAccount",
    "createSubaccount",
    "updateOrganization",
    "updateAccount",
    "updateSubaccount",
    "operationPollResponse",
    "listMessageFilterProfiles",
    "listZones",
    "listAssetTypes",
    "listDeliveryPlans"
})
@XmlRootElement(name = "OperationResponse")
public class OperationResponse {

    protected Operation operation;
    protected ListSubscribers listSubscribers;
    protected ListEnterprises listEnterprises;
    protected ListOrganizations listOrganizations;
    protected ListAccounts listAccounts;
    protected ListSubaccounts listSubaccounts;
    protected CreateOrganization createOrganization;
    protected CreateAccount createAccount;
    protected CreateSubaccount createSubaccount;
    protected UpdateOrganization updateOrganization;
    protected UpdateAccount updateAccount;
    protected UpdateSubaccount updateSubaccount;
    protected OperationPollResponse operationPollResponse;
    protected ListMessageFilterProfiles listMessageFilterProfiles;
    protected ListZones listZones;
    protected ListAssetTypes listAssetTypes;
    protected ListDeliveryPlans listDeliveryPlans;

    /**
     * 获取operation属性的值。
     *
     * @return
     *     possible object is
     *     {@link Operation }
     *
     */
    public Operation getOperation() {
        return operation;
    }

    /**
     * 设置operation属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Operation }
     *
     */
    public void setOperation(Operation value) {
        this.operation = value;
    }

    /**
     * 获取listSubscribers属性的值。
     *
     * @return
     *     possible object is
     *     {@link ListSubscribers }
     *
     */
    public ListSubscribers getListSubscribers() {
        return listSubscribers;
    }

    /**
     * 设置listSubscribers属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ListSubscribers }
     *
     */
    public void setListSubscribers(ListSubscribers value) {
        this.listSubscribers = value;
    }

    /**
     * 获取listEnterprises属性的值。
     *
     * @return
     *     possible object is
     *     {@link ListEnterprises }
     *
     */
    public ListEnterprises getListEnterprises() {
        return listEnterprises;
    }

    /**
     * 设置listEnterprises属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ListEnterprises }
     *
     */
    public void setListEnterprises(ListEnterprises value) {
        this.listEnterprises = value;
    }

    /**
     * 获取listOrganizations属性的值。
     *
     * @return
     *     possible object is
     *     {@link ListOrganizations }
     *
     */
    public ListOrganizations getListOrganizations() {
        return listOrganizations;
    }

    /**
     * 设置listOrganizations属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ListOrganizations }
     *
     */
    public void setListOrganizations(ListOrganizations value) {
        this.listOrganizations = value;
    }

    /**
     * 获取listAccounts属性的值。
     *
     * @return
     *     possible object is
     *     {@link ListAccounts }
     *
     */
    public ListAccounts getListAccounts() {
        return listAccounts;
    }

    /**
     * 设置listAccounts属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ListAccounts }
     *
     */
    public void setListAccounts(ListAccounts value) {
        this.listAccounts = value;
    }

    /**
     * 获取listSubaccounts属性的值。
     *
     * @return
     *     possible object is
     *     {@link ListSubaccounts }
     *
     */
    public ListSubaccounts getListSubaccounts() {
        return listSubaccounts;
    }

    /**
     * 设置listSubaccounts属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ListSubaccounts }
     *
     */
    public void setListSubaccounts(ListSubaccounts value) {
        this.listSubaccounts = value;
    }

    /**
     * 获取createOrganization属性的值。
     *
     * @return
     *     possible object is
     *     {@link CreateOrganization }
     *
     */
    public CreateOrganization getCreateOrganization() {
        return createOrganization;
    }

    /**
     * 设置createOrganization属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CreateOrganization }
     *
     */
    public void setCreateOrganization(CreateOrganization value) {
        this.createOrganization = value;
    }

    /**
     * 获取createAccount属性的值。
     *
     * @return
     *     possible object is
     *     {@link CreateAccount }
     *
     */
    public CreateAccount getCreateAccount() {
        return createAccount;
    }

    /**
     * 设置createAccount属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CreateAccount }
     *
     */
    public void setCreateAccount(CreateAccount value) {
        this.createAccount = value;
    }

    /**
     * 获取createSubaccount属性的值。
     *
     * @return
     *     possible object is
     *     {@link CreateSubaccount }
     *
     */
    public CreateSubaccount getCreateSubaccount() {
        return createSubaccount;
    }

    /**
     * 设置createSubaccount属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CreateSubaccount }
     *
     */
    public void setCreateSubaccount(CreateSubaccount value) {
        this.createSubaccount = value;
    }

    /**
     * 获取updateOrganization属性的值。
     *
     * @return
     *     possible object is
     *     {@link UpdateOrganization }
     *
     */
    public UpdateOrganization getUpdateOrganization() {
        return updateOrganization;
    }

    /**
     * 设置updateOrganization属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link UpdateOrganization }
     *
     */
    public void setUpdateOrganization(UpdateOrganization value) {
        this.updateOrganization = value;
    }

    /**
     * 获取updateAccount属性的值。
     *
     * @return
     *     possible object is
     *     {@link UpdateAccount }
     *
     */
    public UpdateAccount getUpdateAccount() {
        return updateAccount;
    }

    /**
     * 设置updateAccount属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link UpdateAccount }
     *
     */
    public void setUpdateAccount(UpdateAccount value) {
        this.updateAccount = value;
    }

    /**
     * 获取updateSubaccount属性的值。
     *
     * @return
     *     possible object is
     *     {@link UpdateSubaccount }
     *
     */
    public UpdateSubaccount getUpdateSubaccount() {
        return updateSubaccount;
    }

    /**
     * 设置updateSubaccount属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link UpdateSubaccount }
     *
     */
    public void setUpdateSubaccount(UpdateSubaccount value) {
        this.updateSubaccount = value;
    }

    /**
     * 获取operationPollResponse属性的值。
     *
     * @return
     *     possible object is
     *     {@link OperationPollResponse }
     *
     */
    public OperationPollResponse getOperationPollResponse() {
        return operationPollResponse;
    }

    /**
     * 设置operationPollResponse属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link OperationPollResponse }
     *
     */
    public void setOperationPollResponse(OperationPollResponse value) {
        this.operationPollResponse = value;
    }

    /**
     * 获取listMessageFilterProfiles属性的值。
     *
     * @return
     *     possible object is
     *     {@link ListMessageFilterProfiles }
     *
     */
    public ListMessageFilterProfiles getListMessageFilterProfiles() {
        return listMessageFilterProfiles;
    }

    /**
     * 设置listMessageFilterProfiles属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ListMessageFilterProfiles }
     *
     */
    public void setListMessageFilterProfiles(ListMessageFilterProfiles value) {
        this.listMessageFilterProfiles = value;
    }

    /**
     * 获取listZones属性的值。
     *
     * @return
     *     possible object is
     *     {@link ListZones }
     *
     */
    public ListZones getListZones() {
        return listZones;
    }

    /**
     * 设置listZones属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ListZones }
     *
     */
    public void setListZones(ListZones value) {
        this.listZones = value;
    }

    /**
     * 获取listAssetTypes属性的值。
     *
     * @return
     *     possible object is
     *     {@link ListAssetTypes }
     *
     */
    public ListAssetTypes getListAssetTypes() {
        return listAssetTypes;
    }

    /**
     * 设置listAssetTypes属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ListAssetTypes }
     *
     */
    public void setListAssetTypes(ListAssetTypes value) {
        this.listAssetTypes = value;
    }

    /**
     * 获取listDeliveryPlans属性的值。
     *
     * @return
     *     possible object is
     *     {@link ListDeliveryPlans }
     *
     */
    public ListDeliveryPlans getListDeliveryPlans() {
        return listDeliveryPlans;
    }

    /**
     * 设置listDeliveryPlans属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ListDeliveryPlans }
     *
     */
    public void setListDeliveryPlans(ListDeliveryPlans value) {
        this.listDeliveryPlans = value;
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
     *       &lt;choice>
     *         &lt;element name="account" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}accountType"/>
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
        "account"
    })
    public static class CreateAccount {

        protected Integer account;

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
     *         &lt;element name="organization" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}organizationType"/>
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
        "organization"
    })
    public static class CreateOrganization {

        protected Integer organization;

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
     *       &lt;choice>
     *         &lt;element name="subaccount" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}subaccountType"/>
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
        "subaccount"
    })
    public static class CreateSubaccount {

        protected Integer subaccount;

        /**
         * 获取subaccount属性的值。
         *
         * @return
         *     possible object is
         *     {@link Integer }
         *
         */
        public Integer getSubaccount() {
            return subaccount;
        }

        /**
         * 设置subaccount属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Integer }
         *
         */
        public void setSubaccount(Integer value) {
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
     *       &lt;choice>
     *         &lt;element name="accountList" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}accountListType"/>
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
        "accountList"
    })
    public static class ListAccounts {

        protected AccountListType accountList;

        /**
         * 获取accountList属性的值。
         *
         * @return
         *     possible object is
         *     {@link AccountListType }
         *
         */
        public AccountListType getAccountList() {
            return accountList;
        }

        /**
         * 设置accountList属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link AccountListType }
         *
         */
        public void setAccountList(AccountListType value) {
            this.accountList = value;
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
     *         &lt;element name="assetType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="accountNumber" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}accountType"/>
     *                   &lt;element name="assetTypeName" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}assetTypeNameType"/>
     *                   &lt;element name="assetTypeAbbreviation" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}assetTypeNameAbbrType" minOccurs="0"/>
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
        "assetType"
    })
    public static class ListAssetTypes {

        protected List<AssetType> assetType;

        /**
         * Gets the value of the assetType property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assetType property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssetType().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AssetType }
         *
         *
         */
        public List<AssetType> getAssetType() {
            if (assetType == null) {
                assetType = new ArrayList<AssetType>();
            }
            return this.assetType;
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
         *         &lt;element name="accountNumber" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}accountType"/>
         *         &lt;element name="assetTypeName" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}assetTypeNameType"/>
         *         &lt;element name="assetTypeAbbreviation" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}assetTypeNameAbbrType" minOccurs="0"/>
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
            "accountNumber",
            "assetTypeName",
            "assetTypeAbbreviation"
        })
        public static class AssetType {

            protected int accountNumber;
            @XmlElement(required = true)
            protected String assetTypeName;
            protected String assetTypeAbbreviation;

            /**
             * 获取accountNumber属性的值。
             *
             */
            public int getAccountNumber() {
                return accountNumber;
            }

            /**
             * 设置accountNumber属性的值。
             *
             */
            public void setAccountNumber(int value) {
                this.accountNumber = value;
            }

            /**
             * 获取assetTypeName属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getAssetTypeName() {
                return assetTypeName;
            }

            /**
             * 设置assetTypeName属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setAssetTypeName(String value) {
                this.assetTypeName = value;
            }

            /**
             * 获取assetTypeAbbreviation属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getAssetTypeAbbreviation() {
                return assetTypeAbbreviation;
            }

            /**
             * 设置assetTypeAbbreviation属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setAssetTypeAbbreviation(String value) {
                this.assetTypeAbbreviation = value;
            }

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
     *         &lt;element name="deliveryPlan" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="accountNumber" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}accountType"/>
     *                   &lt;element name="deliveryPlan" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}deliveryPlanType"/>
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
        "deliveryPlan"
    })
    public static class ListDeliveryPlans {

        protected List<DeliveryPlan> deliveryPlan;

        /**
         * Gets the value of the deliveryPlan property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the deliveryPlan property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDeliveryPlan().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DeliveryPlan }
         *
         *
         */
        public List<DeliveryPlan> getDeliveryPlan() {
            if (deliveryPlan == null) {
                deliveryPlan = new ArrayList<DeliveryPlan>();
            }
            return this.deliveryPlan;
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
         *         &lt;element name="accountNumber" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}accountType"/>
         *         &lt;element name="deliveryPlan" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}deliveryPlanType"/>
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
            "accountNumber",
            "deliveryPlan"
        })
        public static class DeliveryPlan {

            protected int accountNumber;
            protected int deliveryPlan;

            /**
             * 获取accountNumber属性的值。
             *
             */
            public int getAccountNumber() {
                return accountNumber;
            }

            /**
             * 设置accountNumber属性的值。
             *
             */
            public void setAccountNumber(int value) {
                this.accountNumber = value;
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
     *       &lt;choice>
     *         &lt;element name="enterpriseList" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}enterpriseListType"/>
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
        "enterpriseList"
    })
    public static class ListEnterprises {

        protected EnterpriseListType enterpriseList;

        /**
         * 获取enterpriseList属性的值。
         *
         * @return
         *     possible object is
         *     {@link EnterpriseListType }
         *
         */
        public EnterpriseListType getEnterpriseList() {
            return enterpriseList;
        }

        /**
         * 设置enterpriseList属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link EnterpriseListType }
         *
         */
        public void setEnterpriseList(EnterpriseListType value) {
            this.enterpriseList = value;
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
     *         &lt;element name="messageFilterProfile" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="rfChannel" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="deltaTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="retries" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="retryMin" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="retryMax" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="powerLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "messageFilterProfile"
    })
    public static class ListMessageFilterProfiles {

        @XmlElement(required = true)
        protected List<MessageFilterProfile> messageFilterProfile;

        /**
         * Gets the value of the messageFilterProfile property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the messageFilterProfile property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMessageFilterProfile().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MessageFilterProfile }
         *
         *
         */
        public List<MessageFilterProfile> getMessageFilterProfile() {
            if (messageFilterProfile == null) {
                messageFilterProfile = new ArrayList<MessageFilterProfile>();
            }
            return this.messageFilterProfile;
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
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="rfChannel" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="deltaTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="retries" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="retryMin" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="retryMax" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="powerLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "name",
            "rfChannel",
            "offset",
            "deltaTime",
            "retries",
            "retryMin",
            "retryMax",
            "powerLevel"
        })
        public static class MessageFilterProfile {

            @XmlElement(required = true)
            protected String name;
            @XmlElement(required = true)
            protected String rfChannel;
            @XmlElement(required = true)
            protected String offset;
            @XmlElement(required = true)
            protected String deltaTime;
            @XmlElement(required = true)
            protected String retries;
            @XmlElement(required = true)
            protected String retryMin;
            @XmlElement(required = true)
            protected String retryMax;
            @XmlElement(required = true)
            protected String powerLevel;

            /**
             * 获取name属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getName() {
                return name;
            }

            /**
             * 设置name属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * 获取rfChannel属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getRfChannel() {
                return rfChannel;
            }

            /**
             * 设置rfChannel属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setRfChannel(String value) {
                this.rfChannel = value;
            }

            /**
             * 获取offset属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getOffset() {
                return offset;
            }

            /**
             * 设置offset属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setOffset(String value) {
                this.offset = value;
            }

            /**
             * 获取deltaTime属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDeltaTime() {
                return deltaTime;
            }

            /**
             * 设置deltaTime属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDeltaTime(String value) {
                this.deltaTime = value;
            }

            /**
             * 获取retries属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getRetries() {
                return retries;
            }

            /**
             * 设置retries属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setRetries(String value) {
                this.retries = value;
            }

            /**
             * 获取retryMin属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getRetryMin() {
                return retryMin;
            }

            /**
             * 设置retryMin属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setRetryMin(String value) {
                this.retryMin = value;
            }

            /**
             * 获取retryMax属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getRetryMax() {
                return retryMax;
            }

            /**
             * 设置retryMax属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setRetryMax(String value) {
                this.retryMax = value;
            }

            /**
             * 获取powerLevel属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getPowerLevel() {
                return powerLevel;
            }

            /**
             * 设置powerLevel属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPowerLevel(String value) {
                this.powerLevel = value;
            }

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
     *       &lt;choice>
     *         &lt;element name="organizationList" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}organizationListType"/>
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
        "organizationList"
    })
    public static class ListOrganizations {

        protected OrganizationListType organizationList;

        /**
         * 获取organizationList属性的值。
         *
         * @return
         *     possible object is
         *     {@link OrganizationListType }
         *
         */
        public OrganizationListType getOrganizationList() {
            return organizationList;
        }

        /**
         * 设置organizationList属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link OrganizationListType }
         *
         */
        public void setOrganizationList(OrganizationListType value) {
            this.organizationList = value;
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
     *       &lt;choice>
     *         &lt;element name="subaccountList" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}subaccountListType"/>
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
        "subaccountList"
    })
    public static class ListSubaccounts {

        protected SubaccountListType subaccountList;

        /**
         * 获取subaccountList属性的值。
         *
         * @return
         *     possible object is
         *     {@link SubaccountListType }
         *
         */
        public SubaccountListType getSubaccountList() {
            return subaccountList;
        }

        /**
         * 设置subaccountList属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link SubaccountListType }
         *
         */
        public void setSubaccountList(SubaccountListType value) {
            this.subaccountList = value;
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
     *         &lt;element name="subscriberCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="subscriber" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="subscriberId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}subscriberIdType"/>
     *                   &lt;element name="carrier" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}carrierType"/>
     *                   &lt;element name="carrierDisplay" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="status" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}statusType"/>
     *                   &lt;element name="account" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}accountType"/>
     *                   &lt;element name="subaccount" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}subaccountStockType"/>
     *                   &lt;element name="pricePlan" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}pricePlanType"/>
     *                   &lt;element name="assetType" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}assetTypeNameType"/>
     *                   &lt;element name="assetId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}assetIdType"/>
     *                   &lt;element name="unitId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}unitIdType"/>
     *                   &lt;element name="saasUnitId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}saasUnitIdType" minOccurs="0"/>
     *                   &lt;element name="assigned" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="activated" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="lastModified" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="endBillDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="unsuspendDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;choice minOccurs="0">
     *                     &lt;element name="att">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
     *                               &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="rogers">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
     *                               &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="telefonica">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
     *                               &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="chinaUnicom">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
     *                               &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="vodafone">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
     *                               &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="orbcomm">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="internetAddress" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}inetAddrType"/>
     *                               &lt;element name="terminalType" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}termTypeType"/>
     *                               &lt;element name="zone" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}zoneType"/>
     *                               &lt;element name="deliveryPlan" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}deliveryPlanType"/>
     *                               &lt;element name="xmlGatewayAccount" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}xmlGatewayAcctType"/>
     *                               &lt;element name="messageBlocking" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}messageBlockingType"/>
     *                               &lt;element name="ataUse" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}ataUseType"/>
     *                               &lt;element name="ata" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
     *                               &lt;element name="speedDial1" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
     *                               &lt;element name="speedDial2" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
     *                               &lt;element name="speedDial3" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
     *                               &lt;element name="speedDial4" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
     *                               &lt;element name="speedDial5" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
     *                               &lt;element name="speedDial6" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
     *                               &lt;element name="speedDial7" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
     *                               &lt;element name="speedDial8" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="inmarsatIdp">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="xmlGatewayAccount" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}xmlGatewayAcctType"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="orange">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="serialNum" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}serialNumType"/>
     *                               &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
     *                               &lt;element name="imei" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imeiType"/>
     *                               &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="tmobile">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
     *                               &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
     *                               &lt;element name="roaming" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}tmobileRoamingType"/>
     *                               &lt;element name="blockVoice" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                               &lt;element name="blockSmsFromIm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                               &lt;element name="blockSmsFromEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                               &lt;element name="blockAllSms" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                               &lt;element name="smsBundle" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}tmobileSmsBundleType"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="verizon4g">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
     *                               &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
     *                               &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                               &lt;element name="imei" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imeiType"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="verizonCdma">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="mdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
     *                               &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="globalstar">
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
     *                     &lt;element name="iridium">
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
     *                     &lt;element name="globalSim">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
     *                               &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
     *                               &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                               &lt;element name="smsOption" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                               &lt;element name="secondaryImsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
     *                               &lt;element name="secondaryMsisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="magenta">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="dataAccessProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                               &lt;element name="fraudProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                               &lt;element name="limitProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                               &lt;element name="barringProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                               &lt;element name="customerClient" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                               &lt;element name="vehicle" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                               &lt;element name="sn" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                               &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                               &lt;element name="simReturn" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                               &lt;element name="blockType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                               &lt;element name="unblockDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
        "subscriberCount",
        "subscriber"
    })
    public static class ListSubscribers {

        protected int subscriberCount;
        protected List<Subscriber> subscriber;

        /**
         * 获取subscriberCount属性的值。
         *
         */
        public int getSubscriberCount() {
            return subscriberCount;
        }

        /**
         * 设置subscriberCount属性的值。
         *
         */
        public void setSubscriberCount(int value) {
            this.subscriberCount = value;
        }

        /**
         * Gets the value of the subscriber property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subscriber property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubscriber().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Subscriber }
         *
         *
         */
        public List<Subscriber> getSubscriber() {
            if (subscriber == null) {
                subscriber = new ArrayList<Subscriber>();
            }
            return this.subscriber;
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
         *         &lt;element name="subscriberId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}subscriberIdType"/>
         *         &lt;element name="carrier" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}carrierType"/>
         *         &lt;element name="carrierDisplay" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="status" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}statusType"/>
         *         &lt;element name="account" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}accountType"/>
         *         &lt;element name="subaccount" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}subaccountStockType"/>
         *         &lt;element name="pricePlan" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}pricePlanType"/>
         *         &lt;element name="assetType" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}assetTypeNameType"/>
         *         &lt;element name="assetId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}assetIdType"/>
         *         &lt;element name="unitId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}unitIdType"/>
         *         &lt;element name="saasUnitId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}saasUnitIdType" minOccurs="0"/>
         *         &lt;element name="assigned" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="activated" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="lastModified" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="endBillDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="unsuspendDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;choice minOccurs="0">
         *           &lt;element name="att">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
         *                     &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="rogers">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
         *                     &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="telefonica">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
         *                     &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="chinaUnicom">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
         *                     &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="vodafone">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
         *                     &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="orbcomm">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="internetAddress" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}inetAddrType"/>
         *                     &lt;element name="terminalType" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}termTypeType"/>
         *                     &lt;element name="zone" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}zoneType"/>
         *                     &lt;element name="deliveryPlan" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}deliveryPlanType"/>
         *                     &lt;element name="xmlGatewayAccount" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}xmlGatewayAcctType"/>
         *                     &lt;element name="messageBlocking" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}messageBlockingType"/>
         *                     &lt;element name="ataUse" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}ataUseType"/>
         *                     &lt;element name="ata" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
         *                     &lt;element name="speedDial1" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
         *                     &lt;element name="speedDial2" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
         *                     &lt;element name="speedDial3" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
         *                     &lt;element name="speedDial4" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
         *                     &lt;element name="speedDial5" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
         *                     &lt;element name="speedDial6" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
         *                     &lt;element name="speedDial7" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
         *                     &lt;element name="speedDial8" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="inmarsatIdp">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="xmlGatewayAccount" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}xmlGatewayAcctType"/>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="orange">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="serialNum" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}serialNumType"/>
         *                     &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
         *                     &lt;element name="imei" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imeiType"/>
         *                     &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="tmobile">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
         *                     &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
         *                     &lt;element name="roaming" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}tmobileRoamingType"/>
         *                     &lt;element name="blockVoice" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                     &lt;element name="blockSmsFromIm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                     &lt;element name="blockSmsFromEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                     &lt;element name="blockAllSms" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                     &lt;element name="smsBundle" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}tmobileSmsBundleType"/>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="verizon4g">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
         *                     &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
         *                     &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                     &lt;element name="imei" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imeiType"/>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="verizonCdma">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="mdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
         *                     &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="globalstar">
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
         *           &lt;element name="iridium">
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
         *           &lt;element name="globalSim">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
         *                     &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
         *                     &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                     &lt;element name="smsOption" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                     &lt;element name="secondaryImsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
         *                     &lt;element name="secondaryMsisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="magenta">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="dataAccessProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                     &lt;element name="fraudProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                     &lt;element name="limitProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                     &lt;element name="barringProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                     &lt;element name="customerClient" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                     &lt;element name="vehicle" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                     &lt;element name="sn" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                     &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                     &lt;element name="simReturn" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                     &lt;element name="blockType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                     &lt;element name="unblockDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
            "subscriberId",
            "carrier",
            "carrierDisplay",
            "status",
            "account",
            "subaccount",
            "pricePlan",
            "assetType",
            "assetId",
            "unitId",
            "saasUnitId",
            "assigned",
            "activated",
            "lastModified",
            "endBillDate",
            "unsuspendDate",
            "att",
            "rogers",
            "telefonica",
            "chinaUnicom",
            "vodafone",
            "orbcomm",
            "inmarsatIdp",
            "orange",
            "tmobile",
            "verizon4G",
            "verizonCdma",
            "globalstar",
            "iridium",
            "globalSim",
            "magenta"
        })
        public static class Subscriber {

            @XmlElement(required = true)
            protected String subscriberId;
            @XmlElement(required = true)
            @XmlSchemaType(name = "string")
            protected CarrierType carrier;
            @XmlElement(required = true)
            protected String carrierDisplay;
            @XmlElement(required = true)
            @XmlSchemaType(name = "string")
            protected StatusType status;
            protected int account;
            @XmlElement(required = true)
            protected String subaccount;
            @XmlElement(required = true, nillable = true)
            protected String pricePlan;
            @XmlElement(required = true, nillable = true)
            protected String assetType;
            @XmlElement(required = true, nillable = true)
            protected String assetId;
            @XmlElement(required = true, nillable = true)
            protected String unitId;
            @XmlElementRef(name = "saasUnitId", namespace = "http://www.orbcomm.com/wsdl/OrbcommProvisioning-v1.0", type = JAXBElement.class, required = false)
            protected JAXBElement<String> saasUnitId;
            @XmlElement(required = true, nillable = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar assigned;
            @XmlElement(required = true, nillable = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar activated;
            @XmlElement(required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar lastModified;
            @XmlElement(required = true, nillable = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar endBillDate;
            @XmlElement(required = true, nillable = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar unsuspendDate;
            protected Att att;
            protected Rogers rogers;
            protected Telefonica telefonica;
            protected ChinaUnicom chinaUnicom;
            protected Vodafone vodafone;
            protected Orbcomm orbcomm;
            protected InmarsatIdp inmarsatIdp;
            protected Orange orange;
            protected Tmobile tmobile;
            @XmlElement(name = "verizon4g")
            protected Verizon4G verizon4G;
            protected VerizonCdma verizonCdma;
            protected Globalstar globalstar;
            protected Iridium iridium;
            protected GlobalSim globalSim;
            protected Magenta magenta;

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
             * 获取carrierDisplay属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCarrierDisplay() {
                return carrierDisplay;
            }

            /**
             * 设置carrierDisplay属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCarrierDisplay(String value) {
                this.carrierDisplay = value;
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
             * 获取saasUnitId属性的值。
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getSaasUnitId() {
                return saasUnitId;
            }

            /**
             * 设置saasUnitId属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setSaasUnitId(JAXBElement<String> value) {
                this.saasUnitId = value;
            }

            /**
             * 获取assigned属性的值。
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getAssigned() {
                return assigned;
            }

            /**
             * 设置assigned属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setAssigned(XMLGregorianCalendar value) {
                this.assigned = value;
            }

            /**
             * 获取activated属性的值。
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getActivated() {
                return activated;
            }

            /**
             * 设置activated属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setActivated(XMLGregorianCalendar value) {
                this.activated = value;
            }

            /**
             * 获取lastModified属性的值。
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getLastModified() {
                return lastModified;
            }

            /**
             * 设置lastModified属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setLastModified(XMLGregorianCalendar value) {
                this.lastModified = value;
            }

            /**
             * 获取endBillDate属性的值。
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getEndBillDate() {
                return endBillDate;
            }

            /**
             * 设置endBillDate属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setEndBillDate(XMLGregorianCalendar value) {
                this.endBillDate = value;
            }

            /**
             * 获取unsuspendDate属性的值。
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getUnsuspendDate() {
                return unsuspendDate;
            }

            /**
             * 设置unsuspendDate属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setUnsuspendDate(XMLGregorianCalendar value) {
                this.unsuspendDate = value;
            }

            /**
             * 获取att属性的值。
             *
             * @return
             *     possible object is
             *     {@link Att }
             *
             */
            public Att getAtt() {
                return att;
            }

            /**
             * 设置att属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Att }
             *
             */
            public void setAtt(Att value) {
                this.att = value;
            }

            /**
             * 获取rogers属性的值。
             *
             * @return
             *     possible object is
             *     {@link Rogers }
             *
             */
            public Rogers getRogers() {
                return rogers;
            }

            /**
             * 设置rogers属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Rogers }
             *
             */
            public void setRogers(Rogers value) {
                this.rogers = value;
            }

            /**
             * 获取telefonica属性的值。
             *
             * @return
             *     possible object is
             *     {@link Telefonica }
             *
             */
            public Telefonica getTelefonica() {
                return telefonica;
            }

            /**
             * 设置telefonica属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Telefonica }
             *
             */
            public void setTelefonica(Telefonica value) {
                this.telefonica = value;
            }

            /**
             * 获取chinaUnicom属性的值。
             *
             * @return
             *     possible object is
             *     {@link ChinaUnicom }
             *
             */
            public ChinaUnicom getChinaUnicom() {
                return chinaUnicom;
            }

            /**
             * 设置chinaUnicom属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link ChinaUnicom }
             *
             */
            public void setChinaUnicom(ChinaUnicom value) {
                this.chinaUnicom = value;
            }

            /**
             * 获取vodafone属性的值。
             *
             * @return
             *     possible object is
             *     {@link Vodafone }
             *
             */
            public Vodafone getVodafone() {
                return vodafone;
            }

            /**
             * 设置vodafone属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Vodafone }
             *
             */
            public void setVodafone(Vodafone value) {
                this.vodafone = value;
            }

            /**
             * 获取orbcomm属性的值。
             *
             * @return
             *     possible object is
             *     {@link Orbcomm }
             *
             */
            public Orbcomm getOrbcomm() {
                return orbcomm;
            }

            /**
             * 设置orbcomm属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Orbcomm }
             *
             */
            public void setOrbcomm(Orbcomm value) {
                this.orbcomm = value;
            }

            /**
             * 获取inmarsatIdp属性的值。
             *
             * @return
             *     possible object is
             *     {@link InmarsatIdp }
             *
             */
            public InmarsatIdp getInmarsatIdp() {
                return inmarsatIdp;
            }

            /**
             * 设置inmarsatIdp属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link InmarsatIdp }
             *
             */
            public void setInmarsatIdp(InmarsatIdp value) {
                this.inmarsatIdp = value;
            }

            /**
             * 获取orange属性的值。
             *
             * @return
             *     possible object is
             *     {@link Orange }
             *
             */
            public Orange getOrange() {
                return orange;
            }

            /**
             * 设置orange属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Orange }
             *
             */
            public void setOrange(Orange value) {
                this.orange = value;
            }

            /**
             * 获取tmobile属性的值。
             *
             * @return
             *     possible object is
             *     {@link Tmobile }
             *
             */
            public Tmobile getTmobile() {
                return tmobile;
            }

            /**
             * 设置tmobile属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Tmobile }
             *
             */
            public void setTmobile(Tmobile value) {
                this.tmobile = value;
            }

            /**
             * 获取verizon4G属性的值。
             *
             * @return
             *     possible object is
             *     {@link Verizon4G }
             *
             */
            public Verizon4G getVerizon4G() {
                return verizon4G;
            }

            /**
             * 设置verizon4G属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Verizon4G }
             *
             */
            public void setVerizon4G(Verizon4G value) {
                this.verizon4G = value;
            }

            /**
             * 获取verizonCdma属性的值。
             *
             * @return
             *     possible object is
             *     {@link VerizonCdma }
             *
             */
            public VerizonCdma getVerizonCdma() {
                return verizonCdma;
            }

            /**
             * 设置verizonCdma属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link VerizonCdma }
             *
             */
            public void setVerizonCdma(VerizonCdma value) {
                this.verizonCdma = value;
            }

            /**
             * 获取globalstar属性的值。
             *
             * @return
             *     possible object is
             *     {@link Globalstar }
             *
             */
            public Globalstar getGlobalstar() {
                return globalstar;
            }

            /**
             * 设置globalstar属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Globalstar }
             *
             */
            public void setGlobalstar(Globalstar value) {
                this.globalstar = value;
            }

            /**
             * 获取iridium属性的值。
             *
             * @return
             *     possible object is
             *     {@link Iridium }
             *
             */
            public Iridium getIridium() {
                return iridium;
            }

            /**
             * 设置iridium属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Iridium }
             *
             */
            public void setIridium(Iridium value) {
                this.iridium = value;
            }

            /**
             * 获取globalSim属性的值。
             *
             * @return
             *     possible object is
             *     {@link GlobalSim }
             *
             */
            public GlobalSim getGlobalSim() {
                return globalSim;
            }

            /**
             * 设置globalSim属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link GlobalSim }
             *
             */
            public void setGlobalSim(GlobalSim value) {
                this.globalSim = value;
            }

            /**
             * 获取magenta属性的值。
             *
             * @return
             *     possible object is
             *     {@link Magenta }
             *
             */
            public Magenta getMagenta() {
                return magenta;
            }

            /**
             * 设置magenta属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Magenta }
             *
             */
            public void setMagenta(Magenta value) {
                this.magenta = value;
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
             *         &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
             *         &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
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
                "imsi",
                "msisdn"
            })
            public static class Att {

                @XmlElement(required = true, nillable = true)
                protected String imsi;
                @XmlElement(required = true, nillable = true)
                protected String msisdn;

                /**
                 * 获取imsi属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getImsi() {
                    return imsi;
                }

                /**
                 * 设置imsi属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setImsi(String value) {
                    this.imsi = value;
                }

                /**
                 * 获取msisdn属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getMsisdn() {
                    return msisdn;
                }

                /**
                 * 设置msisdn属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setMsisdn(String value) {
                    this.msisdn = value;
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
             *         &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
             *         &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
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
                "imsi",
                "msisdn"
            })
            public static class ChinaUnicom {

                @XmlElement(required = true, nillable = true)
                protected String imsi;
                @XmlElement(required = true, nillable = true)
                protected String msisdn;

                /**
                 * 获取imsi属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getImsi() {
                    return imsi;
                }

                /**
                 * 设置imsi属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setImsi(String value) {
                    this.imsi = value;
                }

                /**
                 * 获取msisdn属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getMsisdn() {
                    return msisdn;
                }

                /**
                 * 设置msisdn属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setMsisdn(String value) {
                    this.msisdn = value;
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
             *         &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
             *         &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
             *         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="smsOption" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="secondaryImsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
             *         &lt;element name="secondaryMsisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
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
                "imsi",
                "msisdn",
                "ipAddress",
                "smsOption",
                "secondaryImsi",
                "secondaryMsisdn"
            })
            public static class GlobalSim {

                @XmlElement(required = true, nillable = true)
                protected String imsi;
                @XmlElement(required = true, nillable = true)
                protected String msisdn;
                @XmlElement(required = true, nillable = true)
                protected String ipAddress;
                @XmlElement(required = true)
                protected String smsOption;
                @XmlElement(required = true, nillable = true)
                protected String secondaryImsi;
                @XmlElement(required = true, nillable = true)
                protected String secondaryMsisdn;

                /**
                 * 获取imsi属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getImsi() {
                    return imsi;
                }

                /**
                 * 设置imsi属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setImsi(String value) {
                    this.imsi = value;
                }

                /**
                 * 获取msisdn属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getMsisdn() {
                    return msisdn;
                }

                /**
                 * 设置msisdn属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setMsisdn(String value) {
                    this.msisdn = value;
                }

                /**
                 * 获取ipAddress属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getIpAddress() {
                    return ipAddress;
                }

                /**
                 * 设置ipAddress属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setIpAddress(String value) {
                    this.ipAddress = value;
                }

                /**
                 * 获取smsOption属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getSmsOption() {
                    return smsOption;
                }

                /**
                 * 设置smsOption属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setSmsOption(String value) {
                    this.smsOption = value;
                }

                /**
                 * 获取secondaryImsi属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getSecondaryImsi() {
                    return secondaryImsi;
                }

                /**
                 * 设置secondaryImsi属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setSecondaryImsi(String value) {
                    this.secondaryImsi = value;
                }

                /**
                 * 获取secondaryMsisdn属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getSecondaryMsisdn() {
                    return secondaryMsisdn;
                }

                /**
                 * 设置secondaryMsisdn属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setSecondaryMsisdn(String value) {
                    this.secondaryMsisdn = value;
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
            public static class Globalstar {

                @XmlElement(required = true, nillable = true)
                protected String unitModel;
                @XmlElement(required = true, nillable = true)
                protected String messageFilterProfile;
                @XmlElement(required = true, nillable = true)
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
                "xmlGatewayAccount"
            })
            public static class InmarsatIdp {

                @XmlElement(required = true, nillable = true)
                protected String xmlGatewayAccount;

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
            public static class Iridium {

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
             *         &lt;element name="dataAccessProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="fraudProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="limitProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="barringProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="customerClient" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="vehicle" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="sn" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="simReturn" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="blockType" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="unblockDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
                "simReturn",
                "blockType",
                "unblockDate"
            })
            public static class Magenta {

                @XmlElement(required = true, nillable = true)
                protected String dataAccessProfile;
                @XmlElement(required = true, nillable = true)
                protected String fraudProfile;
                @XmlElement(required = true, nillable = true)
                protected String limitProfile;
                @XmlElement(required = true, nillable = true)
                protected String barringProfile;
                @XmlElement(required = true, nillable = true)
                protected String customerClient;
                @XmlElement(required = true, nillable = true)
                protected String vehicle;
                @XmlElement(required = true, nillable = true)
                protected String sn;
                @XmlElement(required = true, nillable = true)
                protected String company;
                @XmlElement(required = true, nillable = true)
                protected String simReturn;
                @XmlElement(required = true, nillable = true)
                protected String blockType;
                @XmlElement(required = true, nillable = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar unblockDate;

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

                /**
                 * 获取blockType属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getBlockType() {
                    return blockType;
                }

                /**
                 * 设置blockType属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setBlockType(String value) {
                    this.blockType = value;
                }

                /**
                 * 获取unblockDate属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *
                 */
                public XMLGregorianCalendar getUnblockDate() {
                    return unblockDate;
                }

                /**
                 * 设置unblockDate属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *
                 */
                public void setUnblockDate(XMLGregorianCalendar value) {
                    this.unblockDate = value;
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
             *         &lt;element name="serialNum" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}serialNumType"/>
             *         &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
             *         &lt;element name="imei" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imeiType"/>
             *         &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
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
                "serialNum",
                "imsi",
                "imei",
                "msisdn"
            })
            public static class Orange {

                @XmlElement(required = true)
                protected String serialNum;
                @XmlElement(required = true, nillable = true)
                protected String imsi;
                @XmlElement(required = true, nillable = true)
                protected String imei;
                @XmlElement(required = true, nillable = true)
                protected String msisdn;

                /**
                 * 获取serialNum属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getSerialNum() {
                    return serialNum;
                }

                /**
                 * 设置serialNum属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setSerialNum(String value) {
                    this.serialNum = value;
                }

                /**
                 * 获取imsi属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getImsi() {
                    return imsi;
                }

                /**
                 * 设置imsi属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setImsi(String value) {
                    this.imsi = value;
                }

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

                /**
                 * 获取msisdn属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getMsisdn() {
                    return msisdn;
                }

                /**
                 * 设置msisdn属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setMsisdn(String value) {
                    this.msisdn = value;
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
             *         &lt;element name="xmlGatewayAccount" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}xmlGatewayAcctType"/>
             *         &lt;element name="messageBlocking" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}messageBlockingType"/>
             *         &lt;element name="ataUse" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}ataUseType"/>
             *         &lt;element name="ata" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
             *         &lt;element name="speedDial1" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
             *         &lt;element name="speedDial2" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
             *         &lt;element name="speedDial3" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
             *         &lt;element name="speedDial4" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
             *         &lt;element name="speedDial5" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
             *         &lt;element name="speedDial6" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
             *         &lt;element name="speedDial7" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
             *         &lt;element name="speedDial8" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}emailType"/>
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
            public static class Orbcomm {

                @XmlElement(required = true)
                protected String internetAddress;
                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                protected TermTypeType terminalType;
                @XmlElement(required = true)
                protected String zone;
                protected int deliveryPlan;
                @XmlElement(required = true, nillable = true)
                protected String xmlGatewayAccount;
                @XmlElement(required = true, nillable = true)
                protected String messageBlocking;
                @XmlElement(required = true, nillable = true)
                protected String ataUse;
                @XmlElement(required = true, nillable = true)
                protected String ata;
                @XmlElement(required = true, nillable = true)
                protected String speedDial1;
                @XmlElement(required = true, nillable = true)
                protected String speedDial2;
                @XmlElement(required = true, nillable = true)
                protected String speedDial3;
                @XmlElement(required = true, nillable = true)
                protected String speedDial4;
                @XmlElement(required = true, nillable = true)
                protected String speedDial5;
                @XmlElement(required = true, nillable = true)
                protected String speedDial6;
                @XmlElement(required = true, nillable = true)
                protected String speedDial7;
                @XmlElement(required = true, nillable = true)
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
             *         &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
             *         &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
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
                "imsi",
                "msisdn"
            })
            public static class Rogers {

                @XmlElement(required = true, nillable = true)
                protected String imsi;
                @XmlElement(required = true, nillable = true)
                protected String msisdn;

                /**
                 * 获取imsi属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getImsi() {
                    return imsi;
                }

                /**
                 * 设置imsi属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setImsi(String value) {
                    this.imsi = value;
                }

                /**
                 * 获取msisdn属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getMsisdn() {
                    return msisdn;
                }

                /**
                 * 设置msisdn属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setMsisdn(String value) {
                    this.msisdn = value;
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
             *         &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
             *         &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
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
                "imsi",
                "msisdn"
            })
            public static class Telefonica {

                @XmlElement(required = true, nillable = true)
                protected String imsi;
                @XmlElement(required = true, nillable = true)
                protected String msisdn;

                /**
                 * 获取imsi属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getImsi() {
                    return imsi;
                }

                /**
                 * 设置imsi属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setImsi(String value) {
                    this.imsi = value;
                }

                /**
                 * 获取msisdn属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getMsisdn() {
                    return msisdn;
                }

                /**
                 * 设置msisdn属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setMsisdn(String value) {
                    this.msisdn = value;
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
             *         &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
             *         &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
             *         &lt;element name="roaming" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}tmobileRoamingType"/>
             *         &lt;element name="blockVoice" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *         &lt;element name="blockSmsFromIm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *         &lt;element name="blockSmsFromEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *         &lt;element name="blockAllSms" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *         &lt;element name="smsBundle" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}tmobileSmsBundleType"/>
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
                "imsi",
                "msisdn",
                "roaming",
                "blockVoice",
                "blockSmsFromIm",
                "blockSmsFromEmail",
                "blockAllSms",
                "smsBundle"
            })
            public static class Tmobile {

                @XmlElement(required = true)
                protected String imsi;
                @XmlElement(required = true, nillable = true)
                protected String msisdn;
                @XmlElement(required = true, nillable = true)
                @XmlSchemaType(name = "string")
                protected TmobileRoamingType roaming;
                @XmlElement(required = true, type = Boolean.class, nillable = true)
                protected Boolean blockVoice;
                @XmlElement(required = true, type = Boolean.class, nillable = true)
                protected Boolean blockSmsFromIm;
                @XmlElement(required = true, type = Boolean.class, nillable = true)
                protected Boolean blockSmsFromEmail;
                @XmlElement(required = true, type = Boolean.class, nillable = true)
                protected Boolean blockAllSms;
                @XmlElement(required = true, nillable = true)
                protected String smsBundle;

                /**
                 * 获取imsi属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getImsi() {
                    return imsi;
                }

                /**
                 * 设置imsi属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setImsi(String value) {
                    this.imsi = value;
                }

                /**
                 * 获取msisdn属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getMsisdn() {
                    return msisdn;
                }

                /**
                 * 设置msisdn属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setMsisdn(String value) {
                    this.msisdn = value;
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
             *         &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
             *         &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
             *         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "imsi",
                "msisdn",
                "ipAddress",
                "imei"
            })
            public static class Verizon4G {

                @XmlElement(required = true, nillable = true)
                protected String imsi;
                @XmlElement(required = true, nillable = true)
                protected String msisdn;
                @XmlElement(required = true, nillable = true)
                protected String ipAddress;
                @XmlElement(required = true, nillable = true)
                protected String imei;

                /**
                 * 获取imsi属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getImsi() {
                    return imsi;
                }

                /**
                 * 设置imsi属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setImsi(String value) {
                    this.imsi = value;
                }

                /**
                 * 获取msisdn属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getMsisdn() {
                    return msisdn;
                }

                /**
                 * 设置msisdn属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setMsisdn(String value) {
                    this.msisdn = value;
                }

                /**
                 * 获取ipAddress属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getIpAddress() {
                    return ipAddress;
                }

                /**
                 * 设置ipAddress属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setIpAddress(String value) {
                    this.ipAddress = value;
                }

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
             *         &lt;element name="mdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
             *         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "mdn",
                "ipAddress"
            })
            public static class VerizonCdma {

                @XmlElement(required = true, nillable = true)
                protected String mdn;
                @XmlElement(required = true, nillable = true)
                protected String ipAddress;

                /**
                 * 获取mdn属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getMdn() {
                    return mdn;
                }

                /**
                 * 设置mdn属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setMdn(String value) {
                    this.mdn = value;
                }

                /**
                 * 获取ipAddress属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getIpAddress() {
                    return ipAddress;
                }

                /**
                 * 设置ipAddress属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setIpAddress(String value) {
                    this.ipAddress = value;
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
             *         &lt;element name="imsi" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}imsiType"/>
             *         &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
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
                "imsi",
                "msisdn"
            })
            public static class Vodafone {

                @XmlElement(required = true)
                protected String imsi;
                @XmlElement(required = true, nillable = true)
                protected String msisdn;

                /**
                 * 获取imsi属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getImsi() {
                    return imsi;
                }

                /**
                 * 设置imsi属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setImsi(String value) {
                    this.imsi = value;
                }

                /**
                 * 获取msisdn属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getMsisdn() {
                    return msisdn;
                }

                /**
                 * 设置msisdn属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setMsisdn(String value) {
                    this.msisdn = value;
                }

            }

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
     *         &lt;element name="zone" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}zoneType" maxOccurs="unbounded"/>
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
        "zone"
    })
    public static class ListZones {

        @XmlElement(required = true)
        protected List<String> zone;

        /**
         * Gets the value of the zone property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the zone property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getZone().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         *
         *
         */
        public List<String> getZone() {
            if (zone == null) {
                zone = new ArrayList<String>();
            }
            return this.zone;
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
     *         &lt;element name="operationId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}idAttrType"/>
     *         &lt;element name="callbackId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}callbackIdType"/>
     *         &lt;element name="status" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}operationStatusType"/>
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
        "operationId",
        "callbackId",
        "status"
    })
    public static class Operation {

        @XmlElement(required = true)
        protected String operationId;
        @XmlElement(required = true, nillable = true)
        protected String callbackId;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected OperationStatusType status;

        /**
         * 获取operationId属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getOperationId() {
            return operationId;
        }

        /**
         * 设置operationId属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setOperationId(String value) {
            this.operationId = value;
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
         * 获取status属性的值。
         *
         * @return
         *     possible object is
         *     {@link OperationStatusType }
         *
         */
        public OperationStatusType getStatus() {
            return status;
        }

        /**
         * 设置status属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link OperationStatusType }
         *
         */
        public void setStatus(OperationStatusType value) {
            this.status = value;
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
     *         &lt;element name="operationId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}idAttrType"/>
     *         &lt;element name="callbackId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}callbackIdType"/>
     *         &lt;element name="callbackEndpoint" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}callbackEndpointType"/>
     *         &lt;element name="type" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}operationType"/>
     *         &lt;element name="status" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}operationStatusType"/>
     *         &lt;element name="submittedBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="submittedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="completedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="inProgress" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="noChange" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="failed" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="pending" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="transactions">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="transaction" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="subscriberId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}subscriberIdType"/>
     *                             &lt;element name="carrier" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}carrierType"/>
     *                             &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
     *                             &lt;element name="submittedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                             &lt;element name="completedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                             &lt;element name="status" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}transactionStatusType"/>
     *                             &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
        "operationId",
        "callbackId",
        "callbackEndpoint",
        "type",
        "status",
        "submittedBy",
        "submittedOn",
        "completedOn",
        "total",
        "inProgress",
        "success",
        "noChange",
        "failed",
        "pending",
        "transactions"
    })
    public static class OperationPollResponse {

        @XmlElement(required = true)
        protected String operationId;
        @XmlElement(required = true, nillable = true)
        protected String callbackId;
        @XmlElement(required = true, nillable = true)
        protected String callbackEndpoint;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected OperationType type;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected OperationStatusType status;
        @XmlElement(required = true)
        protected String submittedBy;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar submittedOn;
        @XmlElement(required = true, nillable = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar completedOn;
        protected int total;
        protected int inProgress;
        protected int success;
        protected int noChange;
        protected int failed;
        protected int pending;
        @XmlElement(required = true)
        protected Transactions transactions;

        /**
         * 获取operationId属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getOperationId() {
            return operationId;
        }

        /**
         * 设置operationId属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setOperationId(String value) {
            this.operationId = value;
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
         * 获取type属性的值。
         *
         * @return
         *     possible object is
         *     {@link OperationType }
         *
         */
        public OperationType getType() {
            return type;
        }

        /**
         * 设置type属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link OperationType }
         *
         */
        public void setType(OperationType value) {
            this.type = value;
        }

        /**
         * 获取status属性的值。
         *
         * @return
         *     possible object is
         *     {@link OperationStatusType }
         *
         */
        public OperationStatusType getStatus() {
            return status;
        }

        /**
         * 设置status属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link OperationStatusType }
         *
         */
        public void setStatus(OperationStatusType value) {
            this.status = value;
        }

        /**
         * 获取submittedBy属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getSubmittedBy() {
            return submittedBy;
        }

        /**
         * 设置submittedBy属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setSubmittedBy(String value) {
            this.submittedBy = value;
        }

        /**
         * 获取submittedOn属性的值。
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public XMLGregorianCalendar getSubmittedOn() {
            return submittedOn;
        }

        /**
         * 设置submittedOn属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setSubmittedOn(XMLGregorianCalendar value) {
            this.submittedOn = value;
        }

        /**
         * 获取completedOn属性的值。
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public XMLGregorianCalendar getCompletedOn() {
            return completedOn;
        }

        /**
         * 设置completedOn属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setCompletedOn(XMLGregorianCalendar value) {
            this.completedOn = value;
        }

        /**
         * 获取total属性的值。
         *
         */
        public int getTotal() {
            return total;
        }

        /**
         * 设置total属性的值。
         *
         */
        public void setTotal(int value) {
            this.total = value;
        }

        /**
         * 获取inProgress属性的值。
         *
         */
        public int getInProgress() {
            return inProgress;
        }

        /**
         * 设置inProgress属性的值。
         *
         */
        public void setInProgress(int value) {
            this.inProgress = value;
        }

        /**
         * 获取success属性的值。
         *
         */
        public int getSuccess() {
            return success;
        }

        /**
         * 设置success属性的值。
         *
         */
        public void setSuccess(int value) {
            this.success = value;
        }

        /**
         * 获取noChange属性的值。
         *
         */
        public int getNoChange() {
            return noChange;
        }

        /**
         * 设置noChange属性的值。
         *
         */
        public void setNoChange(int value) {
            this.noChange = value;
        }

        /**
         * 获取failed属性的值。
         *
         */
        public int getFailed() {
            return failed;
        }

        /**
         * 设置failed属性的值。
         *
         */
        public void setFailed(int value) {
            this.failed = value;
        }

        /**
         * 获取pending属性的值。
         *
         */
        public int getPending() {
            return pending;
        }

        /**
         * 设置pending属性的值。
         *
         */
        public void setPending(int value) {
            this.pending = value;
        }

        /**
         * 获取transactions属性的值。
         *
         * @return
         *     possible object is
         *     {@link Transactions }
         *
         */
        public Transactions getTransactions() {
            return transactions;
        }

        /**
         * 设置transactions属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Transactions }
         *
         */
        public void setTransactions(Transactions value) {
            this.transactions = value;
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
         *         &lt;element name="transaction" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="subscriberId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}subscriberIdType"/>
         *                   &lt;element name="carrier" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}carrierType"/>
         *                   &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
         *                   &lt;element name="submittedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *                   &lt;element name="completedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *                   &lt;element name="status" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}transactionStatusType"/>
         *                   &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "transaction"
        })
        public static class Transactions {

            protected List<Transaction> transaction;

            /**
             * Gets the value of the transaction property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the transaction property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTransaction().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Transaction }
             *
             *
             */
            public List<Transaction> getTransaction() {
                if (transaction == null) {
                    transaction = new ArrayList<Transaction>();
                }
                return this.transaction;
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
             *         &lt;element name="subscriberId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}subscriberIdType"/>
             *         &lt;element name="carrier" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}carrierType"/>
             *         &lt;element name="msisdn" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}msisdnType"/>
             *         &lt;element name="submittedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
             *         &lt;element name="completedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
             *         &lt;element name="status" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}transactionStatusType"/>
             *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "subscriberId",
                "carrier",
                "msisdn",
                "submittedOn",
                "completedOn",
                "status",
                "message"
            })
            public static class Transaction {

                @XmlElement(required = true)
                protected String subscriberId;
                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                protected CarrierType carrier;
                @XmlElement(required = true, nillable = true)
                protected String msisdn;
                @XmlElement(required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar submittedOn;
                @XmlElement(required = true, nillable = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar completedOn;
                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                protected TransactionStatusType status;
                @XmlElement(required = true, nillable = true)
                protected String message;

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
                 * 获取msisdn属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMsisdn() {
                    return msisdn;
                }

                /**
                 * 设置msisdn属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMsisdn(String value) {
                    this.msisdn = value;
                }

                /**
                 * 获取submittedOn属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getSubmittedOn() {
                    return submittedOn;
                }

                /**
                 * 设置submittedOn属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setSubmittedOn(XMLGregorianCalendar value) {
                    this.submittedOn = value;
                }

                /**
                 * 获取completedOn属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getCompletedOn() {
                    return completedOn;
                }

                /**
                 * 设置completedOn属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setCompletedOn(XMLGregorianCalendar value) {
                    this.completedOn = value;
                }

                /**
                 * 获取status属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link TransactionStatusType }
                 *     
                 */
                public TransactionStatusType getStatus() {
                    return status;
                }

                /**
                 * 设置status属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TransactionStatusType }
                 *     
                 */
                public void setStatus(TransactionStatusType value) {
                    this.status = value;
                }

                /**
                 * 获取message属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMessage() {
                    return message;
                }

                /**
                 * 设置message属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMessage(String value) {
                    this.message = value;
                }

            }

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
     *       &lt;choice>
     *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "message"
    })
    public static class UpdateAccount {

        protected String message;

        /**
         * 获取message属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMessage() {
            return message;
        }

        /**
         * 设置message属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMessage(String value) {
            this.message = value;
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
     *       &lt;choice>
     *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "message"
    })
    public static class UpdateOrganization {

        protected String message;

        /**
         * 获取message属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMessage() {
            return message;
        }

        /**
         * 设置message属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMessage(String value) {
            this.message = value;
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
     *       &lt;choice>
     *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "message"
    })
    public static class UpdateSubaccount {

        protected String message;

        /**
         * 获取message属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMessage() {
            return message;
        }

        /**
         * 设置message属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMessage(String value) {
            this.message = value;
        }

    }

}
