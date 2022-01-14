package teste.basico;

import Infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {
	
	public static void main(String[] args) {
		
		Produto produto = new Produto("Monitor 55", 2357.50);
		
		DAO<Produto> dao = new DAO <>(Produto.class);
		dao.forcarInclusao(produto).fechar();;
		
		System.out.println("ID do produto: " + produto.getId());
	
	}

}
