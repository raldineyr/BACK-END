package Fundamentos;
import java.util.Scanner;
// Desafio calculadora

public class Fundamento25 {

	public static void main(String[] args){
	Scanner entrada = new Scanner(System.in);
	
	System.out.printf("Digite o primeiro numero: ");
	double numero1 = entrada.nextDouble();	
	
	System.out.printf("Digite o segundo numero: ");
	double numero2 = entrada.nextDouble();
	
	System.out.printf("Digite o operador: ");
	String operador = entrada.next();
	
	double resultado = "+".equals(operador) ? numero1 + numero2 : 0;
	resultado = "-".equals(operador) ? numero1 - numero2 : resultado;
	resultado = "*".equals(operador) ? numero1 * numero2 : resultado;
	resultado = "/".equals(operador) ? numero1 / numero2 : resultado;
	resultado = "%".equals(operador) ? numero1 % numero2 : resultado;
			
	System.out.printf("%.2f %s %.2f = %.2f",numero1,operador,numero2, resultado);
		
	entrada.close();
 }
}
