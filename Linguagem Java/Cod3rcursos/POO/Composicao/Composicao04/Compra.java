package POO.Composicao04;
import java.util.ArrayList;
import java.util.List;
// Desafio reuso do código composição

public class Compra {	
	
	// Criação de lista e relacionamento: Compra > Itens
	
	final List<Item> itens = new ArrayList<>();
	
	// Métodos especiais
	
	void adicionarItem(Produto produto, int quantidade){
		this.itens.add(new Item(produto ,quantidade));	
	}
	
	void adicionarItem(String nome, double preco, int quantidade){
		var produto = new Produto( nome, preco);
		this.itens.add(new Item(produto, quantidade));	
	}
	
	double obterValorTotal(){
		
		double total = 0;
		
		for (Item item: itens) {
			total += item.quantidade * item.produto.preco;
		}
		return total;
	}
}
