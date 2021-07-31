package Collections;

import java.util.LinkedList;
import java.util.Queue;

// Collection Fila
public class Collection04 {
	public static void main(String[] args) {
			
		Queue<String> fila = new LinkedList<>();
		
		// Diferença de comportamentos entre add e offer:
		
		fila.add("Ana"); // Add Retorna falso
		fila.offer("Bia"); // O offer retorna false caso não consiga adicionar
		fila.add("Carlos"); // Add Retorna falso
		fila.offer("Daniel"); // Offer lança uma excessão 
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Diferença de comportamentos entre peek e element: 
		
		System.out.println(fila.peek()); // Quando a fila está vazia retorna null
		System.out.println(fila.peek());  
  		System.out.println(fila.element()); // Quando a fila está vazia lança uma (erro) excessão
		System.out.println(fila.element()); 
		
		// Poll e Element > Obter o próximo elementos da fila (sem remover).
		
		// Diferença de comportamentos que ocorre quando a fila está vazia:
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove()); // lança uma excessão 
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll()); // Após o Gui não há mais usuarios cadastrados na fila.
		System.out.println(fila.remove()); // Após o Gui não há mais usuarios cadastrados na fila, remove gera um erro.
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty(); // Para verificar se a fila está ou não vazia, util para verificação de armazenamento
	
	}
}
