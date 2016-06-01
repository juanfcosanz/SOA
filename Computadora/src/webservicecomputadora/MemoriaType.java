
package webservicecomputadora;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for memoriaType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="memoriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tamaño" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tecnologia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estandar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="num_ranuras" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "memoriaType", propOrder = { "tama\u00f1o", "tecnologia", "estandar", "numRanuras" })
public class MemoriaType {

    @XmlElement(required = true)
    protected String tamaño;
    @XmlElement(required = true)
    protected String tecnologia;
    @XmlElement(required = true)
    protected String estandar;
    @XmlElement(name = "num_ranuras", required = true)
    protected String numRanuras;

    /**
     * Gets the value of the tamaño property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTamaño() {
        return tamaño;
    }

    /**
     * Sets the value of the tamaño property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTamaño(String value) {
        this.tamaño = value;
    }

    /**
     * Gets the value of the tecnologia property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTecnologia() {
        return tecnologia;
    }

    /**
     * Sets the value of the tecnologia property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTecnologia(String value) {
        this.tecnologia = value;
    }

    /**
     * Gets the value of the estandar property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEstandar() {
        return estandar;
    }

    /**
     * Sets the value of the estandar property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEstandar(String value) {
        this.estandar = value;
    }

    /**
     * Gets the value of the numRanuras property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumRanuras() {
        return numRanuras;
    }

    /**
     * Sets the value of the numRanuras property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumRanuras(String value) {
        this.numRanuras = value;
    }

}
