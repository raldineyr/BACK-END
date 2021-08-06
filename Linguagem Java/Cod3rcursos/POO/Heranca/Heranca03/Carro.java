package POO.Heranca03;
//Desafio Herança #01: Carro

public class Carro {
	
	int velocidade = 0;
	int frear;
	
	Carro(int velocidade){
		this.velocidade = velocidade;
	}
	
	Carro(){
		
	}
	
	void acelerador(){
		
		velocidade = velocidade + 5;
	}
	
	void frear(){	
		
		if (velocidade >= 5) velocidade -= 5;
		else velocidade = 0;
	}
	
	public String toString(){
		return "KM/H: " + velocidade;
	}
}
