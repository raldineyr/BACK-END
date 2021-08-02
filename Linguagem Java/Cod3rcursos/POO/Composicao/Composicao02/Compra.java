package POO.Composicao02;
// POO Relacionamento 1 para N.

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	ArrayList<Item> itens = new ArrayList<>();
	
	double obterValorTotal(){
		double total = 0;	
		
		for (Item item: itens){
			total += item.quantidade * item.preco;
		}
			return total;	
	}
}
