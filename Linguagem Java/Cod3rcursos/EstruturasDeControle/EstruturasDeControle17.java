package EstruturasDeControle;
// Estrutura de controle continue;

public class EstruturasDeControle17 {
	public static void main(String[] args){
		
		for(int i = 0; i < 10; i++){
			
			if(i % 2 == 1){	
				continue;
			}
			System.out.println(i);
		}
	}
}
