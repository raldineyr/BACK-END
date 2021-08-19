package Lambdas.Lambdas08;
import java.util.function.Predicate;
// Predicate Functions 

public class PredicadoComposicao {
	public static void main (String[] args) {
		
	Predicate <Integer> isPar = numero -> numero % 2 == 0;
	Predicate <Integer> isTresDigitos = 
			numero -> numero >= 100 && numero <= 999;
		
		System.out.println(isPar.test(122)); // É par?
		System.out.println(isPar.and(isTresDigitos).test(22)); // É par e tem três digítos?
		System.out.println(isPar.or(isTresDigitos).test(235)); // É par ou tem três digitos?
	}
}
