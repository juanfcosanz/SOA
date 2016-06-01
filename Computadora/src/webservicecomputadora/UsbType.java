
package webservicecomputadora;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for usbType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="usbType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="frontales" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="posteriores" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="velocidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usbType", propOrder = { "numero", "frontales", "posteriores", "velocidad" })
public class UsbType {

    @XmlElement(required = true)
    protected String numero;
    @XmlElement(required = true)
    protected String frontales;
    @XmlElement(required = true)
    protected String posteriores;
    @XmlElement(required = true)
    protected String velocidad;

    /**
     * Gets the value of the numero property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Gets the value of the frontales property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFrontales() {
        return frontales;
    }

    /**
     * Sets the value of the frontales property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFrontales(String value) {
        this.frontales = value;
    }

    /**
     * Gets the value of the posteriores property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPosteriores() {
        return posteriores;
    }

    /**
     * Sets the value of the posteriores property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPosteriores(String value) {
        this.posteriores = value;
    }

    /**
     * Gets the value of the velocidad property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVelocidad() {
        return velocidad;
    }

    /**
     * Sets the value of the velocidad property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVelocidad(String value) {
        this.velocidad = value;
    }

}
