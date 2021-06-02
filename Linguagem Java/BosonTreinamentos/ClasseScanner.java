package BosonTreinamentos;

import java.util.Scanner;

public class ClasseScanner {
	
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		String nome;
		
		System.out.println("Informe o seu nome: ");
		nome = entrada.nextLine();
		
		System.out.println("Bem vindo " + nome);
			
		System.out.println("Informe a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.println("Idade: " + idade + " anos.");
		
		entrada.close();	
				
	}
}
