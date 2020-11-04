
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
 *         &lt;element ref="{http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0}operationId"/>
 *         &lt;element ref="{http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0}callbackId"/>
 *         &lt;element ref="{http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0}callbackEndpoint"/>
 *         &lt;element ref="{http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0}type"/>
 *         &lt;element ref="{http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0}status"/>
 *         &lt;element ref="{http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0}submittedBy"/>
 *         &lt;element ref="{http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0}submittedOn"/>
 *         &lt;element ref="{http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0}completedOn"/>
 *         &lt;element ref="{http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0}total"/>
 *         &lt;element ref="{http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0}inProgress"/>
 *         &lt;element ref="{http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0}success"/>
 *         &lt;element ref="{http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0}noChange"/>
 *         &lt;element ref="{http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0}failed"/>
 *         &lt;element ref="{http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0}pending"/>
 *         &lt;element ref="{http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0}transactions"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
@XmlRootElement(name = "operationCallback", namespace = "http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0")
public class OperationCallback {

    @XmlElement(namespace = "http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0")
    protected long operationId;
    @XmlElement(namespace = "http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0", required = true, nillable = true)
    protected String callbackId;
    @XmlElement(namespace = "http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String callbackEndpoint;
    @XmlElement(namespace = "http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0", required = true)
    protected String type;
    @XmlElement(namespace = "http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0", required = true)
    protected String status;
    @XmlElement(namespace = "http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0", required = true)
    protected String submittedBy;
    @XmlElement(namespace = "http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submittedOn;
    @XmlElement(namespace = "http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0", required = true)
    protected XMLGregorianCalendar completedOn;
    @XmlElement(namespace = "http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0")
    protected int total;
    @XmlElement(namespace = "http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0")
    protected int inProgress;
    @XmlElement(namespace = "http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0")
    protected int success;
    @XmlElement(namespace = "http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0")
    protected int noChange;
    @XmlElement(namespace = "http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0")
    protected int failed;
    @XmlElement(namespace = "http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0")
    protected int pending;
    @XmlElement(namespace = "http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0", required = true)
    protected Transactions transactions;

    /**
     * 获取operationId属性的值。
     */
    public long getOperationId() {
        return operationId;
    }

    /**
     * 设置operationId属性的值。
     */
    public void setOperationId(long value) {
        this.operationId = value;
    }

    /**
     * 获取callbackId属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getCallbackId() {
        return callbackId;
    }

    /**
     * 设置callbackId属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCallbackId(String value) {
        this.callbackId = value;
    }

    /**
     * 获取callbackEndpoint属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getCallbackEndpoint() {
        return callbackEndpoint;
    }

    /**
     * 设置callbackEndpoint属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCallbackEndpoint(String value) {
        this.callbackEndpoint = value;
    }

    /**
     * 获取type属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setType(String value) {
        this.type = value;
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
     * 获取submittedBy属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getSubmittedBy() {
        return submittedBy;
    }

    /**
     * 设置submittedBy属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSubmittedBy(String value) {
        this.submittedBy = value;
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
     * 获取total属性的值。
     */
    public int getTotal() {
        return total;
    }

    /**
     * 设置total属性的值。
     */
    public void setTotal(int value) {
        this.total = value;
    }

    /**
     * 获取inProgress属性的值。
     */
    public int getInProgress() {
        return inProgress;
    }

    /**
     * 设置inProgress属性的值。
     */
    public void setInProgress(int value) {
        this.inProgress = value;
    }

    /**
     * 获取success属性的值。
     */
    public int getSuccess() {
        return success;
    }

    /**
     * 设置success属性的值。
     */
    public void setSuccess(int value) {
        this.success = value;
    }

    /**
     * 获取noChange属性的值。
     */
    public int getNoChange() {
        return noChange;
    }

    /**
     * 设置noChange属性的值。
     */
    public void setNoChange(int value) {
        this.noChange = value;
    }

    /**
     * 获取failed属性的值。
     */
    public int getFailed() {
        return failed;
    }

    /**
     * 设置failed属性的值。
     */
    public void setFailed(int value) {
        this.failed = value;
    }

    /**
     * 获取pending属性的值。
     */
    public int getPending() {
        return pending;
    }

    /**
     * 设置pending属性的值。
     */
    public void setPending(int value) {
        this.pending = value;
    }

    /**
     * 获取transactions属性的值。
     *
     * @return possible object is
     * {@link Transactions }
     */
    public Transactions getTransactions() {
        return transactions;
    }

    /**
     * 设置transactions属性的值。
     *
     * @param value allowed object is
     *              {@link Transactions }
     */
    public void setTransactions(Transactions value) {
        this.transactions = value;
    }

    @Override
    public String toString() {
        return "OperationCallback{" +
                "operationId=" + operationId +
                ", callbackId='" + callbackId + '\'' +
                ", callbackEndpoint='" + callbackEndpoint + '\'' +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                ", submittedBy='" + submittedBy + '\'' +
                ", submittedOn=" + submittedOn +
                ", completedOn=" + completedOn +
                ", total=" + total +
                ", inProgress=" + inProgress +
                ", success=" + success +
                ", noChange=" + noChange +
                ", failed=" + failed +
                ", pending=" + pending +
                ", transactions=" + transactions +
                '}';
    }
}
