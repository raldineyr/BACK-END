package POO.Composicao03;
//POO Relacionamento N para N

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	/* O final informa que a lista é constante ou seja não terá
	 * o endereço de memória modificado. como por exemplo criar 
	 * uma nova lista: this.cursos = new ArrayList<>(); devido
	 * que isso irá construir um novo endereço para a nova lista.
	 */
	
	 final String nome;
	 final List<Aluno> alunos = new ArrayList<>();
	
	Curso(String nome){
		this.nome = nome;
	}
	 
	 void adicionarAluno(Aluno aluno){
		 
		// Bidirecional
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}	
}
