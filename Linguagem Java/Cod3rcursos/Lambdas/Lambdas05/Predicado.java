package Lambdas.Lambdas05;
import java.util.function.Predicate;
// Funcional interface: Predicate

public class Predicado {
	public static void main(String[] args) {
		
		Predicate <Produto> isCaro = 
				produto -> (produto.preco * (1 - produto.desconto)) >= 900.00;
		
		Produto produto = new Produto("Bicicleta", 1000.00, 0.10);
		System.out.println(isCaro.test(produto));
	}
}
