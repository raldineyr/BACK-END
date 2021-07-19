package EstruturasDeControle;
import java.util.Scanner;

// Estrutura de controle Do-While
public class EstruturasDeControle08 {
	
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {	
				System.out.println("Você precisa falar as palavras mágicas");
				System.out.println("Quer sair ?");
				
				texto = entrada.nextLine();
				
		} while(!texto.equalsIgnoreCase("Por favor"));
		
		System.out.println("Obrigado!");
		entrada.close();		
		
	}

}
