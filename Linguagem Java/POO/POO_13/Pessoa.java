package POO13;

public class Pessoa {
	
	// Atributos
	
	private String nome;
	protected int idade;
	private String genero;
	
	// Método construtor
	
	public Pessoa(String nome, int idade, String genero){
		
		this.setNome(nome);
		this.setIdade(idade);
		this.setGenero(genero);
			
	}
	
	// Métodos acessores e modificadores

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	// Métodos especiais
	
	public void fazerAniv(){
		
		this.idade++;
	}

	@Override
	public String toString() {
		return "Pessoa:\nnome: " + nome + ", idade: " + idade + ", genero: " + genero + "\n";
	}
}
	
	
