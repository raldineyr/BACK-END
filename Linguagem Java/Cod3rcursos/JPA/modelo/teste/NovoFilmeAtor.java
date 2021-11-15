package JPA.modelo.teste;

import JPA.infra.DAO;
import JPA.modelo.muitospramuitos.Ator;
import JPA.modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {
	public static void main(String[] args) {

		Filme filmeA = new Filme("Black Panther", 10.0);
		Filme filmeB = new Filme("42", 8.7);

		Ator atorA = new Ator("Chadwick Boseman");
		Ator atorB = new Ator("Michael B. Jordan");
		Ator atrizA = new Ator("Lupita Nyong'o");
		Ator atrizB = new Ator("Danai Gurira");
		

		filmeA.adicionarAtor(atorA);
		filmeA.adicionarAtor(atorB);
		filmeA.adicionarAtor(atrizA);
		filmeA.adicionarAtor(atrizB);
		
		filmeB.adicionarAtor(atorA);
		
		DAO <Filme> dao = new DAO<Filme>();
		dao.forcarInclusao(filmeB);
	}
}
