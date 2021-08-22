package StreamAPI.StreamAPI01;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
//Fundamentos Stream impressões.

public class imprimindoObjetos {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Raldy","Boroca","Mel","Safya");
		
		for(String nome: aprovados){
			System.out.println(nome);
		}
		
		System.out.println("\nUsando iterator...");
		
/* O Iterator é uma interface que utiliza dois métodos a partir do boolean, no qual 
	informa: se tem ou não um próximo elemento. */
		
		Iterator<String> iterar = aprovados.iterator();
		
		while (iterar.hasNext()){
			System.out.println(iterar.next());
		}
		
/* O Stream é uma interface que contém um conjunto de objetos, fazendo con que a  		
	interação acontecça de forma interna. OBS: É uma sequência de dados.*/
		
		Stream<String> stream = aprovados.stream();
		
		stream.forEach(System.out::println); //Laço interno.
	}
}
