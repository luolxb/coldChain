
package com.coldchain.project.ocpcl.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * A list of enterprise entries.
 * 
 * <p>enterpriseListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="enterpriseListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enterprise" type="{http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11}enterpriseListEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enterpriseListType", namespace = "http://www.orbcomm.com/xsd/OrbcommProvisioning/2012/11", propOrder = {
    "enterprise"
})
public class EnterpriseListType {

    @XmlElement(namespace = "")
    protected List<EnterpriseListEntryType> enterprise;

    /**
     * Gets the value of the enterprise property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enterprise property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnterprise().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnterpriseListEntryType }
     * 
     * 
     */
    public List<EnterpriseListEntryType> getEnterprise() {
        if (enterprise == null) {
            enterprise = new ArrayList<EnterpriseListEntryType>();
        }
        return this.enterprise;
    }

}
