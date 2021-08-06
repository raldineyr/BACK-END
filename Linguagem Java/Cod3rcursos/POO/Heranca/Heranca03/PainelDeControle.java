package POO.Heranca03;
//Desafio Herança #01: Carro

public class PainelDeControle {

	public static void main(String[] args) {
		
		Carro Fusca = new Fusca();
		Carro Tesla = new Tesla();
		Carro Lamborghini = new Lamborghini();
		
		Fusca.acelerador();
		Tesla.acelerador();
		Lamborghini.acelerador();
		
		Fusca.acelerador();
		Tesla.acelerador();
		Lamborghini.acelerador();
		
		System.out.println(Fusca);
		System.out.println(Tesla);
		System.out.println(Lamborghini);
		
		Fusca.frear();
		Tesla.frear();
		Lamborghini.acelerador();
		
		Fusca.frear();
		Tesla.frear();
		Tesla.frear();
		Lamborghini.acelerador();
		
		Fusca.frear();
		Tesla.frear();
		Lamborghini.acelerador();
		
		System.out.println(Fusca);
		System.out.println(Tesla);
		System.out.println(Lamborghini);
	}
}
