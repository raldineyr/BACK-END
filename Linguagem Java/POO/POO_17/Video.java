package POO17;

public class Video implements AcoesVideo{
	
	// Atributos 
	
	protected String titulo;
	protected int avaliacao;
	protected int views;
	protected int curtidas;
	protected boolean reproduzindo;
	
	//Método construtor
	
	public Video(String titulo) {
		this.titulo = titulo;
		this.avaliacao = 0;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}
	// Métodos acessores e modificadores
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public boolean isReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	
	// Métodos da interface
	
	@Override
	public void play() {
	this.reproduzindo = true;	
	}
	
	@Override
	public void pause() {
		this.reproduzindo = false;
	}
	
	@Override
	public void like() {
	this.curtidas++;
	}

	@Override
	public String toString() {
		return "Video titulo:" + titulo + ", avaliacao: " + avaliacao + ", views: " + views + ", curtidas: " + curtidas
				+ ", reproduzindo: " + reproduzindo + "\n";
	}
}
