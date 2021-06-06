package MetodosGet_Set;

import java.util.Scanner;

public class GettersSetters {

	public static void main (String[] args){
		
		String time;
		Futebol torcida = new Futebol(); //Criação objeto
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Para qual time você torce? ");
		time = entrada.nextLine();
		
		entrada.close();
		
		torcida.setTime(time);
		torcida.mostraTime();
	}
}
