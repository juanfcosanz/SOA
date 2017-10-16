package webservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Encoded;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Path("webservice")
public class GenericResource {
    public GenericResource() {
    }


    @POST
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/addUser.do")

    public Response postData(@QueryParam("operatoraccount") String operatoraccount,
                             @QueryParam("operatorpwd") String operatorpwd, @QueryParam("operator") String operator,
                             @QueryParam("phonenumber") String phonenumber, @QueryParam("password") String password,
                             @QueryParam("usertype") String usertype) {

        //String parametros = "operatoraccount=string&operatorpwd=string&operator=string&orderBy=list&orderBy=list";

        if (phonenumber.isEmpty() || phonenumber.contentEquals("string")) {
            return Response.status(400)
                           .entity("Msisdn null")
                           .build();
        } else {
            //   /   parametros = parametros.replaceAll("\n","");
            ///  String [] arreglo=parametros.split("&");

            ///     System.out.print(arreglo.length);
            // list.add(mobil);
            // List<List<String>> list = new ArrayList<List<String>>();
            //  list.add(Arrays.asList("23123","1231","1313"));
            //  return Response.status(200).entity("Tu peticion ha sido correcta, los datos que introduciste fueron = " + operatoraccount +",  user= " + operatorpwd + " - " + orderBy.toString()).build();
            return Response.status(200)
                           .entity(phonenumber + "|" + password + "|1|" + "Operatoraccount or operatorpwd wrong|0|0")
                           .build();
        }
    }
/*
    @POST
    @Consumes("plain/text")
    @Produces("plain/text")
    @Path("/deleteUser.do")
    public Response getData(@QueryParam("operatoraccount") String operatoraccount,
                            @QueryParam("operatorpwd") String operatorpwd, @QueryParam("operator") String operator,
                            @QueryParam("phonenumber") String phonenumber) {

        if (phonenumber.isEmpty() || phonenumber.contentEquals("string")) {
            return Response.status(400)
                           .entity("Msisdn null")
                           .build();
        } else {
            return Response.status(200)
                           .entity(phonenumber + "|0|" + "Success")
                           .build();
        }
    }
*/
}
