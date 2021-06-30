package POO02;

public class Principal {
	
	public static void main (String[] args) {
		
		Caneta c1 = new Caneta(); // instânciar objetos.
		
		c1.modelo = "Bic Cristal";
		c1.cor = "Azul";
		c1.carga = 98;
		
		//c1.tampa = true; ()
		
		c1.destampada(); // Manobra em ação.
		c1.status();
		c1.rabiscar();
	}	
	
}
