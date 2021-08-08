package POO.Heranca05;
// Desafio construtor

public class Fusca extends Carro{

	/* Podemos resolver o problema utilizando ou o construtor super ou o this. Porém,
	 * ao utilizar o this nos possibilita ter outros tipos de inicilização dos construtores.*/
	
	Fusca(){
		this(180);	
	}
	
	Fusca (int velocidadeMaxima){
		super (velocidadeMaxima);
	}
	
	@Override
	public String toString() {
		return "Fusca: " + velocidadeAtual + " KM/H "; 
	}
}
