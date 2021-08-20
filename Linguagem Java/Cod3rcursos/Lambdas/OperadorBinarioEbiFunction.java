package Lambdas.Lambdas11;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
// Fundamento funções lambda

public class OperadorBinarioEbiFunction {

	public static void main(String[] args) {
		
			BinaryOperator<Double> media = (numeroX, numeroY) -> (numeroX + numeroY) / 2;
			System.out.println(media.apply(10.0, 8.0));			
			
			BiFunction <Double, Double, String> resultado = (numeroX, numeroY) -> ((numeroX + numeroY) / 2) >= 7 ? "Aprovado" : "Reprovado"; 
			System.out.println(resultado.apply(9.7, 5.0));
	}
}
