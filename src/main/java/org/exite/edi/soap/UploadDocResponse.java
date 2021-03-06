
package org.exite.edi.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadDocResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uploadDocResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://soap.edi.exite.org/}ediResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadDocResponse", propOrder = {
    "result"
})
public class UploadDocResponse {

    protected EdiResponse result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link EdiResponse }
     *     
     */
    public EdiResponse getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link EdiResponse }
     *     
     */
    public void setResult(EdiResponse value) {
        this.result = value;
    }

}
