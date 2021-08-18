package lambdas.lambdas05;
//Funcional interface: Predicate

public class Produto extends Object{ // Toda classe java extends Object, pois Object é a classe mãe
 
	final String nome;
	final double preco;
	final double desconto;
	
	
	public Produto(String nome, double preco, double desconto) {
		super(); // Todo método construtor ímplicitamente terá um super da classe mãe.
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
}
