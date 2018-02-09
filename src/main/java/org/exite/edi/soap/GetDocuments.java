
package org.exite.edi.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{http://soap.edi.exite.org}ediLogin" minOccurs="0"/>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
    "user",
    "fileName"
})
@XmlRootElement(name = "getDocuments")
public class GetDocuments {

    protected EdiLogin user;
    @XmlElement(nillable = true)
    protected List<String> fileName;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link EdiLogin }
     *     
     */
    public EdiLogin getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link EdiLogin }
     *     
     */
    public void setUser(EdiLogin value) {
        this.user = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFileName() {
        if (fileName == null) {
            fileName = new ArrayList<String>();
        }
        return this.fileName;
    }

}
