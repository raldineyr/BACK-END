package Lambdas.Lambdas12;
import java.util.function.Function;
import java.util.function.UnaryOperator;

//Desafio: Operador binário
public class DesafioLambda {

	public static void main(String[] args) {
		/*
		 1º - A partir do produto calcular o preco real (com desconto)
		 2º - Calcular os impostos municipais: Imposto municipal >= 2500 (8,5%) / < 2500 (isento)
		 3º - Calcular o frete: >= 3000 (100)/ < 3000 (50)
		 4º - Arredondar: Deixar duas casas decimais
		 5º - Formatar: R$ 1234.56 
		 */	
		
		/* O Java não permite que você tenha uma variável já definida dentro do seu algorítimo
		 *  que tem exatamente o mesmo nome do parâmetro de uma lambda. Porém, se por o produto
		 *  para depois não terá problemas. */
		
		Function<Produto, Double> precoFinal = //1º
				produto -> produto.preco * (1 - produto.desconto);
				
		UnaryOperator<Double> impostoMunicipal =  // 2º
				preco -> preco >= 2500 ? preco * 1.085 : preco;
				
		UnaryOperator<Double> frete = // 3º
			preco -> preco >= 3000.00 ? preco + 100.00 : preco + 50;
				
		UnaryOperator<Double> arredondar = // 4º
				preco -> Double.parseDouble(String.format("%.2f", preco));
				
		Function<Double, String> formatar = 
				preco -> ("R$" + preco).replace(".",",");
		
		Produto produto = new Produto("WhoisPAD", 3450.99 , 0.13);
		
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(produto);
		System.out.println("O preço final é " + preco);
	}
}
