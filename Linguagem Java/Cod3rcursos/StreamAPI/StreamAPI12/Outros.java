package StreamAPI.StreamAPI12;
import java.util.Arrays;
import java.util.List;

public class Outros {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Mel", 10.0);
		Aluno a2 = new Aluno("Boroca", 09.0);
		Aluno a3 = new Aluno("Raldy", 08.0);
		Aluno a4 = new Aluno("Yuri", 07.0);
		Aluno a5 = new Aluno("Davi", 06.0);
		
		// Repetidos 
		Aluno a6 = new Aluno("Mel", 10.0);
		Aluno a7 = new Aluno("Boroca", 09.0);
		Aluno a8 = new Aluno("Raldy", 08.0);
		Aluno a9 = new Aluno("Yuri", 07.0);
		Aluno a10 = new Aluno("Davi", 06.0);
		
		// Novos
		Aluno a11 = new Aluno("Edi", 9.8);
		Aluno a12 = new Aluno("Jonas", 6.5);
		Aluno a13 = new Aluno("Kayke", 8.8);
		Aluno a14 = new Aluno("Helder", 4.9);
		Aluno a15 = new Aluno("Van", 10.0);
		
		List <Aluno> alunos = 
		Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15);	

	// distict evita valores duplicados, necessita do equals e o hashcode.
		System.out.println("Distinct: ");
		
		alunos.stream().distinct().forEach(System.out::println);
		
	// O Skip é utilizado para pular e o limit informar a quantidade de elementos
	System.out.println("\nPule os ementos: ");
		
		alunos.stream().distinct().limit(5).skip(0).forEach(System.out::println);
	
	// Informe os elementos enquanto determinada condição estiver sendo satisfeita
	System.out.println("\nTake While");
	
	alunos.stream().distinct().skip(2).takeWhile(a -> a.nota >= 7).forEach(System.out::println);	
	
	}
}
