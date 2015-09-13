package pl.switalla.rest.jetty.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/user")
public class UserResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response user(@QueryParam("name") String name) {
        return Response.ok(name + " ok test").build();
    }
}
