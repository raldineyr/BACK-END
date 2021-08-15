package POO.Encapsulamento02;

	// Fundamentos getters and setters

public class Pessoa {

	private int idade;
	private String nome;
	private String sobrenome;
	
	public Pessoa(){
		 
	}
		 
	public Pessoa(String nome, String sobrenome, int idade){
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);

	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getSobrenome(){
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome){
		this.sobrenome = sobrenome;
	}
	
	public String getNomeCompleto(){
		
		return getNome() + " " + getSobrenome();
	}
	
		  
	// Getter
	public int getIdade() {	 
		return idade;
	}
	
	// Setter
	public void setIdade(int novaIdade){
		novaIdade = Math.abs(novaIdade);
		if (novaIdade >= 0 && novaIdade <= 120) this.idade = novaIdade; 
	}
	
	
	@Override
	public String toString() {
		
		return "Olá eu sou o " + getNome() + " " + getSobrenome() + " tenho " + getIdade()+" anos.";
	}
}


