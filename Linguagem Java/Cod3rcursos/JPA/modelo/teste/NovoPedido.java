package JPA.modelo.teste;

import JPA.infra.DAO;
import JPA.modelo.Produto;
import JPA.modelo.umpramuitos.ItemPedido;
import JPA.modelo.umpramuitos.Pedido;

public class NovoPedido {

	public static void main(String[] args) {
		
		
		DAO <Object> dao = new DAO<>();
		
		Pedido  pedido = new Pedido();
		Produto produto = new Produto("Curso SQL e NoSQL", 189.90);
		ItemPedido item = new ItemPedido(10, produto, pedido);
		
		dao
		.abrirTransacao()
		.incluir(produto)
		.incluir(pedido)
		.incluir(item)
		.fecharTransacao()
		.fechar();
		
	}
}
