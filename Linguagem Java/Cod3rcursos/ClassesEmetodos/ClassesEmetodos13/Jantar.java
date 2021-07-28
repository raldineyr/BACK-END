package ClassesEmetodos13;
//Desafio do módulo

public class Jantar {
	
	public static void main(String[] args) {
		
		Comida c1 = new Comida("Arroz", 0.23F);
		Comida c2 = new Comida ("Feijao", 0.30F);
		
		Pessoa p1 = new Pessoa ("Boroca", 59.98F);
		System.out.println(p1.apresentar());
		p1.comer(c1);
		p1.comer(c2);
		System.out.println(p1.apresentar());		
	}
}
