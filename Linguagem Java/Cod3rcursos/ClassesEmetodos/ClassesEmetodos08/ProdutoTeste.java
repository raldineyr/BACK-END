package ClassesEmetodos08;
	// Desafio membros da classe vs instância.

public class ProdutoTeste {
	
	public static void main(String[] args){		
		
	Produto p1 = new Produto();
	Produto p2 = new Produto("Curso C Sharp Udemy",100.00);
	
	
	Produto.desconto = 0.50; // Declaração de desconto explícita.
	
	p1.nome = "Curso Java Udemy";
	p1.preco = 100.00;
	
	System.out.println(p1.precoComDesconto());
	System.out.println(p2.precoComDesconto());
	}
}

	/*Quando realizamos a alteração ou definição dentro de uma (instância estatica), implícitamente
	  alteramos o valor de todos os demais objetos do sistema relacionado com a mesma */
	 
