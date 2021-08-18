package Lambdas.Lambdas06;
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
	
	public String toString(){
		double precoFinal = preco * (1 - desconto);
		return "Produto: " + nome + ",tem um valor total de R$ " + precoFinal;
	}
}
