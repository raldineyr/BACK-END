package POO_11;

public class Pessoa {
	
	// Atributos 
	
	private String nome;
	private int idade;
	private String sexo;
	
	// Metódo construtor
	
	public Pessoa(String nome, int idade, String sexo) {
		
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		
	}
	
	// Metódos acessores e modificadores
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade(){
		
		return this.idade;
	}
	
	public void setName(int idade){
		
		this.idade = idade;
	}
	
	public String getSexo(){
		
		return this.sexo;
	}
	
	public void setSexo(String sexo){
		
		this.sexo = sexo;	
	}
	
	public void fazerAniver(){
		
		this.idade++;
	}
	
}
