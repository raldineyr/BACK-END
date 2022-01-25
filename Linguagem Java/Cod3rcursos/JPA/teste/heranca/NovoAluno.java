package teste.heranca;

import Infra.DAO;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class NovoAluno {
	
	public static void main(String[] args) {
		
		DAO<Aluno> alunoDAO = new DAO<>();
		
		Aluno aluno1 = new Aluno(123L, "Matheus");
		AlunoBolsista aluno2 = new AlunoBolsista(500L,"Jaqueline",1000);
		
		alunoDAO.forcarInclusao(aluno1);
		alunoDAO.forcarInclusao(aluno2);
		
		alunoDAO.fechar();
	}
}
