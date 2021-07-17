package Fundamentos;
// Operadores unários
public class Fundamento22 {
  
	public static void main(String[] args){
		
		int a = 1;
		int b = 2;
		
		// Forma pós fixada
		
		a++; // Incremento a = a + 1;
		a--; // Decremento a = a - 1;
		
		// Forma pré fixada
		
		++b; // b = b + 1;
		--b; // b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini desafio...");
		System.out.println(++a == b--); // ++ terá a ordem de precedência maior
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
		
	}

}
