package JPA.controle;

import JPA.infra.DAO;
import JPA.modelo.Produto;

public class NovoProduto {
	
	public static void main(String[] args) {
		
		Produto produto = new Produto("chilli beans", 300.00);

		DAO <Produto> dao = new DAO <>(Produto.class);
		dao.abrirTransacao().incluir(produto).fecharTransacao();
		
		System.out.println("ID do produto: " + produto.getId());
		
	}

}
