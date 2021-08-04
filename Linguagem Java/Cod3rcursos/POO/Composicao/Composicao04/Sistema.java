package POO.Composicao04;
//Desafio reuso do código composição

public class Sistema {
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Maria Julia Moraes");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 2.99, 5);
		compra1.adicionarItem(new Produto("Notebook", 2897.88 ),2);
		
		cliente1.compras.add(compra1);
		cliente1.compras.add(compra1);
		
		System.out.println(cliente1.obterValorTotal());
		
		// Segundo cliente 
		
		Cliente cliente2 = new Cliente ("João Dos Venenos");
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Impressora", 500.00, 2);
		compra2.adicionarItem(new Produto("Livro", 89.00),3);
		
		cliente2.compras.add(compra2);
		cliente2.compras.add(compra2);
		
		System.out.println(cliente2.obterValorTotal());
	}
}
