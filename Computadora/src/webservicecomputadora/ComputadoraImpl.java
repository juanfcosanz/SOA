package webservicecomputadora;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@javax.jws.soap.SOAPBinding(parameterStyle = javax.jws.soap.SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class })
@WebService(name = "Computadora", serviceName = "ComputadoraService", targetNamespace = "http://webservicecomputadora/",
            portName = "ComputadoraPort", wsdlLocation = "/WEB-INF/wsdl/ComputadoraService.wsdl")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class ComputadoraImpl {
    

    public ComputadoraImpl() {
    }

    @WebResult(name = "computadoraResponse", partName = "parameters", targetNamespace = "http://webservicecomputadora/")
    @Action(input = "http://webservicecomputadora/Computadora/computadoraRequest",
            output = "http://webservicecomputadora/Computadora/computadoraResponse")
    @WebMethod
    public ComputadoraResponse descripcionEquipo(@WebParam(name = "computadora", partName = "parameters",
                                                           targetNamespace = "http://webservicecomputadora/")
                                                 Computadora_Type parameters) {
        ComputadoraResponse obj = new ComputadoraResponse();
        obj.setStatus("OK");
        obj.setDescripcion("La solicitud fue atendida exitosamente");
        
        return obj;
    }
}
