package POO.Heranca05;
// Desafio construtor

public class Lamborghini extends Carro {
	
	/* Podemos resolver o problema utilizando ou o construtor super ou o this. Porém,
	 * ao utilizar o this nos possibilita ter outros tipos de inicilização dos construtores.*/

	
	Lamborghini(){
		this(340);
	}
	
	Lamborghini(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 45;
	}
	
	@Override
	
	void acelerador(){
		velocidadeAtual += 30;
	}
	
	@Override
	void frear(){
		if (velocidadeAtual >= 15) velocidadeAtual -= 15;
		else velocidadeAtual = 0;
	}
	
	@Override
	public String toString(){
		
		return "Lamborghini: " + velocidadeAtual + " KM/H";
	}
}
