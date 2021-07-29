package Array;
//Exercício 06 - Fundamentos Hascode

public class EqualsHashcode {
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario("Boroca Palmeira");
		
		u1.email = "boroca.palmeira@bool.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Boroca Palmeira";
		u2.email = "boroca.palmeira@bool.com";
		
		System.out.println(u1 == u2); // Comparação de endereços de memória distintos.
		System.out.println(u1.equals(u2)); // Comparação de endereços de memória distintos.
		System.out.println(u2.equals(u2)); // Comparação de endereços de memória iguais.
	}
}
