package Fundamentos;
// Tipo String
public class Fundamento08 {
	public static void main(String[] args) {
	/* Funcionalidade para capturar um caractere específico de acordo com a sua posição na string*/
		System.out.println("Olá pessoal tudo Odata?".charAt(5));
		String s = "Boa tarde!"; // Informa os dados á varável.
		
		System.out.println(s.concat("!!!")); // Concatena os dados na variável.
		System.out.println(s + "!!!"); // Concatena os dados na variável.
		System.out.println(s.startsWith("Boa")); // Compara os dados da variável e o informado e verifica se é verdadeiro ou falso a informação.
		System.out.println(s.toLowerCase().startsWith("boa")); // Primeiro ele realizou o lower depois comparou a substituição com o informado "Boa".
		System.out.println(s.toUpperCase().endsWith("tarde!")); // Primeiro ele realizou o Uppeer depois comparou a substituição com o informao "tarde!".
		System.out.println(s.length()); // Informa a quantidade de caracteres na variável.
		System.out.println(s.equals("boa tarde!")); // Realiza a verificação de igualdade.
		System.out.println(s.toUpperCase().equalsIgnoreCase("Boa tarde!")); // Realiza o Upper case, porém, o mesmo é ignorado pelo (equals ignore case).
		
		// Identificação automatica do tipo realizado pelo compilador;
		var nome = "ZeroUm";
		var sobrenome = "Da Rachadinha";
		var idade = 66;
		var salario = 70000.00F;
		
		System.out.println("Nome: " + nome + " Sobrenome: " + sobrenome + "\nIdade: " + idade + "\nsalario: " + salario+"\n");
		System.out.printf("Nome: %s %s.\nIdade %d.\nSalário: R$%.2f\n", nome, sobrenome, idade, salario);
		// 
		String frase = String.format("Nome: %s %s.\nIdade %d.\nSalário: R$%.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Ler documentação Java String");
	
	}
}
