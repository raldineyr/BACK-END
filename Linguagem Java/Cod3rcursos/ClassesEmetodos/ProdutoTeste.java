package ClassesEmetodos01;

//Iniciando atributos e instâncias

public class ProdutoTeste {
	
	public static void main(String[] args){
		
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4500.55;
		p1.desconto = 0.15;
		
		var p2 = new Produto(); // O compilador Java também consegue inferir uma instância
		
		p2.nome = "Caneta preta";
		p2.preco = 12.57;
		p2.desconto = 0.10;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.preco * (1 - p1.desconto);
		double precoFinal2 = p2.preco * (1 - p2.desconto);
		double mediaCarrinho = (precoFinal1 + precoFinal2 / 2);
		
		
		System.out.printf("Média do carrinho = R$ %.2f\n", mediaCarrinho);	
	}

}
