package StreamAPI.StreamAPI09;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Redutor {
	public static void main(String[] args){
		
		Aluno a1 = new Aluno("Mel", 8.0);
		Aluno a2 = new Aluno("Boroca", 10.0);
		Aluno a3 = new Aluno("Raldy", 2.0);
		Aluno a4 = new Aluno("Yuri", 4.0);
		Aluno a5 = new Aluno("Davi", 7.0);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		
		Predicate <Aluno> aprovado = 
				estudante -> estudante.nota >= 7;
				
		Function<Aluno, Double> nota = 
				estudante -> estudante.nota;
 		
		BiFunction<Media, Double, Media> calcularMedia = 
				(media, pontuacao) -> media.adicionar(pontuacao);
				
		BinaryOperator <Media> combinarMedia = 
				(m1, m2) -> Media.combinar(m1,m2);
		
		alunos.stream()
		.filter(aprovado)
		.map(nota)
		.reduce(new Media(), calcularMedia, combinarMedia);
		
	}
}
