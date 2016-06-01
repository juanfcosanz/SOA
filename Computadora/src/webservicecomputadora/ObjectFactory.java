
package webservicecomputadora;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the webservicecomputadora package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Computadora_QNAME = new QName("http://webservicecomputadora/", "computadora");
    private final static QName _ComputadoraResponse_QNAME =
        new QName("http://webservicecomputadora/", "computadoraResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservicecomputadora
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Computadora_Type }
     *
     */
    public Computadora_Type createComputadora_Type() {
        return new Computadora_Type();
    }

    /**
     * Create an instance of {@link ComputadoraResponse }
     *
     */
    public ComputadoraResponse createComputadoraResponse() {
        return new ComputadoraResponse();
    }

    /**
     * Create an instance of {@link PerifericosType }
     *
     */
    public PerifericosType createPerifericosType() {
        return new PerifericosType();
    }

    /**
     * Create an instance of {@link UsbType }
     *
     */
    public UsbType createUsbType() {
        return new UsbType();
    }

    /**
     * Create an instance of {@link AlmacenamientoType }
     *
     */
    public AlmacenamientoType createAlmacenamientoType() {
        return new AlmacenamientoType();
    }

    /**
     * Create an instance of {@link MemoriaType }
     *
     */
    public MemoriaType createMemoriaType() {
        return new MemoriaType();
    }

    /**
     * Create an instance of {@link ProcesadorType }
     *
     */
    public ProcesadorType createProcesadorType() {
        return new ProcesadorType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Computadora_Type }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservicecomputadora/", name = "computadora")
    public JAXBElement<Computadora_Type> createComputadora(Computadora_Type value) {
        return new JAXBElement<Computadora_Type>(_Computadora_QNAME, Computadora_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComputadoraResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservicecomputadora/", name = "computadoraResponse")
    public JAXBElement<ComputadoraResponse> createComputadoraResponse(ComputadoraResponse value) {
        return new JAXBElement<ComputadoraResponse>(_ComputadoraResponse_QNAME, ComputadoraResponse.class, null, value);
    }

}
