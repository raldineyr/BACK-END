package POO.Heranca03;
//Desafio Herança #01: Carro

public class Tesla extends Carro {
	@Override
	void acelerador(){
		velocidade += 50;
		
	}
	@Override
	void frear(){
		if (velocidade >= 25) velocidade -= 25;
		else velocidade = 0;
	}
	
	@Override
	public String toString(){
		
		return "Tesla: " + velocidade + " KM/H";
	}
}
