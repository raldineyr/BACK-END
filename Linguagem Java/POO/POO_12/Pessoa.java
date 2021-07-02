package POO12;

public class Pessoa {
	
	// Atributos
	
	private String nome;
	private int idade;
	private String genero;
	
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
		return "Pessoa:\nnome: " + getNome() + ", idade: " + getIdade() + ", genero: " + getGenero() + "\n";
	}
	

}
