package BosonTreinamentos;

public class OperadoresIncrementoDecremento {
	
	public static void main (String[] args) {
		
		int numero = 10;
		int resultado = 0;
		
		System.out.println("Valor original: " + resultado);
		resultado = numero++; // Primeiro atribui, depois incrementa.
		System.out.println("Valor do número após o incremento: " + numero);
		System.out.println("Valor do resultado após o incremento: " + resultado);
		
		numero = 10; resultado = 0;
		
		resultado = ++numero; //Primeiro incrementa. depois atribui
		System.out.println("Valor do número após o incremento: " + numero);
		System.out.println("Valor do resultado após o incremento" + resultado);
		  		
	}

}
