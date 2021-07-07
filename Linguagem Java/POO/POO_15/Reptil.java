package POO15;

public class Reptil extends Animal{
	
	// Atributos
	
	private String corEscama;
	
	// Métodos poliformicos
	
	@Override
	public void locomover() {
		System.out.println("Rastejando!");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo vegetais");	
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de réptil");
	}
	
	// Métodos acessores e modificadores

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

}
