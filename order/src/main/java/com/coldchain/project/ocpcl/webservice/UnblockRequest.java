
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
 *         &lt;element name="unblock" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="carrier" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}carrierType"/>
 *                   &lt;element name="subscriberId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}subscriberIdType"/>
 *                   &lt;element name="additionalVolume" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="addVolume" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="addVolumeUnit" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}additionalVolumeUnitType"/>
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
    "callbackEndpoint",
    "callbackId",
    "unblock"
})
@XmlRootElement(name = "UnblockRequest")
public class UnblockRequest {

    protected String callbackEndpoint;
    protected String callbackId;
    @XmlElement(required = true)
    protected List<Unblock> unblock;

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
     * Gets the value of the unblock property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unblock property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnblock().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Unblock }
     *
     *
     */
    public List<Unblock> getUnblock() {
        if (unblock == null) {
            unblock = new ArrayList<Unblock>();
        }
        return this.unblock;
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
     *         &lt;element name="additionalVolume" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="addVolume" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="addVolumeUnit" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}additionalVolumeUnitType"/>
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
        "carrier",
        "subscriberId",
        "additionalVolume"
    })
    public static class Unblock {

        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected CarrierType carrier;
        @XmlElement(required = true)
        protected String subscriberId;
        protected AdditionalVolume additionalVolume;

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
         * 获取additionalVolume属性的值。
         *
         * @return
         *     possible object is
         *     {@link AdditionalVolume }
         *
         */
        public AdditionalVolume getAdditionalVolume() {
            return additionalVolume;
        }

        /**
         * 设置additionalVolume属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link AdditionalVolume }
         *
         */
        public void setAdditionalVolume(AdditionalVolume value) {
            this.additionalVolume = value;
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
         *         &lt;element name="addVolume" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="addVolumeUnit" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}additionalVolumeUnitType"/>
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
            "addVolume",
            "addVolumeUnit"
        })
        public static class AdditionalVolume {

            protected int addVolume;
            @XmlElement(required = true)
            @XmlSchemaType(name = "string")
            protected AdditionalVolumeUnitType addVolumeUnit;

            /**
             * 获取addVolume属性的值。
             * 
             */
            public int getAddVolume() {
                return addVolume;
            }

            /**
             * 设置addVolume属性的值。
             * 
             */
            public void setAddVolume(int value) {
                this.addVolume = value;
            }

            /**
             * 获取addVolumeUnit属性的值。
             * 
             * @return
             *     possible object is
             *     {@link AdditionalVolumeUnitType }
             *     
             */
            public AdditionalVolumeUnitType getAddVolumeUnit() {
                return addVolumeUnit;
            }

            /**
             * 设置addVolumeUnit属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link AdditionalVolumeUnitType }
             *     
             */
            public void setAddVolumeUnit(AdditionalVolumeUnitType value) {
                this.addVolumeUnit = value;
            }

        }

    }

}
