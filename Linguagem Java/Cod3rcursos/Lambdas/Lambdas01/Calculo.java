package Lambdas.Lambdas01;
//Fundamentos de função Lambda.

/* Se for implementado a anotação @FuntionalInterface a mesma
limitará a criação de somente um único método. A 'anotaion' 
é somente uma anotação, mesmo que a mesma não seja aplicada 
e realizar a crianção de outro método irá prover erros.*/

@FunctionalInterface
public interface Calculo {
	
	public double executar (double a, double b);
	// double teste(); // Gera erros nas funções funcionais.
}
