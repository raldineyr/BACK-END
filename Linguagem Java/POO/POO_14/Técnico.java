package POO14;

public final class Tecnico extends Aluno{
	
	// Atributos
	
	protected int registroProfissional;
	
	// Métodos acessores e modificadores
	
	public int getRegistroProfissional(){
		
		return this.registroProfissional;
	}
	
	public void setRegistroProfissional(int registroProfissional){
		
		this.registroProfissional = registroProfissional;
	}
	
	// Método especial
	
	public void praticar(){
		
		System.out.println( getNome() + " Está praticando o conhecimento técnico.");
	}
	
	@Override
	public final void pagarMensalidade(){
		System.out.println(this.getNome()+" é tecnico, o pagamento é realizado pelo contratante.");
	}

}
