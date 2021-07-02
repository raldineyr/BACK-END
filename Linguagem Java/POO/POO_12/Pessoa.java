package POO12;

public class Aluno extends Pessoa{
	
	// Atributos
	
	private int matricula;
	private String curso;
	
	// Métodos acessores e modificadores
	
	public int getMatricula(){
		
		return this.matricula;
	}
	
	public void setMatricula(int matricula){
		
		this.matricula = matricula;
	}
	
	public String getCurso(){
		
		return this.curso;
	}
	
	public void setCurso(String curso){
		
		this.curso = curso;
	}
	
	// Métodos especiais
	
	public void cancelarMatricula(){
		
		System.out.println("A matricula foi cancelada.");
	}

}
