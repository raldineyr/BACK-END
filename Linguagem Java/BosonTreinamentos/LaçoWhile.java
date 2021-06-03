package BosonTreinamentos;

import java.util.Scanner;

public class LaçoWhile {
	
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		
		System.out.println("Digite seu nome ou 's' para sair: ");
		nome = entrada.nextLine();
		
		while (!nome.equals("s")) {
			
			System.out.printf("Bem vindo %s\n",nome);
			System.out.printf("Digite seu nome ou 's' para sair: ");
			nome = entrada.nextLine();
		}
		entrada.close();
		System.out.println("Fim da execução!");
	}

}
