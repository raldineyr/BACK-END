package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

// Collections Pilha
public class Collections05 {
	
	public static void main(String[] args) {
	
	Deque<String> livros = new ArrayDeque<>();

	// O ultimo que está na pilha será o primeiro a sair quando realizar um poop ou um pool
	
	livros.add("Um defeito de cor");
	livros.push("Viva o povo brasileiro");
	livros.push("Yaka");
	
	for(String livro: livros){
		System.out.println(livro);
	}
	
	System.out.println(livros.poll());
	System.out.println(livros.poll());
	System.out.println(livros.poll());
	
	// livros.size();
	// livros.clear();
	// livros.contains();
	// livros.isEmpty();
	
	}
}
