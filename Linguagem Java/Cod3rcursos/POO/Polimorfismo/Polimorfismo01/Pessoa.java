package POO.Polimorfismo;
	//Fundamentos polimorfismo
public class Pessoa {

	private float peso;
	
	public Pessoa(float peso){
		setPeso(peso);
	}
	
	// Sobrecarga de métodos 
	
	public void comer(Comida comida){
		this.peso += comida.getPeso();
	}
	
	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		if (peso >= 0) this.peso = peso;
	}
	
}
