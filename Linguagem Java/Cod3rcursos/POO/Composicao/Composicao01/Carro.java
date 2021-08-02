package POO.Composicao01;
//POO Relacionamento 1 para 1.

public class Carro {
	
	Motor motor = new Motor();

	void acelerar(){
		if (motor.fatorInjecao < 2.6){
		motor.fatorInjecao += 0.4;
		}
	}
	
	void frear(){
		if (motor.fatorInjecao > 0.5) motor.fatorInjecao -= 0.4;
		else System.out.println("Totalmente freado");;
	}
	
	void ligar(){
		
		motor.ligado = true;	
	}
	
	void desligar(){
		
		motor.ligado = false;
	}
	
	boolean estaLigado(){
		return motor.ligado;
	}
}
