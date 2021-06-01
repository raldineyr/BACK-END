package BosonTreinamentos;

import java.util.Scanner;

public class DeclaracaoEusoDeConstantes {
	
	private static final double LARGURA = 10.0;
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o comprimento: ");
		double comprimento  = entrada.nextDouble();
	
		double area = calculoArea(LARGURA, comprimento);
		System.out.println("A área é: " + area);
		
		entrada.close();
	}
	
	private static double calculoArea(double largura, double comprimento) {
		
		return largura * comprimento;
	}
}
