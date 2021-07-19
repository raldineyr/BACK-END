package EstruturasDeControle;
// Desafio "sair" com o While

import java.util.Scanner;

public class EstruturasDeControle07 {
	
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		
		while(!valor.equalsIgnoreCase("sair")){
			
			System.out.print("Informe a operação: ");
			
			valor = entrada.nextLine();
		}
			
		entrada.close();
		
	}

}
