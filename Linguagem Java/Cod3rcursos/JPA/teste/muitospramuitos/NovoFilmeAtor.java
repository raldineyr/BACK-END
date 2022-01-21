package teste.muitospramuitos;

import Infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {
	
	public static void main(String[] args) {
		
		Filme filmeA = new Filme("A longa trança do careca", 9.0);
		Filme filmeB = new Filme("Jesus era negão", 9.0);
		
		Ator atorA = new Ator("Babu");
		Ator atrizB = new Ator("Lazaro Ramos");
		
		filmeA.adicionarAtor(atorA);
		filmeA.adicionarAtor(atrizB);
		
		filmeB.adicionarAtor(atorA);
		
		// Todos os filmes serão incluidos devido ao modo cascata implementado	
		DAO<Filme> dao = new DAO<Filme>();
		dao.forcarInclusao(filmeA);
	
	}
}
