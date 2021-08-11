package POO.Polimorfismo.Polimorfismo01;
	// Fundamentos polimorfismo
public class Comida {
	
private float peso;
	
	public Comida(float peso){
		setPeso(peso);
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		if (peso >= 0) this.peso = peso;
	}

}
