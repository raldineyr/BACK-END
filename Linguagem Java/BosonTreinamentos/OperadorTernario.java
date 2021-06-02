package BosonTreinamentos;

public class OperadorTernario {
	
	public static void main (String[] args) {
		
		int a;
		String b;
		
		a = 12;
		
		b = (a == 5) ? "A é igual a 5" : "A é diferente de 5";
		System.out.println("Resultado: " + b);
		
		b = (a == 12) ? "A é igual a 12" : "A é diferente de 12";
		System.out.println("Resultado: "+ b);
		
	}

}
