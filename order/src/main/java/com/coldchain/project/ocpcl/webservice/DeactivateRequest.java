
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
 *         &lt;element name="deactivate" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="carrier" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}carrierType"/>
 *                   &lt;element name="subscriberId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}subscriberIdType"/>
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
    "deactivate"
})
@XmlRootElement(name = "DeactivateRequest")
public class DeactivateRequest {

    protected String callbackEndpoint;
    protected String callbackId;
    @XmlElement(required = true)
    protected List<Deactivate> deactivate;

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
     * Gets the value of the deactivate property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deactivate property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeactivate().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Deactivate }
     *
     *
     */
    public List<Deactivate> getDeactivate() {
        if (deactivate == null) {
            deactivate = new ArrayList<Deactivate>();
        }
        return this.deactivate;
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
        "subscriberId"
    })
    public static class Deactivate {

        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected CarrierType carrier;
        @XmlElement(required = true)
        protected String subscriberId;

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

    }

}
