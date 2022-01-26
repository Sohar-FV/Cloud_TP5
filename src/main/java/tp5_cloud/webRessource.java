package tp5_cloud;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("web")
public class webRessource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("hello/{name}")
    public String getIt(@PathParam("name") String name) {
        return "Hello, "+name;
    }

    @GET
    @Path("hello")
    public String getIt() {
        return "Hello, World";
    }
}
