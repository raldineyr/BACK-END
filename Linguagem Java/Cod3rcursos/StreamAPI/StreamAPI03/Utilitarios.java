package StreamAPI.StreamAPI03;

import java.util.function.UnaryOperator;

public class Utilitarios {

	final public static UnaryOperator<String> maiuscula = substantivo -> substantivo.toUpperCase();
	final public static UnaryOperator<String> letraInicial = substantivo -> substantivo.charAt(0) + "";
	final public static UnaryOperator<String> exclamacao = substantivo -> substantivo + "!!! ";
	
}
