package POO.Composicao04;
//Desafio reuso do código composição

public class Produto {
	/*
 	Caso fosse solicitado uma relação (bidirecional), seria necessário criar uma relação
	entre o Produto e item: List<Item> itens = new ArrayList<>(); É valido salientar que
  	na instância item teria que ter também um relacionamento com a instância Produto. 
	*/
	
	String nome;
	double preco;

	Produto(String nome, double preco){
		
		this.nome = nome;
		this.preco = preco;
		
	}
}
