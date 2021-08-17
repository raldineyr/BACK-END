package Lambdas.Lambdas02;
//Fundamentos de função Lambda.

public class CalculoComLambda {
	
	public static void main(String[] args) {
		// Função anonima lambda.
	Calculo lambda = ( x, y) -> { return x + y; }; // Utilizando o par de chaves é obrigatorio usar o return.
		System.out.println(lambda.executar( 2, 3));
		
		// Função anonima lambda.
	lambda = ( x, y) -> x * y; // Variação da nomenclatura, ímplicitamente associa um return. 
		System.out.println(lambda.executar( 2, 3));
	
	System.out.println(lambda.abstratoSegundoMetodo());
	System.out.println(Calculo.estaticoTerceiroMetodo());
	}
}
