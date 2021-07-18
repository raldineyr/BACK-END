package EstruturasDeControle;
// if  Else-if  Else
import java.util.Scanner;

public class EstruturasDeControle04 {
	
	public static void main(String[] args){
			
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a nota: ");
	
		double nota = entrada.nextDouble();
		
		if (nota > 10 || nota < 0)
			System.out.println("Nota inválida!");
		
		else if(nota >= 8.1) System.out.println("Conceito A");
		
		else if (nota >= 6.1) System.out.println("Conceito B");
		
		else if (nota >= 4.1) System.out.println("Conceito C");
		
		else System.out.println("Conceito E");
		
		entrada.close();
	}

}
