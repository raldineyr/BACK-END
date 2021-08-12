package POO.Heranca05;
// Desafio construtor

public class Carro {
	final int VELOCIDADE_MAXIMA;
	
	int velocidadeAtual;
	int delta = 5;
	
	Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	void acelerador(){
		if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) velocidadeAtual = VELOCIDADE_MAXIMA;
		else velocidadeAtual += delta;
	}
	
	void frear(){	
		
		if (velocidadeAtual >= 5) velocidadeAtual -= 5;
		else velocidadeAtual = 0;
	}
	
	public String toString(){
		return "KM/H: " + velocidadeAtual;
	}
}
