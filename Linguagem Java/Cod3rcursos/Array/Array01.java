package Array;
import java.util.Arrays;

// Array
public class Array01 {
	
	public static void main (String[] args){
		// Primeiro aluno.
		
		double[] notasAluno1 = new double[4];
		
		notasAluno1[0] = 7.0;
		notasAluno1[1] = 7.0;
		notasAluno1[2] = 7.0;
		notasAluno1[3] = 8.0;
		
		System.out.println(Arrays.toString(notasAluno1));
		
		float total = 0F;
		
		for (int i = 0; i < notasAluno1.length; i++) {
			
			total += notasAluno1[i];
		}
		System.out.println(total/notasAluno1.length);
		
		
		// Segundo aluno.
		
		double[] notasAluno2 = {4.9, 7.5, 9.3, 6.2};
		
		for (int i = 0; i < notasAluno2.length; i++){
			
			total += notasAluno2[i];
		}
		System.out.println(total/ notasAluno2.length);
	}
}
