package ClassesEmetodos03;
//Iniciando atributos e metódos 

public class Produto {
	
	// Atributos
	
	String nome;
	double preco;
	double desconto;
	
	// Método
	
	double precoComDesconto(){
		
		return preco * (1 - desconto);
	}
}
