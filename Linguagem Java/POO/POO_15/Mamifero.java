package POO15;

public class Mamifero extends Animal{
	
	// Atributos
	
	private String pelo;
	
	// Métodos polimorficos 
		
	@Override
	public void locomover() {
		System.out.println("Correndo");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Mamando");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Som de mamífero");
	}

	// Métodos acessores e modificadores
	
	public String getPelo() {
		return pelo;
	}

	public void setPelo(String pelo) {
		this.pelo = pelo;
	}
	

}
