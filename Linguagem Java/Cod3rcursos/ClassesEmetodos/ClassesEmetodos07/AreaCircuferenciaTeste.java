package ClassesEmetodos07;
//Membros de instância e membros de classe.

public class AreaCircuferenciaTeste {

	public static void main(String[] args){
		
		AreaCircuferencia a1 = new AreaCircuferencia(10);
		// a1.pi = 10;
		
		// AreaCircuferencia.pi = 3.14159;
		
		System.out.println(a1.area());
		
		System.out.println(AreaCircuferencia.area(100));
		
		System.out.println(Math.PI);
	}
}
