package POO04;

public class Caneta {

	public String modelo;
	public float ponta;
	
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
	
	public void status() {
		System.out.println("SOBRE A CANETA:\n");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
	}
}
