package POO.Heranca03;
//Desafio Herança #01: Carro

public class Lamborghini extends Carro {
	
	@Override
	void acelerador(){
		velocidade += 30;
	}
	
	@Override
	void frear(){
		if (velocidade >= 15) velocidade -= 15;
		else velocidade = 0;
	}
	
	@Override
	public String toString(){
		
		return "Lamborghini: " + velocidade + " KM/H";
	}
}
