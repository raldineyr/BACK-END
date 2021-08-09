package POO.ModificadoresDeAcesso.CasaB;
import POO.ModificadoresDeAcesso.CasaA.Ana;
//Niveis de visibilidade

public class Pedro extends Ana {
	
	/*
	Não conseguimos acessar o contéudo protegido através do herdeiro,
	pois estamos tentando acessalo a partir de uma instância e não da 
	forma natural que seria diretamente. */

	void testeAcesso(){
		
		System.out.println(formaDeFalar);
		System.out.println(todosSabem); 
		System.out.println(new Ana().todosSabem);
	}
	
}
