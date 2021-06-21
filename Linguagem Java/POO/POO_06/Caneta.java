package POO06;

public class Caneta {

	public String modelo;
	public float ponta;
	private String cor;
	private boolean tampa;
	
	public Caneta() { // Método construtor
		this.tampada();
		this.cor = "Azul";
	}
	
	public String getModelo() {
		
		return this.modelo;
	}
	
	public void setModelo (String m) {
		
		this.modelo = m;
	}
	
	public float getPonta() {
		
		return this.ponta;
	}
	
	public void setPonta(float p) {
		this.ponta = p;
	}
	
	public void tampada() {
		this.tampa = true;
	}
	
	public void destampada() {
		this.tampa = false;
	}
	
	public void status() {
		System.out.println("SOBRE A CANETA:\n");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Cor:" + this.cor);
		System.out.println("Tampada: " + this.tampa);
	}
}
