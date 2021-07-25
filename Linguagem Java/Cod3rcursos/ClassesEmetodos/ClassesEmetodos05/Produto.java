package ClassesEmetodos05;
//Iniciando método construtor

public class Produto {
	// Atributos
	
	String nome;
	double preco;
	double desconto;
	
	// Métodos construtores, é possível criar mais de um método construtor.

	// Método construtor modificado
	
	Produto(String nomeInicial, double precoInicial, double descontoInicial){
		nome = nomeInicial;	
		preco = precoInicial;
		desconto = descontoInicial;	
	}
	
	// Método construtor padrão
	
	Produto(){
		
	}
	
	// Método especial
	
	double precoComDesconto(){
		
		return preco * (1 - desconto);	
	}
}
