package POO.Heranca05;
// Desafio construtor

public class Tesla extends Carro {
	
	Tesla(){
		this(300);	
		
	}
	
	Tesla(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 55;
	}
	
	/*
	
	 @Override
	void acelerador(){
		velocidadeAtual += 50;
		
	}
	@Override
	void frear(){
		if (velocidadeAtual >= 25) velocidadeAtual -= 25;
		else velocidadeAtual = 0;
	}
	*/
	
	@Override
	public String toString(){
		
		return "Tesla: " + velocidadeAtual + " KM/H";
	}  
}
