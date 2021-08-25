package StreamAPI.StreamAPI09;

//media complexo com reduce
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
}
