package JPA.modelo.umpraum;

import JPA.infra.DAO;

public class NovoClienteAssento1 {
	
	public static void main(String[] args) {
		
		Assento assento = new Assento("5F");
		Cliente cliente = new Cliente("Raldy",assento); 
		
		DAO <Object> dao = new DAO<>(null);
		
		dao.abrirTransacao()
		.incluir(assento)
		.incluir(cliente)
		.fecharTransacao().fechar();
	}

}
