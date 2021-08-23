package StreamAPI.StreamAPI05;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filtro {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Boroca", 7.8);
		Aluno a2 = new Aluno("Raldy", 5.8);
		Aluno a3 = new Aluno("Mel", 7.8);
		Aluno a4 = new Aluno("Capetinha", 7.8);
		Aluno a5 = new Aluno("Safya", 10.0);
		Aluno a6 = new Aluno("Akin", 9.8);
		Aluno a7 = new Aluno("Edi", 5.8);
		Aluno a8 = new Aluno("Jonas", 5.0);
		Aluno a9 = new Aluno("Kayke", 5.9);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9);
		
		alunos.stream()
		.filter(a -> a.nota >= 7)
		.map(a -> "Parabéns " + a.nome + "! Você foi aprovado(a).")
		.forEach(System.out::println);
		
	System.out.println("\nOutra forma de se fazer o filtro: ");
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, String> saudacaoAprovado = a -> "Parabéns " 
		+ a.nome + "! Você foi aprovado(a)!";
		
		alunos.stream()
		.filter(aprovado)
		.map(saudacaoAprovado)
		.forEach(System.out::println);
	}
}
