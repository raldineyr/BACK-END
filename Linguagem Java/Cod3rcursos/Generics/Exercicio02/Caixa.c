package Generics;

public class Caixa <GENERICS> {
	
	private GENERICS coisa;
	
	
	public void guardar(GENERICS coisa) {	
		this.coisa = coisa;
	}
	
	public GENERICS abrir() {
		return coisa;
	}

}
