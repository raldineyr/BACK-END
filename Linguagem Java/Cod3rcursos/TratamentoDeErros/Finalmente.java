package TratamentoDeErros.Excecao;

import java.util.Scanner;

public class Finalmente {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);	
		
		try {
			
			System.out.println(7 / entrada.nextInt());
			
			
		} catch(Exception e) {
			
			System.out.println(e.getMessage());
			
		} finally{
			
			System.out.println("Finalmente...");
			entrada.close();
		}
		
		
		// Segunda situação sem o catch
		
		
		try {
			System.out.println(7 / entrada.nextInt());
			
		} finally{
			
			System.out.println("Finalmente#02...");
			entrada.close();
		}
		
		System.out.println("FIM!");
	}
}
