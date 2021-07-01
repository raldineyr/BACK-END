package POO_11;

public class Livro implements Publicacao{
	
	// Atributos
	
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	
	
	// Método construtor
	
public Livro(String titulo, String autor, int totalPaginas, int pagAtual, boolean aberto, Pessoa leitor) {
		
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setTotPaginas(totalPaginas);
		this.setPagAtual(pagAtual);
		this.setAberto(aberto);
		this.setLeitor(leitor);
		
	}
	
	// Método toString

	public String detalhes() {
		return "Livro:\ntitulo: " + titulo + ", autor: " + autor + ".\ntotPaginas = " + totPaginas + "\npagAtual = " + pagAtual
				+ "\naberto = " + aberto + "\nleitor = " + leitor.getNome()+ ", idade: " + leitor.getIdade()+", genero: "+leitor.getSexo()+".\n";
		
	}

	
	// Métodos acessores e mofificadores 
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getTotPaginas() {
		return totPaginas;
	}
	
	public void setTotPaginas(int totalPaginas) {
		this.totPaginas = totalPaginas;
	}
	
	public int getPagAtual() {
		
		return pagAtual;
	}
	
	public void setPagAtual(int pagAtual) {
		
		if(this.aberto = false) {
			
			this.pagAtual = 0;			
		}
		
		else
		{
			this.getPagAtual();
		}
		
		this.pagAtual = pagAtual;
	}
	
	public boolean getAberto() {
		
		return aberto;
		
	}
	
	public void setAberto(boolean aberto) {
		
		this.aberto = aberto;
	}
	
	public Pessoa getLeitor() {
		return leitor;
	}
	
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	// Métodos abstratos

	@Override
	public void abrir() {
		this.aberto = true;
	}

	@Override
	public void fechar() {
		this.aberto = false;
	}

	@Override
	public void folhear(int p) {
		if(p > this.totPaginas) {
			this.pagAtual = 0;
		}
		
		this.pagAtual = p;
	}

	@Override
	public void avançarPag() {

		this.pagAtual++;
	}

	@Override
	public void voltarPag() {

		this.pagAtual--;
	}
	
	
}
