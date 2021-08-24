package StreamAPI.StreamAPI06;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Principal {
	
	public static void main(String[] args){
		
		Aluno a1 = new Aluno("Raldy", 9.0, 'M');
		Aluno a2 = new Aluno("Boroca", 8.3, 'F');
		Aluno a3 = new Aluno("Mel", 8.2, 'F');
		Aluno a4 = new Aluno("Edi", 7.1, 'F');
		Aluno a5 = new Aluno("Van", 4.6, 'F');
		Aluno a6 = new Aluno("Celo", 8.0, 'M');
		
		List <Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);
		
		Predicate <Aluno> aprovado = 
				a -> a.nota >= 7;
				
		Predicate <Aluno> aprovada = 
						a -> a.nota >= 7;
				
		Function <Aluno, String> alunosAprovados = 
				a -> "Parabéns " + a.nome + "! Você foi aprovado!";
					
		alunos.stream()
		.filter(aprovado)
		.filter(aprovada)
		.map(alunosAprovados)
		.forEach(System.out::println);

	}
}
