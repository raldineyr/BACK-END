package Array;
import java.util.Scanner;
// Desafio array 02

public class Array04 {
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de notas: ");
		int quantidadeNotas = entrada.nextInt();
		
		double[] notas = new double[quantidadeNotas];
		
		for (int i = 0; i < notas.length; i++){
			System.out.printf("Informe a %dº nota: ",i+1);
			
			notas[i] = entrada.nextDouble();
		}
		
		double total = 0;
		for (double nota: notas){
			total += nota;
		}
		
		double media = total / quantidadeNotas;
		System.out.println("A média é "+ media + "!");
		
		entrada.close();
	}
}
