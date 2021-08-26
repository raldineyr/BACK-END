package StreamAPI.StreamAPI11;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinimoEmaximo {
	
	public static void main(String[] argas) {
		
		Aluno a1 = new Aluno("Mel", 10.0);
		Aluno a2 = new Aluno("Boroca", 09.0);
		Aluno a3 = new Aluno("Raldy", 08.0);
		Aluno a4 = new Aluno("Yuri", 07.0);
		Aluno a5 = new Aluno("Davi", 06.0);
		Aluno a6 = new Aluno("Edi", 05.0);
		Aluno a7 = new Aluno("Jonas", 04.0);
		Aluno a8 = new Aluno("Kayke", 03.0);
		Aluno a9 = new Aluno("Helder", 02.0);
		Aluno a10 = new Aluno("Deni", 01.0);
		
		List <Aluno> alunos = 
				Arrays.asList(a1, a2, a3, a4, a5,a6, a7, a8, a9, a10);	
	
		Comparator <Aluno> melhorNota = 
			(estudante1, estudante2) -> {
				
			if (estudante1.nota > estudante2.nota) return 1;
			if (estudante1.nota < estudante2.nota) return -1;
			return 0;
		};
		
		Comparator <Aluno> piorNota = 
				(estudante1, estudante2) -> {
					
				if (estudante1.nota > estudante2.nota) return -1;
				if (estudante1.nota < estudante2.nota) return 1;
				return 0;
			};
			
		System.out.println(alunos.stream().max(melhorNota).get());
		System.out.println(alunos.stream().min(melhorNota).get());
		
		System.out.println(alunos.stream().max(piorNota).get());
		System.out.println(alunos.stream().min(piorNota).get());
	}
}
