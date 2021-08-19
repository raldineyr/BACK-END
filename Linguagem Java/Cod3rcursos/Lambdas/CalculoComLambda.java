package Lambdas.Lambdas03;
import java.util.function.BinaryOperator;
//interfaces funcionais BinaryOperator

public class CalculoComLambda {
	
	public static void main(String[] args) {
		
		// Adição
		BinaryOperator<Double> lambda = ( x, y) -> { return x + y; };
		System.out.println(lambda.apply( 2.0, 3.0));
		
		// Multiplicação
		lambda = ( x, y) -> x * y; 
		System.out.println(lambda.apply( 2.0, 3.0));
		
		// Adição
		BinaryOperator<Integer> lambda2 = (x, y) -> { return x + y; };
		System.out.println(lambda2.apply( 2 , 3));
		
		// Subtração
		lambda2 = ( x, y) -> x - y; 
		System.out.println(lambda2.apply(3, 2));
		
		// Divisão
		lambda2 = (x, y) -> x / y;
		System.out.println(lambda2.apply(10, 2));
		
	}
}
