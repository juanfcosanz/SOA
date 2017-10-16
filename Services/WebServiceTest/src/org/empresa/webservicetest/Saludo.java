package org.empresa.webservicetest;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;
import org.apache.log4j.*;


@WebService
public class Saludo {
    private static Logger log = Logger.getLogger("log4j.xml");

    public Saludo() {
        super();
    }

    @WebMethod
    @Oneway
    public void saludar() {
        
                    if (log.isTraceEnabled())
                            {
                                log.trace("mensaje de trace");
                            }

                            if (log.isDebugEnabled())
                            {
                                log.debug("mensaje de debug");
                            }

                            if (log.isInfoEnabled())
                            {
                                log.info("mensaje de info");
                            }

                     
                    System.out.print("Holas");

                }

    @WebMethod(exclude = true)
    public static void main (String [ ] args) {
     
                            Saludo s1 = new Saludo();
                            s1.saludar();
     
            }
}
