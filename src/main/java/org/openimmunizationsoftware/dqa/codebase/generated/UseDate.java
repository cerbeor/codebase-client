//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.28 at 12:30:21 PM EDT 
//


package org.openimmunizationsoftware.dqa.codebase.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="not-before" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="not-expected-before" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="not-expected-after" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="not-after" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "notBefore",
    "notExpectedBefore",
    "notExpectedAfter",
    "notAfter"
})
public class UseDate {

    @XmlElement(name = "not-before", required = true)
    protected String notBefore;
    @XmlElement(name = "not-expected-before", required = true)
    protected String notExpectedBefore;
    @XmlElement(name = "not-expected-after", required = true)
    protected String notExpectedAfter;
    @XmlElement(name = "not-after", required = true)
    protected String notAfter;

    /**
     * Gets the value of the notBefore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotBefore() {
        return notBefore;
    }

    /**
     * Sets the value of the notBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotBefore(String value) {
        this.notBefore = value;
    }

    /**
     * Gets the value of the notExpectedBefore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotExpectedBefore() {
        return notExpectedBefore;
    }

    /**
     * Sets the value of the notExpectedBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotExpectedBefore(String value) {
        this.notExpectedBefore = value;
    }

    /**
     * Gets the value of the notExpectedAfter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotExpectedAfter() {
        return notExpectedAfter;
    }

    /**
     * Sets the value of the notExpectedAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotExpectedAfter(String value) {
        this.notExpectedAfter = value;
    }

    /**
     * Gets the value of the notAfter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotAfter() {
        return notAfter;
    }

    /**
     * Sets the value of the notAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotAfter(String value) {
        this.notAfter = value;
    }

}
