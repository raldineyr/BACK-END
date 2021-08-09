package POO.ModificadoresDeAcesso.CasaA;
// Niveis de visibilidade

public class Paulo {
	
	Ana esposa = new Ana();

	void testeAcesso() {
		
		/* segredo
		 facoDentroDeCasa
		formaDeFalar
		 todosSabem */
		
		//System.out.println(esposa.segredo); // Acesso privado
		System.out.println(esposa.facoDentroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);	
	}
}
