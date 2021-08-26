package StreamAPI.StreamAPI11;

public class Aluno {
	
	final String nome;
	final double nota;
	final boolean comportamento;
	
	public Aluno(String nome, double nota) {
	
		this(nome, nota, true);
		
	}
	
	public Aluno(String nome, double nota, boolean comportamento){
		
		this.nome = nome;
		this.nota = nota;
		this.comportamento = comportamento;
	}
	
	public String toString(){
		return nome + " tem a nota: " + nota;
	}
}
