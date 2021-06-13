package POO01;

public class Principal {
	
	public static void main (String[] args) {
		
		// Primeira caneta: Azul
		
		Caneta c1 = new Caneta(); // instânciar objetos.
		
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampa = false;
		c1.modelo = "Bic";
		c1.carga = 90;
		
		c1.rabiscar();
		c1.status();
		
		// Segunda caneta: Preta
		
		Caneta c2 = new Caneta(); // instânciar objetos.
		
		c2.cor = "Preta";
		c2.ponta = 0.7f;
		c2.tampa = true;
		c2.modelo = "Faber Castel";
		c2.carga = 55;
		
		c2.rabiscar();
		c2.status();
		 
	}
	
}
