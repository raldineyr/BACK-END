package BosonTreinamentos;

import java.util.Random;

public class ClasseRandom{
	
	public static void main(String[] args){
		
		Random aleatorio = new Random();
		
		 int valor = aleatorio.nextInt(9) + 1; //Gera números entre 0 e 10
		/* int valor = aleatorio.nextInt(10);  Gera números entre 0 e 9 */
		
		/* float valor = aleatorio.nextFloat(); O número gerado é sempre 0.0 a 1.0 */
		/* float valor = aleatorio.nextFloat() * 100; o número gerado será entre 0 e 99 */
		
		System.out.println("Número gerado: " + valor);
		
	}
	
}
