package EstruturasDeControle;
// loop for aninhado

public class EstruturasDeControle11 { 
	
	public static void main(String[] args){
		
		for (int i = 0; i <= 10; i++){
			for (int j = 0; j <= 10; j++){
				
				System.out.printf("[%d | %d]\n", i, j);
			}
		}
		System.out.println();
	}

}
