package StreamAPI.StreamAPI08;
// Fundamentos Reduce

public class Aluno {
	
	final String nome;
	public final double nota;
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
