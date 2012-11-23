package prafinal

class Cartera {
	
Integer CC;
Integer sale;
Integer entra;
static HasMany =[recibos : Recibo];
Cartera(Integer CC,
Integer sale,
Integer entra){
this.CC=CC;
this.sale=sale;
this.entra=entra;	
}
    static constraints = {
    }
	public Integer getCC(){
		return CC;
	}
	public Integer getsale(){
		return sale;
	}
	public Integer getentra(){
		return entra;
	}
}
