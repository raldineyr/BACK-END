package POO01;

public class Caneta {

	// Atributos

	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampa;

	// métodos

	void status() {

		System.out.println("Modelo: " + this.modelo);
		System.out.println("\nUma caneta " + this.cor);
		System.out.println("\nPonta: " + this.ponta);
		System.out.println("\nCarga: " + this.carga + "%");
		System.out.print("\nUma caneta " + this.cor);
		System.out.println("\nEstá tampada? " + this.tampa + "\n");

	}

	void rabiscar() {
		
		if (this.tampa == true) System.out.println("ERRO! Não posso rabiscar.\n");	
		
		else System.out.println ("Estou rabiscando!\n");			
		
	}

	void tampada() {

		this.tampa = true;
	}

	void destampada() {

		this.tampa = false;
	}

}
