package ClassesEmetodos05;

// Iniciando métodos construtor especial e default.
public class ProdutoTeste {
	
	public static void main(String[] args){
		
		// Instânciação através de um método construtor.
		
	Produto p1 = new Produto("Curso Golang Udemy", 200.00, 0.40);
		
	// Construtor default.
	
	var p2 = new Produto();
	
	p2.nome = "Curso C Sharp Udemy";
	p2.preco = 200.90;
	p2.preco = 0.10;
	
	System.out.println(p1.nome);
	System.out.println(p2.nome);
	
	double precoFinal1 = p1.precoComDesconto();
	double precoFinal2 = p2.precoComDesconto();
	double valorTotal = precoFinal1 + precoFinal2;
	
	System.out.printf("\nValor total: %.2f", valorTotal);
	
	}
	
}

/* Quando criamos um construtor novo perdemos o construtor padrão,
 * porém isso não nos impossibilida de tornar o constutor default
 * (padrão) explícito novamente. */
