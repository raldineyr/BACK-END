package TratamentoDeErros.TratamentoDeExcecao01;

public class Fundamentos {
	
	public static void main (String[] args){
		
	Aluno a1 = null; // Declarando nulo ao aluno.
	
	
	/* O bloco try é alimentado com códigos que pode gerar erros
	e o catch é usado para construir o tratamento. */
	
	
	try {
		imprimirNomeDoAluno(a1);
		
	} catch(Exception excecao){
		
		System.out.println("Há um erro de impressão"
				+ " na declaração do usuario.");
	}		
			
	
	
	try {
		System.out.println(10000 / 0);
		
	} catch (ArithmeticException e) {
		
		System.out.println("Ocorreu o erro: " + e.getMessage()); 
	}
	
	
		
	System.out.println("FIM!");
	
	}
	
	public static void imprimirNomeDoAluno (Aluno aluno) {
		
		System.out.println(aluno.nome); // Utilização do método sem ter a existência do aluno.
	}
}
