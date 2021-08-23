package StreamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

// Desafio: Stream API Map

public class DesafioMap {
	public static void main(String[] args) {
		
		List <Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
	
	/* In Java, we can use Integer.toBinaryString(int) to convert an Integer 
to a binary string representative. */		
		System.out.println("Conversão:");
		
		numeros.stream()
			.map(Integer::toBinaryString)	
			.forEach(System.out::println);
	
	/* A classe StringBuilder faz parte do pacote java. Essa classe permite criar 
e manipular dados de Strings dinamicamente, ou seja, podem criar variáveis de String modificáveis. */
		
	System.out.println("\nInversão:");
		
		UnaryOperator<String> inverter =
			texto -> new StringBuilder(texto).reverse().toString();
			
				numeros.stream()
				.map(Integer::toBinaryString)
				.map(inverter)
				.forEach(System.out::println);

	/*método Number.parseInt() converte um argumento de string e retorna um inteiro da 
  raiz ou base específica.			
 */
	System.out.println("\nInteiro: ");
		
		Function<String, Integer> binarioParaInt = 
				s -> Integer.parseInt(s , 2);
				
		numeros.stream()
		.map(Integer::toBinaryString)
		.map(inverter)
		.map(binarioParaInt)
		.forEach(System.out::println);
	}
}
