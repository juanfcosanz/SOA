package webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
@WebService(wsdlLocation = "WEB-INF/wsdl/TestService.wsdl")
public class Test {
    public Test() {
        super();
    }

    @WebMethod
    public String saludo(@WebParam(name = "nombre") String nombre) {
        return "Hola "+nombre;
    }
}
