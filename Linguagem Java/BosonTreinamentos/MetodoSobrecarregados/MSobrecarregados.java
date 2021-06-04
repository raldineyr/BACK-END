package MetodoSobrecarregados;

public class MSobrecarregados {
	
	public static void main (String[] args) {
		
		double a = 3;
		double b = 0;
		
		System.out.printf("O quadrado de %.2f é %.2f\n", a, Expoente.elevar(a));
		System.out.printf("%.2f elevado a %.2f é %.2f\n", a, b, Expoente.elevar(a,b));
		Expoente.elevar();
	}

}
