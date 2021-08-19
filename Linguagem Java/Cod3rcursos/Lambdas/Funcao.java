package Lambdas.Lambdas07;
import java.util.function.Function;
//Funcional interface: Function

public class Funcao {
	
	public static void main(String[] args){
		
		Function<Integer, String> parOuImpar = 
				numero -> numero % 2 == 0 ? "par" : "ímpar";
		
		Function<String, String> oResultadoE =
				valor -> "O resultado é: " + valor;
				
		Function<String, String> exclamacoes =
				valor -> valor + "!!!";
				
				String resultadoFinal = parOuImpar
				.andThen(oResultadoE)
				.andThen(exclamacoes)
				.apply(5);
		
		System.out.println(parOuImpar.apply(100));
		System.out.println(resultadoFinal);
	}
}
