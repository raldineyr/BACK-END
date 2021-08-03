package POO.Composicao03;
// POO Relacionamento N para N

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	/* O final informa que a lista é constante ou seja não terá
	 * o endereço de memória modificado. como por exemplo criar 
	 * uma nova lista: this.cursos = new ArrayList<>(); devido
	 * que isso irá construir um novo endereço para a nova lista.
	 */
	
	final String nome; 	
	final List<Curso> cursos = new ArrayList<>(); 
	
	Aluno(String nome){
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso){
		// bidirecional
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	

	public String toString() {
		
		return "Aluno(a): "+ nome;
	}

	Curso obterCursoPorNome(String nome){
		
		for (Curso curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}	
		return null;
	}
}
