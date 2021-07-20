package EstruturasDeControle;
// Desafio While
import java.util.Scanner;
public class EstruturasDeControle09 {
	
	public static void main (String[] args){
		
		Scanner entrada = new Scanner(System.in);	
		
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1){	

			System.out.printf("Informe a nota ou \"-1\" para sair: ");
			
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
				
				total += nota;
				quantidadeDeNotas++;	
				
			} else {
				
				System.out.println("A nota foi inválida!");
		}	
	}
		// Calcular a média
		
		double media = total / quantidadeDeNotas;
		System.out.println("Média = " + media);
		
		entrada.close();
	}
}
