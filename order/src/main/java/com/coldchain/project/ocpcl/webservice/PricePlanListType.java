
package com.coldchain.project.ocpcl.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * A list of price plans.
 * 
 * <p>pricePlanListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="pricePlanListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pricePlan" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}pricePlanListEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pricePlanListType", namespace = "http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11", propOrder = {
    "pricePlan"
})
public class PricePlanListType {

    @XmlElement(namespace = "")
    protected List<PricePlanListEntryType> pricePlan;

    /**
     * Gets the value of the pricePlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricePlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricePlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricePlanListEntryType }
     * 
     * 
     */
    public List<PricePlanListEntryType> getPricePlan() {
        if (pricePlan == null) {
            pricePlan = new ArrayList<PricePlanListEntryType>();
        }
        return this.pricePlan;
    }

}
