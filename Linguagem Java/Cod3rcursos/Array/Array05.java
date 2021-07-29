package Array;
import java.util.Arrays;

import java.util.Scanner;

public class Array05 {

	public static void main (String[] args){
		
	Scanner entrada = new Scanner(System.in);
	
	
	System.out.printf("Informe a quantidade de alunos: ");
	int quantidadeAlunos = entrada.nextInt();
	
	System.out.printf("Informe a quantidade de notas: ");
	int quantidadeNotas = entrada.nextInt();
	
	
	double[][] notasDaTurma = new double [quantidadeAlunos][quantidadeNotas];
	
	
	double total = 0;
	for (int aluno = 0; aluno < notasDaTurma.length; aluno++) {
			for (int avaliacao = 0; avaliacao < notasDaTurma[aluno].length; avaliacao++){
				System.out.printf("Informe a nota %d do aluno %d: ",avaliacao + 1, aluno + 1);
		
			notasDaTurma[aluno][avaliacao] = entrada.nextDouble();
			total += notasDaTurma[aluno][avaliacao];		
		}
	}
	
	double media = total / (quantidadeAlunos * quantidadeNotas);
	System.out.println("Média da turma é " + media);
	
	for (double[] notasDoAluno: notasDaTurma){
		System.out.println(Arrays.toString(notasDoAluno));
	}
	
	entrada.close();
	}	
}
