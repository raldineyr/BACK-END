package POO15;

public class Cachorro extends Mamifero{
	
	//Métodos especiais
	
	public void enterrarOsso(){
		System.out.println("Enterrando um osso");
	}
	
	public void abanarRabo(){
		System.out.println("Abanando o rabo");
	}

	@Override
	public void emitirSom(){
		System.out.println("Latindo");
	}
	
	@Override 
	public void locomover(){
		System.out.println("'Caminhando'");
	}
	
	@Override
	public void alimentar(){
		System.out.println("Comendo ração");
	}
}
