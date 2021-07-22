package EstruturasDeControle;
// Desafio dia da semana
import java.util.Scanner;
public class EstruturasDeControle18 {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Informe o dia da semana: ");
		
		String diaDaSemana = entrada.next();
		
		if(diaDaSemana.equalsIgnoreCase("Domingo"))
			System.out.println("1º dia da semana.");
		
		else if(diaDaSemana.equalsIgnoreCase("Segunda"))
			System.out.println("2º dia da semana.");
		
		else if (diaDaSemana.equalsIgnoreCase("Terça") || diaDaSemana.equalsIgnoreCase("Terca"))
			System.out.println("3º dia da semana.");
		
		else if (diaDaSemana.equalsIgnoreCase("Quarta"))
			System.out.println("4º dia da semana.");
		
		else if (diaDaSemana.equalsIgnoreCase("Quinta"))
			System.out.println("5º dia da semana");
		
		else if (diaDaSemana.equalsIgnoreCase("Sexta"))
			System.out.println("6º dia da semana.");
		
		else if (diaDaSemana.equalsIgnoreCase("Sábado") || diaDaSemana.equalsIgnoreCase("Sabado"))
			System.out.println("7º dia da semana.");
		
		else System.out.println("Dia inválido!");
		entrada.close();
	}
}
