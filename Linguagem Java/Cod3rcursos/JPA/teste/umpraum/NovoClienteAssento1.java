package teste.umpraum;

import Infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento1 {
	
	public static void main(String[] args) {
		
		Assento assento = new Assento("11F");
		Cliente cliente = new Cliente("Maroca", assento);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirT()
		.incluir(assento)
		.incluir(cliente)
		.fecharT()
		.fechar();
	}
}
