package TratamentoDeErros.ExcecaoPersonalizadaA;

public class Aluno {
	
	public final String nome;
	public final double nota;
	public final boolean comportamento;
	
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (comportamento ? 1231 : 1237);
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(nota);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (comportamento != other.comportamento)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(nota) != Double.doubleToLongBits(other.nota))
			return false;
		return true;
	}
}
