package POO13;

public class Professor extends Pessoa{
	
	// Atributos
	
	private String especialidade;
	private float salario;
	
	// Método construtor 

	public Professor(String nome, int idade, String genero) {
		super(nome, idade, genero);
		
		this.setEspecialidade(especialidade);
		this.setSalario(salario);
	}
	
	// Métodos acessores e modificadores
	
	public String getEspecialidade(){
		
		return this.especialidade;
	}
	
	public void setEspecialidade(String especialidade){
		
		this.especialidade = especialidade;
	}
	
	public float getSalario(){
		
		return this.salario;
	}
	
	public void setSalario(float salario){
		this.salario = salario;
	}
	
	public void receberAumento(float aum){
		
		this.salario+=aum;
	}

}
