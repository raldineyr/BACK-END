package Lambdas.Lambdas06;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
//Funcional interface: Consumer

public class Consumidor {
	
	public static void main(String[] args) {
		
	Consumer<Produto> imprimirNome = 
			item -> System.out.println(item.nome);	
			
	Produto item1 = new Produto ("Curso GO", 210.00, 0.10);
	imprimirNome.accept(item1); // A partir do método accept ela receberá um único parametro e não retornará nada.
	
	Produto item2 = new Produto ("Curso Java", 180.00, 0.15);
	Produto item3 = new Produto ("Curso C#", 250.00, 0.13);
	Produto item4 = new Produto ("Curso Docker", 350.00, 0.8);
	Produto item5 = new Produto ("Curso Git", 80.00, 0.12);
	
	List <Produto> produtos = Arrays.asList(item1, item2, item3, item4, item5);
	produtos.forEach(imprimirNome);
	
	produtos.forEach(item -> System.out.println(item.preco));
	produtos.forEach(System.out::println); // Ele imprime as informações da classe Produto.
	
	}
}
