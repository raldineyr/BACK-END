package Fundamentos;
// Operador ternário

public class Fundamento23 {
	public static void main(String[] args){
		
		double media = 8.0;
		String resultadoFinal = media >= 7.0 ? "Aprovado.": "em recuperação";
		System.out.println("O aluno está " + resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Não.";
		
		System.out.printf("Tem desconto? %s",resultado);
		
	}
}
