package POO.Interface.Interface01;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual;
	private int delta = 5;
	
	Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	void acelerador(){
		if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) velocidadeAtual = VELOCIDADE_MAXIMA;
		else velocidadeAtual += getDelta();
	}
	
	void frear(){	
		
		if (velocidadeAtual >= 5) velocidadeAtual -= 5;
		else velocidadeAtual = 0;
	}
	
	public String toString(){
		return "KM/H: " + velocidadeAtual;
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
}
