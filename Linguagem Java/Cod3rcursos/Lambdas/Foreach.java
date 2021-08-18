package Lambdas.Lambdas04;
import java.util.Arrays;
import java.util.List;
// Foreach funcional

public class Foreach {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana","Bia","Lia","Mel","Gui");
		
	System.out.println("Forma tradiconal do loop foreach: ");
		
		for (String nome: aprovados){
			System.out.println("Nome: " + nome);
		}
		
		System.out.println("\nLoop foreach utilizando função lambda:");
		aprovados.forEach( (nome) -> {System.out.println("Nome: " + nome); });
		
	/* Simplificando: se tivermos somente um parâmetro podemos remover o parêntese,
essa regra também é válida para os pares de chaves, caso seja somente uma 
sentença de código a mesma pode ser removida, não esquecer de remover o: ";". */
		
		System.out.println("\nLoop foreach utilizando função lambda simplificada:");
		aprovados.forEach(nome -> System.out.println("Aprovados: " + nome));
	
		/* Há também a possibilidade de simplificar ainda mais usando o "Method Reference" 	
porém, o mesmo dificulta a leitura. O mesmo pecorre cada um dos nomes da lista e após 
isso o imprime. 
*/	
		System.out.println("\nLoop foreach utilizando o 'Method Reference'");
		aprovados.forEach(System.out::println); // Para cada pessoa dentro da lista de aprovados imprima na saída do sistema.
		
		System.out.println("\nLoop foreach utilizando o 'Method Reference' e uma 'função': ");
		aprovados.forEach(nome -> usandoUmMetodo(nome)); // Definindo uma expressão lambda como parâmetro para um loop foreach
		
		System.out.println("\nLoop foreach utilizando o 'Method Reference' mais simplificado.");
		aprovados.forEach(Foreach::usandoUmMetodo); // Passando referẽncia para uma função cirada.
		
	}
	
	static void usandoUmMetodo(String nome){
		System.out.println("Olá! O meu nome é: " + nome);
	}
}
