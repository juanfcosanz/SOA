
package webservicecomputadora;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for perifericosType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="perifericosType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="altavoces" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="microfono" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mouse_inalambrico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="teclado_inalambrico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="webcam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="usb" type="{http://webservicecomputadora/}usbType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "perifericosType", propOrder = {
         "altavoces", "microfono", "mouseInalambrico", "tecladoInalambrico", "webcam", "usb"
    })
public class PerifericosType {

    @XmlElement(required = true)
    protected String altavoces;
    @XmlElement(required = true)
    protected String microfono;
    @XmlElement(name = "mouse_inalambrico", required = true)
    protected String mouseInalambrico;
    @XmlElement(name = "teclado_inalambrico", required = true)
    protected String tecladoInalambrico;
    @XmlElement(required = true)
    protected String webcam;
    @XmlElement(required = true)
    protected UsbType usb;

    /**
     * Gets the value of the altavoces property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAltavoces() {
        return altavoces;
    }

    /**
     * Sets the value of the altavoces property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAltavoces(String value) {
        this.altavoces = value;
    }

    /**
     * Gets the value of the microfono property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMicrofono() {
        return microfono;
    }

    /**
     * Sets the value of the microfono property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMicrofono(String value) {
        this.microfono = value;
    }

    /**
     * Gets the value of the mouseInalambrico property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMouseInalambrico() {
        return mouseInalambrico;
    }

    /**
     * Sets the value of the mouseInalambrico property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMouseInalambrico(String value) {
        this.mouseInalambrico = value;
    }

    /**
     * Gets the value of the tecladoInalambrico property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTecladoInalambrico() {
        return tecladoInalambrico;
    }

    /**
     * Sets the value of the tecladoInalambrico property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTecladoInalambrico(String value) {
        this.tecladoInalambrico = value;
    }

    /**
     * Gets the value of the webcam property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getWebcam() {
        return webcam;
    }

    /**
     * Sets the value of the webcam property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setWebcam(String value) {
        this.webcam = value;
    }

    /**
     * Gets the value of the usb property.
     *
     * @return
     *     possible object is
     *     {@link UsbType }
     *
     */
    public UsbType getUsb() {
        return usb;
    }

    /**
     * Sets the value of the usb property.
     *
     * @param value
     *     allowed object is
     *     {@link UsbType }
     *
     */
    public void setUsb(UsbType value) {
        this.usb = value;
    }

}
