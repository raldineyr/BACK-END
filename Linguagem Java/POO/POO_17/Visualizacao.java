package POO17;

public class Visualizacao {
	
	// Atributos
	
	private Gafanhoto espectador; // Agregação Visualização > Gafanhoto
	private Video filme; // Agregação Visualização > Vídeo
	
	// Método construtor
	
	public Visualizacao(Gafanhoto espectador, Video filme) {
		this.espectador = espectador;
		this.filme = filme;
	}
	
	// Métodos acessores e modificadores

	public Gafanhoto getEspectador() {
		return espectador;
	}

	public void setEspectador(Gafanhoto espectador) {
		this.espectador = espectador;
	}

	public Video getFilme() {
		return filme;
	}

	public void setFilme(Video filme) {
		this.filme = filme;
	}

	@Override
	public String toString() {
		return "Visualização espectador: " + espectador + ", filme: " + filme;
	}
}
