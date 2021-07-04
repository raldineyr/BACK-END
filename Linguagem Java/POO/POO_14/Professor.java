package POO14;

public class Professor extends Pessoa{
	
	protected String especialidade;
	protected float salario;
	
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
	
	// Método especial
	
	public void receberAumento(float aumento){
		
		this.salario+=aumento;
		
		System.out.println("valor do aumento: " + aumento);
	}
	
	

}
