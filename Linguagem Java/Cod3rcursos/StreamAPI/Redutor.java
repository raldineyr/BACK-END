package StreamAPI.StreamAPI07;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
// Fundamentos Reduce

public class Redutor {
	
	public static void main (String[] args){
		
	List<Integer> listaNumerica = Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9);
	
	BinaryOperator<Integer> soma = (acumulador, numero) -> acumulador + numero;
	
	int total1 = listaNumerica.stream().reduce( 0, soma);
	System.out.println(total1);
	
	// Podemos utilizar o wrapper para obter mais segurança em relação ao tipo.
	Integer total2 = listaNumerica.stream().reduce(100 ,soma);
	System.out.println(total2);
	
	// No paralleStream para cada número na listaNumerica o mesmo passará o valor inicial do acumulador.
	
	int total3 = listaNumerica.parallelStream().reduce(100, soma);
	System.out.println(total3);
		
	// Resultado foi um Opcional <Interger>...
	listaNumerica.stream()
	.filter(numero -> numero > 5)
	.reduce(soma)
	.ifPresent(System.out::println);
	}
}
