package POO.Composicao03;
//POO Relacionamento N para N

public class Principal {
	public static void main (String[] args){
		
		// Alunos
		Aluno aluno1 = new Aluno("João D' Veneno");
		Aluno aluno2 = new Aluno("Boroca Palmeira");
		Aluno aluno3 = new Aluno("Mel Ribeiro");
		
		// Cursos
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("C# Completo");
		Curso curso3 = new Curso("GO Completo");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for(Aluno aluno: curso3.alunos){
			System.out.println("Estou matriculado no curso " + curso3.nome + "...");
			System.out.println("... e o meu nome é " + aluno.nome);
			System.out.println();
		}
		 // Como a relação é N to N, podemos fazer:
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("GO Completo");
		
		if (cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}
}
