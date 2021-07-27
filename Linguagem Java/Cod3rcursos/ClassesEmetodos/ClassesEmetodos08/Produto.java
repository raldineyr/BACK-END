package ClassesEmetodos08;

public class Produto {
	// Atributos
	
	String nome;
	double preco;
	static double desconto;
	
	
	Produto(String nomeInicial, double precoInicial){
		
		nome = nomeInicial;	
		preco = precoInicial;
	}
	
	// Método construtor padrão
	
	Produto(){
		
	}
	
	// Método especial
	
	double precoComDesconto(){
		
		return preco * (1 - desconto);	
	}	
}
