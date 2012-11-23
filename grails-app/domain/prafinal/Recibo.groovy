package prafinal

class Recibo {
Integer cc;
Integer sale;
Integer entra;
String comentarios;
static HasOne=[cartera : Cartera];
Recibo(
Integer cc,
Integer sale,
Integer entra,String comentarios){
this.cc=cc;
this.sale=sale;
this.entra=entra;
this.comentarios=comentarios;
}
    static constraints = {
    }
	public Integer getCC(){
		return cc;
	}
	public Integer getsale(){
		return sale;
	}
	public Integer getentra(){
		return entra;
	}
	public String getComentarios(){
		return comentarios;
	}
}


