
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
 *       &lt;choice>
 *         &lt;element name="operationId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}idAttrType"/>
 *         &lt;element name="callbackId" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}callbackIdType"/>
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
    "operationId",
    "callbackId"
})
@XmlRootElement(name = "OperationPollRequest")
public class OperationPollRequest {

    protected String operationId;
    protected String callbackId;

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

}
