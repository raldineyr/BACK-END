package teste.umpramuitos;

import Infra.DAO;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class ObterPedido {
	
	public static void main(String[] args) {
		
		DAO<Pedido> dao = new DAO<>(Pedido.class);
		
		Pedido pedido = dao.obterPorId(2L);
		
		if (pedido != null ) {
			
			for (ItemPedido item: pedido.getItens()){
				System.out.println(item.getQuantidade());
				System.out.println(item.getProduto().getNome());
			}			
			
		} else {
				
			System.out.println("\nO pedido informado é inexistente.");
		}
			
		dao.fechar();
	}		
}
