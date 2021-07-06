package POO15;

public class Canguru extends Mamifero {
	
	// Métodos especiais
	public void usarBolsa(){
		System.out.println("Usando bolsa");
	}
	
	@Override
	public void locomover(){
		System.out.println("Saltando");	
	}
	
}
