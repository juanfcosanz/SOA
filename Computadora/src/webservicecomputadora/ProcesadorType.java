
package webservicecomputadora;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcesadorType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ProcesadorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="num_procesadores" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fabricante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nucleo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="velocidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cache" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="procesamiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcesadorType", propOrder = {
         "numProcesadores", "fabricante", "tipo", "modelo", "nucleo", "velocidad", "cache", "procesamiento"
    })
public class ProcesadorType {

    @XmlElement(name = "num_procesadores", required = true)
    protected String numProcesadores;
    @XmlElement(required = true)
    protected String fabricante;
    @XmlElement(required = true)
    protected String tipo;
    @XmlElement(required = true)
    protected String modelo;
    @XmlElement(required = true)
    protected String nucleo;
    @XmlElement(required = true)
    protected String velocidad;
    @XmlElement(required = true)
    protected String cache;
    @XmlElement(required = true)
    protected String procesamiento;

    /**
     * Gets the value of the numProcesadores property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumProcesadores() {
        return numProcesadores;
    }

    /**
     * Sets the value of the numProcesadores property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumProcesadores(String value) {
        this.numProcesadores = value;
    }

    /**
     * Gets the value of the fabricante property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * Sets the value of the fabricante property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFabricante(String value) {
        this.fabricante = value;
    }

    /**
     * Gets the value of the tipo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the modelo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Sets the value of the modelo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setModelo(String value) {
        this.modelo = value;
    }

    /**
     * Gets the value of the nucleo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNucleo() {
        return nucleo;
    }

    /**
     * Sets the value of the nucleo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNucleo(String value) {
        this.nucleo = value;
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

    /**
     * Gets the value of the cache property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCache() {
        return cache;
    }

    /**
     * Sets the value of the cache property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCache(String value) {
        this.cache = value;
    }

    /**
     * Gets the value of the procesamiento property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProcesamiento() {
        return procesamiento;
    }

    /**
     * Sets the value of the procesamiento property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProcesamiento(String value) {
        this.procesamiento = value;
    }

}
