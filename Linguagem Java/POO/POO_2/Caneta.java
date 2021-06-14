package POO02;

public class Caneta {

	// Atributos

	public String modelo;
	public String cor;
	private float ponta;
	protected int carga; 
	private boolean tampa; 
	
	/* Se a o atributo conter a visibilidade privada ele tornasse
	indisponivel para alterações. */ 

	// métodos

	void status() {

		System.out.println("Modelo: " + this.modelo);
		System.out.println("\nUma caneta " + this.cor);
		System.out.println("\nPonta: " + this.ponta);
		System.out.println("\nCarga: " + this.carga + "%");
		System.out.print("\nUma caneta " + this.cor);
		System.out.println("\nCom tampa: " + this.tampa + "\n");

	}

	public void rabiscar() {
		
		if (this.tampa == true) System.out.println("ERRO! Não posso rabiscar.");	
		
		else System.out.println ("Estou rabiscando!");			
		
	}

	/* Manobra para utilizar um atributo mesmo se o mesmo 
	 estiver com o atributo publico. */	
	
	public void tampada() { 

		this.tampa = true;
	}

	public void destampada() {

		this.tampa = false;
	}

}
