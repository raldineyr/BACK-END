package POO15;

public class Peixe extends Animal {

	private String corEscama;
	
	// Método especial
	
	public void saltarBolha(){
		System.out.println("Saltando bolhas");
	}
	
	// Métodos poliformicos 
	
	@Override
	public void locomover() {

		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		
		System.out.println("Comendo substâncias");
	}

	@Override
	public void emitirSom() {
		
		System.out.println("Peixe não faz som");
	}

	// Métodos acessores e modificadores 
	
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	
	
}
