package Array;
// Desafio array 02

public class Array03 {
	
	public static void main(String[] args) {
		
		// Primeiro aluno
		
		double[] notasAlunoA = { 7.0, 7.0, 7.0 , 7.0};
		
		double totalA = 0;
		
		for(double notasA: notasAlunoA){
			
			System.out.println(notasA + " ");
			
			totalA += notasA;
		}
		System.out.println("Media: " + totalA / notasAlunoA.length);
		
		// Segundo aluno
		
		double[] notasAlunoB = { 8.0, 8.0, 8.0, 8.0};
		
		double totalB = 0;
		
		for (double notasB: notasAlunoB){
			
			System.out.println(notasB + " ");
			
			totalB += notasB;
		}
		
		System.out.println("Media: " + totalB / notasAlunoB.length);	
	}
}
