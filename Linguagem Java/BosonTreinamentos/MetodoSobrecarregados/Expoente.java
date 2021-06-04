package MetodoSobrecarregados;

public class Expoente {
	
	// Método qe não calcula nada
	public static void elevar() {
		
		System.out.println("Este método não calcula nada!");
	}
	
	
	//Método que calcula o quadrado de i
	public static double elevar(double i) {
		return i * i;
		
	}
	
	//Método que calcula i elevado a j
	public static double elevar (double i, double j) {
		return Math.pow(i, j);
	}

}
