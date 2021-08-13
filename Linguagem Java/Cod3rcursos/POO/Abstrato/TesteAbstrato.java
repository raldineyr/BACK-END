package POO.Abstrato;

public class TesteAbstrato {
	
	public static void main(String[] args) {
	
		Mamifero A1 = new Cachorro();
		System.out.println(A1.mover());
		System.out.println(A1.mamar());
		System.out.println(A1.respirar());
		
	}
}
