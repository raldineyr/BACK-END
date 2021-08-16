package Lambdas.Lambdas01;
//Fundamentos de função Lambda.

public class CalculoComLambda {
	
	public static void main(String[] args) {
		// Funções anonima lambda.
	Calculo lambda = ( x, y) -> { return x + y; }; // Utilizando o par de chaves é obrigatorio usar o return.
		System.out.println(lambda.executar( 2, 3));
		
	lambda = ( x, y) -> x * y; // Variação da nomenclatura, ímplicitamente associa um return. 
		System.out.println(lambda.executar( 2, 3));
		
	lambda = (x , y) -> x / y;
	System.out.println(lambda.executar( 2, 3));
	
	lambda = (x, y) -> x - y;
	System.out.println(lambda.executar( 2, 3));
	
	lambda = (x, y) -> Math.pow(x, y);
	System.out.println(lambda.executar(3, 3));
	}
}
