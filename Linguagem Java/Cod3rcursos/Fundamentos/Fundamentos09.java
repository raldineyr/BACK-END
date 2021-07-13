package Fundamentos;
import java.util.Scanner;

public class Fundamento09 {
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Oi " + nome);
		
		System.out.printf("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Olá Sr. " + sobrenome);
		
		System.out.printf("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.println(idade);
		
		entrada.close();
		}

}
