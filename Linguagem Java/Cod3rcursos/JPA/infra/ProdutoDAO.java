package JPA.infra;

import JPA.modelo.Produto;

public class ProdutoDAO extends DAO <Produto> {
	
	public ProdutoDAO(){
		super(Produto.class);
		
	}
}
