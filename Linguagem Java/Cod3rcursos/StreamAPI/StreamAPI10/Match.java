package StreamAPI.StreamAPI10;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	public static void main(String[] args){
		
		Aluno a1 = new Aluno("Mel", 8.0);
		Aluno a2 = new Aluno("Boroca", 10.0);
		Aluno a3 = new Aluno("Raldy", 3.0);
		Aluno a4 = new Aluno("Yuri", 2.0);
		Aluno a5 = new Aluno("Davi", 7.0);
		
		List <Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		
		Predicate <Aluno> aprovado = 
				estudante -> estudante.nota >= 7;
		
		Predicate <Aluno> reprovado =
				aprovado.negate();
	
	System.out.println(alunos.stream().allMatch(aprovado)); // Todos foram aprovados?
	System.out.println(alunos.stream().anyMatch(aprovado)); // Algum aluno foi aprovado?
	System.out.println(alunos.stream().noneMatch(reprovado)); // Nenhum aluno reprovado?
	
	}
}
