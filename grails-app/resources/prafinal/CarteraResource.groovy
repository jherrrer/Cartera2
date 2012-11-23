package prafinal

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces


@Path('/api/cartera')
class CarteraResource {

    @GET
	@Path("{id}")
    @Produces('text/plain')
    String getCarteraRepresentation(@PathParam("id") String id) {
        Cartera cart=Cartera.get(Integer.parseInt(id));
		
		return String.valueOf(cart.getCC())+" "+String.valueOf(cart.getsale())+" "+String.valueOf(cart.getentra());
    }
  
}
