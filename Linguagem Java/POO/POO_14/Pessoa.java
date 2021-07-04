package POO14;

public abstract class Pessoa {
	
	//Atributos
	
	private String nome;
	private int idade;
	private String genero;
	
	// Métodos acessores e modificadores
	
	public String getNome(){
		
		return this.nome;
	}
	
	public void setNome(String nome){
		
		this.nome = nome;
	}
	
	public int getIdade(){
		
		return this.idade;
	}
	
	public void setIdade(int idade) {
		
		this.idade = idade;
	}
	
	public String getGenero(){
		
		return this.genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	// Métodos especiais 
	
	public void fazerAniversário(){
		this.idade++;
	}
	
	@Override
	public String toString() {
		return "Pessoa:\nnome: " + nome + ", idade: " + idade + ", genero: " + genero + "\n";
	}
}
