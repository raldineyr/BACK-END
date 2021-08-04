package POO.Composicao04;
// Desafio reuso do código composição

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	// Atributo 
	
	final String nome;
	
	// Criação de lista e relacionamento: Cliente > Compras
	
	final List<Compra> compras = new ArrayList<>(); // Relacão cliente com compra.
	
	// Método construtor
	
	Cliente(String nome){
		
		this.nome = nome;
	}
	
	// Método especial
	
	double obterValorTotal(){
		double total = 0;
		
		for(Compra compra: compras){
			
			total += compra.obterValorTotal();
		}
		return total;
	}
}
