package POO14;

public final class Bolsista extends Aluno{
	
	// Atributos
	
	private int bolsa;
	
	// Métodos acessores e modificadores
	
	public int getBolsa(){
		
		return this.bolsa;
	}
	
	public void setBolsa(int bolsa){
		
		this.bolsa = bolsa;
	}
	
	// Método especial
	
	public void renovarBolsa(){
		System.out.println("Renovando bolsa do aluno: " + this.getNome());
	}
	
	@Override
	public final void pagarMensalidade(){
		System.out.println(this.getNome()+" é bolsista, o pagamento foi facilitado.");
	}

}
