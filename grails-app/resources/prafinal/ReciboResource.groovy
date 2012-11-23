package prafinal

import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces
import javax.ws.rs.Consumes

@Path('/api/recibo')
class ReciboResource {

	@GET
	@Path("{id}")
    @Produces('text/plain')
    String getCarteraRepresentation(@PathParam("id") String id) {
        Recibo rec=Recibo.get(Integer.parseInt(id));
		
		return String.valueOf(rec.getCC())+" "+String.valueOf(rec.getsale())+" "+String.valueOf(rec.getentra())+" "+String.valueOf(rec.getComentarios());
    }
	/*
	@GET
	@Path("post/{id}/{num}/{cc}/{sale}/{entra}/{comentarios}")
	@Consumes('text/plain')
	@Produces('text/plain')
    String poner(@PathParam("id") String id,@PathParam("num") String num, @PathParam("cc") String cc, @PathParam("sale") String sale, @PathParam("entra") String entra, @PathParam("comentarios") String comentarios){
		Cartera cart=Cartera.get(id);
		Recibo rec=new Recibo(Integer.parseInt(num),Integer.parseInt(cc),Integer.parseInt(sale),Integer.parseInt(entra),comentarios);
		
		rec.save(id);
		return "good";
	}*/
}
