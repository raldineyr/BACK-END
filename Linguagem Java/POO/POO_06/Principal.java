package POO06;

public class Principal {
	
	public static void main (String[] args) {
		
		Caneta c1 = new Caneta();
		
		c1.setModelo("BIC"); /// Método acessor.
	    // c1.modelo = "BIC";  Acesso direto pelo atributo.
		
		c1.setPonta(0.5f);
		// c1.ponta = 0.5f; Acesso direto pelo atributo interrompido devido ao método privado do atributo,
		
 		c1.status();
 		
 		System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
	}

}
