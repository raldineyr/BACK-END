package POO17;

public class Gafanhoto extends Pessoa{
	
	//Atributos
	
	protected String login;
	protected float totAssistido;
	
	// Método Construtor 
	
	public Gafanhoto(String nome, int idade, String genero, String login) {
		super(nome, idade, genero);
		
		this.login = login;
		this.totAssistido = 0;
	}
	
	// Método especial
	
	public void viuMaisUm(){
		this.setTotAssistido(totAssistido + 1);
	}
	
	//Métodos acessores e modificadores
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public float getTotAssistido() {
		return totAssistido;
	}
	public void setTotAssistido(float totAssistido) {
		this.totAssistido = totAssistido;
	}

	@Override
	public String toString() {
		return "Gafanhoto: " + super.toString() +" login: " + login + " totAssistido: " + totAssistido + "\n";
	}
	
}
