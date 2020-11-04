
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
 *         &lt;element ref="{http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0}subscriberId"/>
 *         &lt;element ref="{http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0}carrier"/>
 *         &lt;element ref="{http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0}msisdn"/>
 *         &lt;element ref="{http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0}submittedOn"/>
 *         &lt;element ref="{http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0}completedOn"/>
 *         &lt;element ref="{http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0}status"/>
 *         &lt;element ref="{http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0}message"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
@XmlRootElement(name = "transaction", namespace = "http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0")
public class Transaction {

    @XmlElement(namespace = "http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0")
    protected String subscriberId;
    @XmlElement(namespace = "http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0", required = true)
    protected String carrier;
    @XmlElement(namespace = "http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0", required = true)
    protected String msisdn;
    @XmlElement(namespace = "http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submittedOn;
    @XmlElement(namespace = "http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0", required = true)
    protected XMLGregorianCalendar completedOn;
    @XmlElement(namespace = "http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0", required = true)
    protected String status;
    @XmlElement(namespace = "http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0", required = true, nillable = true)
    protected String message;

    /**
     * 获取subscriberId属性的值。
     */
    public String getSubscriberId() {
        return subscriberId;
    }

    /**
     * 设置subscriberId属性的值。
     */
    public void setSubscriberId(String value) {
        this.subscriberId = value;
    }

    /**
     * 获取carrier属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * 设置carrier属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

    /**
     * 获取msisdn属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * 设置msisdn属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

    /**
     * 获取submittedOn属性的值。
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getSubmittedOn() {
        return submittedOn;
    }

    /**
     * 设置submittedOn属性的值。
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setSubmittedOn(XMLGregorianCalendar value) {
        this.submittedOn = value;
    }

    /**
     * 获取completedOn属性的值。
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getCompletedOn() {
        return completedOn;
    }

    /**
     * 设置completedOn属性的值。
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setCompletedOn(XMLGregorianCalendar value) {
        this.completedOn = value;
    }

    /**
     * 获取status属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * 获取message属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置message属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMessage(String value) {
        this.message = value;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "subscriberId=" + subscriberId +
                ", carrier='" + carrier + '\'' +
                ", msisdn='" + msisdn + '\'' +
                ", submittedOn=" + submittedOn +
                ", completedOn=" + completedOn +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
