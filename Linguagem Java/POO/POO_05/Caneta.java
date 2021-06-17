package POO05;

public class Caneta {

	public String modelo;
	public float ponta;
	private String cor;
	private boolean tampa;
	
	public Caneta() { // Método construtor
		this.tampada();
		this.cor = "Azul";
	}
	public void tampada() {
		this.tampa = true;
	}
	
	public void destampada() {
		this.tampa = false;
	}
	
	public void status() {
		System.out.println("SOBRE A CANETA:\n");
		System.out.println("Cor:" + this.cor);
		System.out.println("Tampada: " + this.tampa);
	}
