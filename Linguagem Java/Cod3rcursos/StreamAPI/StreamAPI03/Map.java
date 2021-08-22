package StreamAPI.StreamAPI03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
	public static void main(String[] args) {
	
	Consumer<String> imprimir = System.out::print;
	
	List<String> marcas = Arrays.asList("Tesla ", "BMW ","Porche ");
	marcas.stream().map(m -> m.toUpperCase()).forEach(imprimir);
	
	// UnaryOperator<String> maiuscula = nomeMarca -> nomeMarca.toUpperCase();
	UnaryOperator<String> letraInicial = nomeMarca -> nomeMarca.charAt(0) + "";
	UnaryOperator<String> exclamacao = nomeMarca -> nomeMarca + "!!! ";

	System.out.println("\n Usando composição...");
	
	marcas.stream().map(Utilitarios.maiuscula)
	.map(letraInicial)
	.map(exclamacao)
	.forEach(imprimir);
	
	}
}
