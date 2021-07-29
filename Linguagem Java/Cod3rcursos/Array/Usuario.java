package Array;
// Exercício 06 - Fundamentos Hascode

public class Usuario {

	String nome;
	String email;
	
	Usuario(String nome){
		
		this.nome = nome;	
	}
	
	Usuario(){	
		
	}
	
	public boolean equals(Object objeto) {
		
		if (objeto instanceof Usuario){
			
		Usuario outro = (Usuario) objeto;
		
		boolean nomeIgual = outro.nome.equals(this.nome);
		boolean emailIgual = outro.email.equals(this.email);
		
		return nomeIgual && emailIgual;
	}else{
		
		return false;
		}
	}
	
	// O hashcode será abordado em outro exercício
	
	public int hashCode(){
		
		return 0;
	}
}
