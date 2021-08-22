package StreamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;
// Criando Stream: build

public class CriandoStreams {
	
	public static void main(String[] args) {
		
		Consumer<String> imprimir = System.out::print; // Method Rereference
		
		Stream<String> linguagens = Stream.of("JAVA ", "C# ", "GO ","C \n"); // Utilizando o Stream of
		linguagens.forEach(imprimir);

		String[] maisLinguagens = {"Dart ", "Elixir ", "Ruby ", "Python " , "Java Script \n"};// Utilizando o Array
		
		// Criando stream a partir de uma função estática 
		Stream.of(maisLinguagens).forEach(imprimir); // Utilizando o Array e ForEach
	
		Arrays.stream(maisLinguagens).forEach(imprimir); // A partir da clase Arrays usando o método stream.
		
		// Criando stream a partir de um subconjunto
		Arrays.stream(maisLinguagens, 2, 5).forEach(imprimir); // É possivel utilizar e "criar" um subconjunto controlando os elementos manualmete
		
		// Criando stream a partir das collections
		List<String> outrasLinguagens = Arrays.asList("F# ", "PHP ", "Kotlin\n");
		outrasLinguagens.stream().forEach(imprimir);
		outrasLinguagens.parallelStream().forEach(imprimir);
		
		Consumer<Integer> imprimirInteiro = System.out::println;
		//Stream.generate(() -> "|").forEach(imprimir); // Gera uma stream infinita
		//Stream.iterate(0, n -> n + 1).forEach(imprimirInteiro);; Gera uma stream numerica infinita
	}
}
