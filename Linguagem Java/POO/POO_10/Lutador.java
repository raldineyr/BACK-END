package POO10;

public class Lutador {
	
	// Atributos
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias, derrotas, empates;
	
	// Metódo Construtor 
	
	public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
		
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso(pe);
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = em;
	}
	
	// Metódos Acessores e modificadores
	
	public String getNome() {
		return nome;
	}
	public void setNome(String no) {
		this.nome = no;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String na) {
		this.nacionalidade = na;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int id) {
		this.idade = id;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float al) {
		this.altura = al;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float pe) {
		this.peso = pe;
		this.setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if (this.getPeso() < 52.2 ) this.categoria = "Inválido";
		else if (this.getPeso() <= 70.3) this.categoria = "Leve";
		else if (this.getPeso() <= 83.9) this.categoria = "Médio"; 
		else if (this.getPeso() <= 120.2)  this.categoria = "Pesado";
		else this.categoria = "Inválido";
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vi) {
		this.vitorias = vi;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int de) {
		this.derrotas = de;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int em) {
		this.empates = em;
	}
	
	// Estado especiais
	
	public void ganharLuta(){
		
		this.setVitorias(this.getVitorias()+1);
		
	}
	public void perderLuta(){
		this.setDerrotas(this.getDerrotas()+1);
		
	}
	public void empatarLuta(){
		this.setEmpates(this.getEmpates()+1);
	}
	
	public void apresentar() {
		System.out.println("Lutador: " + getNome());
		System.out.println("Origem: " + getNacionalidade());
		System.out.println("Idade :" + getIdade());
		System.out.println("Altura: "  + getAltura()+ "m.");
		System.out.println("Peso: " + getPeso());
		System.out.println("Vitorias: " + getVitorias());
		System.out.println("Derrotas: " + getDerrotas());
		System.out.println("Empate: " + getEmpates() + "\n");
	}
	
	public void status(){
		System.out.println(getNome() + " é um peso " + this.getCategoria());
		System.out.println("Acumula " + getVitorias() + " vitorias.");
		System.out.println("Acumula " + getDerrotas() + " derrotas.");
		System.out.println("E acumula " + getEmpates() + " empates\n");
	}
	
}
