package POO07;

public class Caneta {

	private String modelo;
	private float ponta;
	private String cor;
	private boolean tampa;
	
	public Caneta (String m, String c, float p) { // Método construtor
		
		this.modelo = m; // ou this.setModelo(m);
		this.cor = c;	 // ou this.setCor(c);
		this.ponta = p;  // ou this.setPonta(p);
		this.destampada();
		// Obs: Só pode ser realizado o nétodo (this.set) se houver setters e getters declarados na ação.
	
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
