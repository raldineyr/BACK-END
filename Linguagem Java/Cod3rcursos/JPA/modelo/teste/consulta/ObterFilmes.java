package JPA.modelo.teste.consulta;

import java.util.List;

import JPA.infra.DAO;
import JPA.modelo.muitospramuitos.Filme;

public class ObterFilmes {
	
	public static void main (String[] args){
		
		DAO<Filme> dao = new DAO <>(Filme.class);
		
		List<Filme> filmes = dao.consultar(
				"obterFilmesComNotaMaiorQue", "nota", 8.5);
		
		for(Filme filme: filmes) {
			System.out.println(filme.getNome());
		}
		
	}

}
