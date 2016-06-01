
package webservicecomputadora;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for computadora complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="computadora">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="equipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marca" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="procesador" type="{http://webservicecomputadora/}ProcesadorType"/>
 *         &lt;element name="memoria" type="{http://webservicecomputadora/}memoriaType"/>
 *         &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="altura" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="anchura" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="almacenamiento" type="{http://webservicecomputadora/}almacenamientoType"/>
 *         &lt;element name="profundidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="peso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sistema_operativo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="perifericos" type="{http://webservicecomputadora/}perifericosType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "computadora", propOrder = {
         "equipo", "marca", "modelo", "procesador", "memoria", "color", "altura", "anchura", "almacenamiento",
         "profundidad", "peso", "sistemaOperativo", "perifericos"
    })
public class Computadora_Type {

    @XmlElement(required = true)
    protected String equipo;
    @XmlElement(required = true)
    protected String marca;
    @XmlElement(required = true)
    protected String modelo;
    @XmlElement(required = true)
    protected ProcesadorType procesador;
    @XmlElement(required = true)
    protected MemoriaType memoria;
    @XmlElement(required = true)
    protected String color;
    @XmlElement(required = true)
    protected String altura;
    @XmlElement(required = true)
    protected String anchura;
    @XmlElement(required = true)
    protected AlmacenamientoType almacenamiento;
    @XmlElement(required = true)
    protected String profundidad;
    @XmlElement(required = true)
    protected String peso;
    @XmlElement(name = "sistema_operativo", required = true)
    protected String sistemaOperativo;
    @XmlElement(required = true)
    protected PerifericosType perifericos;

    /**
     * Gets the value of the equipo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEquipo() {
        return equipo;
    }

    /**
     * Sets the value of the equipo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEquipo(String value) {
        this.equipo = value;
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
     * Gets the value of the procesador property.
     *
     * @return
     *     possible object is
     *     {@link ProcesadorType }
     *
     */
    public ProcesadorType getProcesador() {
        return procesador;
    }

    /**
     * Sets the value of the procesador property.
     *
     * @param value
     *     allowed object is
     *     {@link ProcesadorType }
     *
     */
    public void setProcesador(ProcesadorType value) {
        this.procesador = value;
    }

    /**
     * Gets the value of the memoria property.
     *
     * @return
     *     possible object is
     *     {@link MemoriaType }
     *
     */
    public MemoriaType getMemoria() {
        return memoria;
    }

    /**
     * Sets the value of the memoria property.
     *
     * @param value
     *     allowed object is
     *     {@link MemoriaType }
     *
     */
    public void setMemoria(MemoriaType value) {
        this.memoria = value;
    }

    /**
     * Gets the value of the color property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the altura property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAltura() {
        return altura;
    }

    /**
     * Sets the value of the altura property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAltura(String value) {
        this.altura = value;
    }

    /**
     * Gets the value of the anchura property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAnchura() {
        return anchura;
    }

    /**
     * Sets the value of the anchura property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAnchura(String value) {
        this.anchura = value;
    }

    /**
     * Gets the value of the almacenamiento property.
     *
     * @return
     *     possible object is
     *     {@link AlmacenamientoType }
     *
     */
    public AlmacenamientoType getAlmacenamiento() {
        return almacenamiento;
    }

    /**
     * Sets the value of the almacenamiento property.
     *
     * @param value
     *     allowed object is
     *     {@link AlmacenamientoType }
     *
     */
    public void setAlmacenamiento(AlmacenamientoType value) {
        this.almacenamiento = value;
    }

    /**
     * Gets the value of the profundidad property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProfundidad() {
        return profundidad;
    }

    /**
     * Sets the value of the profundidad property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProfundidad(String value) {
        this.profundidad = value;
    }

    /**
     * Gets the value of the peso property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPeso() {
        return peso;
    }

    /**
     * Sets the value of the peso property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPeso(String value) {
        this.peso = value;
    }

    /**
     * Gets the value of the sistemaOperativo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    /**
     * Sets the value of the sistemaOperativo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSistemaOperativo(String value) {
        this.sistemaOperativo = value;
    }

    /**
     * Gets the value of the perifericos property.
     *
     * @return
     *     possible object is
     *     {@link PerifericosType }
     *
     */
    public PerifericosType getPerifericos() {
        return perifericos;
    }

    /**
     * Sets the value of the perifericos property.
     *
     * @param value
     *     allowed object is
     *     {@link PerifericosType }
     *
     */
    public void setPerifericos(PerifericosType value) {
        this.perifericos = value;
    }

}
