package POO14;

public class Aluno extends Pessoa{
	
	// Atributos 
	
	protected int matricula;
	protected String curso;
	
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
	
	public void pagarMensalidade(){
		System.out.println("A mensaliade do aluno: "+this.getNome()+ ". foi paga.");
	}
}
