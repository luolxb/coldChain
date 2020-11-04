
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
 *         &lt;element ref="{http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0}transaction" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "transaction"
})
@XmlRootElement(name = "transactions", namespace = "http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0")
public class Transactions {

    @XmlElement(namespace = "http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0")
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
     */
    public List<Transaction> getTransaction() {
        if (transaction == null) {
            transaction = new ArrayList<Transaction>();
        }
        return this.transaction;
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "transaction=" + transaction +
                '}';
    }
}
