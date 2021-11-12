package JPA.modelo.teste;

import JPA.infra.DAO;
import JPA.modelo.muitospramuitos.Sobrinho;
import JPA.modelo.muitospramuitos.Tio;

public class NovoTioSobrinho {

	public static void main(String[] args) {
		
		Tio tia1 = new Tio("Binha");
		Tio tio2 = new Tio("Zé");
		
		Sobrinho sobrinho1 = new Sobrinho("Titela");
		Sobrinho sobrinho2 = new Sobrinho("Batatão");
		
		tia1.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tia1);
		
		tia1.getSobrinhos().add(sobrinho2);
		sobrinho2.getTios().add(tia1);
		
		tio2.getSobrinhos().add(sobrinho1);
		sobrinho2.getTios().add(tio2);
		
		tio2.getSobrinhos().add(sobrinho2);
		sobrinho2.getTios().add(tio2);
		
		DAO<Object> dao = new DAO<>();
		dao.abrirTransacao()
		.incluir(tia1)
		.incluir(tio2)
		.incluir(sobrinho1)
		.incluir(sobrinho2)
		.fecharTransacao()
		.fechar();
	}
}
