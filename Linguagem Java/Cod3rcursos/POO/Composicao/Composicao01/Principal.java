package POO.Composicao01;
//POO Relacionamento 1 para 1.

public class Principal {
	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		System.out.println(c1.estaLigado());
		
		c1.ligar();
		System.out.println(c1.estaLigado());
		
		System.out.println(c1.motor.giros());
				
		// Acelerando
		c1.acelerar();
		System.out.println(c1.motor.giros());
		c1.acelerar();
		System.out.println(c1.motor.giros());
		c1.acelerar();
		System.out.println(c1.motor.giros());
		c1.acelerar();
		System.out.println(c1.motor.giros());
				
		// Freando
		c1.frear();
		System.out.println(c1.motor.giros());
		c1.frear();
		System.out.println(c1.motor.giros());
		c1.frear();
		System.out.println(c1.motor.giros());
		c1.frear();
		System.out.println(c1.motor.giros());
		c1.frear();
		System.out.println(c1.motor.giros());
		c1.frear();
		System.out.println(c1.motor.giros());
					
		c1.frear();
		System.out.println(c1.motor.giros());
		
		// Faltou Encapsulamento!!!
		 // c1.motor.fatorInjecao = -1000;
		
		System.out.println(c1.motor.giros());
			
	}
}
