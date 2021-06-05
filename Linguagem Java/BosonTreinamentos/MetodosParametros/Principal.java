package MetodosParametros;

import java.util.Scanner;

public class Principal {
	
	public static void main (String[] args) {
		
		String nomeAluno;
		int idadeAluno;
		
		Scanner entrada = new Scanner(System.in);
		
		MandaMensagem oi = new MandaMensagem(); // Criação do Objeto.
		
		System.out.println("Digite o seu nome: ");
		nomeAluno = entrada.nextLine();
		
		System.out.println("Informe a sua idade: ");
		idadeAluno = entrada.nextInt();
		
		oi.mandaBoasVindas(nomeAluno, idadeAluno);
		
		oi.enviaMensagem();
		
		entrada.close();
	}

}
