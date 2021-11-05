package JPA.infra;

import br.com.raldineyr.JPA.modelo.Produto;

public class ProdutoDAO extends DAO <Produto> {
	
	public ProdutoDAO(){
		super(Produto.class);
		
	}
}
