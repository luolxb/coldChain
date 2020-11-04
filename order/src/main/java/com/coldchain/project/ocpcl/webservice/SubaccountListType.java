
package com.coldchain.project.ocpcl.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * A list of subaccount entries.
 * 
 * <p>subaccountListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="subaccountListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subaccount" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}subaccountListEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subaccountListType", namespace = "http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11", propOrder = {
    "subaccount"
})
public class SubaccountListType {

    @XmlElement(namespace = "")
    protected List<SubaccountListEntryType> subaccount;

    /**
     * Gets the value of the subaccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subaccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubaccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubaccountListEntryType }
     * 
     * 
     */
    public List<SubaccountListEntryType> getSubaccount() {
        if (subaccount == null) {
            subaccount = new ArrayList<SubaccountListEntryType>();
        }
        return this.subaccount;
    }

}
