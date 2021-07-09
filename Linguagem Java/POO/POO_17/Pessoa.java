package POO17;

public abstract class Pessoa {
	
	//Atributos 
	
	protected String nome;
	protected int idade;
	protected String genero;
	protected float experiencia;
	
	// Método especial 
	
	protected void ganharExp(){
		this.setExperiencia(experiencia + 1);;
	}
	
	// Método construtor
	
	public Pessoa(String nome, int idade, String genero) {
		
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.experiencia = 0;
		
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
	public float getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(float experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "" + nome + ", idade: " + idade + ", genero: " + genero+"\n";
	}
	
	
	
	
}
