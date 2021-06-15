package Exercicios03;

public class Livro {
	
	//Atributos
	
	protected String modelo;
	protected String titulo;
	protected String autor;
	protected String editora;
	protected int isbn;
	public int pagina;
	protected boolean capa;
	
	
	//Métodos 
	
	public Livro () { // Este é o método construtor
		
	
		this.setModelo("");
		this.setTitulo("");
		this.setAutor("");
		this.setIsbn(0);
		this.setPagina(0);
		this.getFechado();
	}
	
	public String getModelo() {
		
		return this.modelo;
	}
	
	public void setModelo(String m) {
		
		this.modelo = m;
	}
	
	public String getTitulo() {
		
		return this.titulo;
	}
	
	public void setTitulo(String t) {
		this.titulo = t;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public void setAutor(String a) {
		this.autor = a;
		
	}
	
	public String getEditora() {
		return this.editora;
		
	}
	
	public void setEditora(String e) {
		this.editora = e;
	}
	
	public int getIsbn() {
		
		return this.isbn;
	}
	
	public void setIsbn(int i) {
		this.isbn = i;
	}
	
	public int getPagina() {
		
		return this.pagina;
	}
	
	public void setPagina(int p) {
		this.pagina = p;
	}
	
	public boolean getCapa() {
		
		return this.capa;
	}
	
	public void setCapa(boolean c) {
		
		this.capa = c;
	}
	
	public boolean getAberto() {
		
		return this.capa = true;
	}
	
	public void setAberto(boolean a) {
		
		this.capa = a; 
	}
	
	
	public boolean getFechado() {
		
		return this.capa = false;
	}
	
	public void setFechado(boolean f) {
		this.capa = f;
	}
	
	
	
	// Estado atual
	
	
	
	public void folheando () {
		 
		 if (this.capa == true && this.pagina > 0 && this.pagina < 146 ) System.out.println("\nRealizando leitura!");
		 
		 else if (this.capa == false && this.pagina > 0 && this.pagina < 146) System.out.println("\nUltima página marcada: " + this.getPagina());
		 
		 else System.out.println ("\nDisponivel para leitura!");
	 }
	
public void status() {
	
		System.out.println("Sobre o livro:\n");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("\nAutor: " + this.getAutor());
		System.out.println("\nEditora: " + this.getEditora());
		System.out.println("\nPadrão Internacional de Numeração do livro: " + this.getIsbn());
		System.out.println("\nO livro está aberto? " + this.getCapa());
		System.out.println("\nUltima página lida: " + this.getPagina());
		
	}
}
