package POO.Composicao04;
//Desafio reuso do código composição

public class Item {
	
	final Produto produto;
	final int quantidade;
	
	Item(Produto produto, int quantidade){
		
		this.produto = produto;
		this.quantidade  = quantidade;
	}
}
