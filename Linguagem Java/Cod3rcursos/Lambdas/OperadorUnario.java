package Lambdas.Lambdas10;
import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args){
		
		UnaryOperator<Integer> maisDois = numero -> numero + 2;
		UnaryOperator<Integer> vezesDois = numero -> numero * 2;
		UnaryOperator<Integer> aoQuadrado = numero -> numero * numero;
		
		int resultado1 = maisDois
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(0);
		
		
		// A lógica do compose é de trás para frente.
		int resultado2 = aoQuadrado
				.compose(vezesDois)
				.compose(maisDois)
				.apply(5);
		
		System.out.println(resultado1);
	}
}
