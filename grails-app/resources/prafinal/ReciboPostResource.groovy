package prafinal

import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces
import javax.ws.rs.Consumes

@Path('/api/recibo/post')
class ReciboPostResource {

	
	@GET
	@Path("{cc}/{sale}/{entra}/{comentarios}")
	@Consumes('text/plain')
	@Produces('text/plain')
	String poner( @PathParam("cc") String cc, @PathParam("sale") String sale, @PathParam("entra") String entra, @PathParam("comentarios") String comentarios){

		Recibo rec=new Recibo(Integer.parseInt(cc),Integer.parseInt(sale),Integer.parseInt(entra),comentarios);
		
		rec.save();
		return "good";
	}
}

