
package webservicecomputadora;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for almacenamientoType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="almacenamientoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="no_discos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="capacidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stringerfaz" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marca" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "almacenamientoType", propOrder = { "noDiscos", "capacidad", "stringerfaz", "marca" })
public class AlmacenamientoType {

    @XmlElement(name = "no_discos", required = true)
    protected String noDiscos;
    @XmlElement(required = true)
    protected String capacidad;
    @XmlElement(required = true)
    protected String stringerfaz;
    @XmlElement(required = true)
    protected String marca;

    /**
     * Gets the value of the noDiscos property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNoDiscos() {
        return noDiscos;
    }

    /**
     * Sets the value of the noDiscos property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNoDiscos(String value) {
        this.noDiscos = value;
    }

    /**
     * Gets the value of the capacidad property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCapacidad() {
        return capacidad;
    }

    /**
     * Sets the value of the capacidad property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCapacidad(String value) {
        this.capacidad = value;
    }

    /**
     * Gets the value of the stringerfaz property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStringerfaz() {
        return stringerfaz;
    }

    /**
     * Sets the value of the stringerfaz property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStringerfaz(String value) {
        this.stringerfaz = value;
    }

    /**
     * Gets the value of the marca property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Sets the value of the marca property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMarca(String value) {
        this.marca = value;
    }

}
