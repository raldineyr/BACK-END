package Fundamentos;

public class Fundamento18 {
	public static void main(String[] args){
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!condicao1);
		System.out.println(!!condicao2);
		
		System.out.println("\nTabela verdade: E");
		System.out.println(true && true);
		System.out.println(true && false);
		// Código morto		System.out.println(false && true); 
		// Código morto 	System.out.println(false && false);
		
		System.out.println("\nTabela verdade: OU");
		// Código morto System.out.println(true || true);
		// Código morto System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\nTabela verdade ou exclusivo: XOR");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
			
	}
}
