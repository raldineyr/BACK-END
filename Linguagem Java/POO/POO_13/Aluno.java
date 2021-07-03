package POO13;

public class Aluno extends Pessoa{
	
	// Atributos
	
	private int matricula;
	private String curso;
	
	// Método construtor 
	
	public Aluno(String nome, int idade, String genero) {
		super(nome, idade, genero);
		
		this.setMatricula(matricula);
		this.setCurso(curso);
	}
	
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
