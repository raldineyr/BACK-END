package ClassesEmetodos03;
//Iniciando atributos e metódos 

public class ProdutoTeste {
	
	public static void main(String[] args){
		
	Produto p1 = new Produto();
	Produto p2 = new Produto();
	
	p1.nome = "Curso Golang Udemy";
	p1.preco = 200.00;
	p1.desconto = 0.40;
	
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
