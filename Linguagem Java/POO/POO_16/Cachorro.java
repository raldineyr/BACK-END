package POO16;

public class Cachorro extends Lobo{
	
	@Override
	public void emitirSom(){
		System.out.println("Latindo");
	}
	
	public void reagir(String frase){
		if(frase =="toma comida" || frase == "Olá") {
			System.out.println("Abanando o rabo e latindo");
		}else{
			System.out.println("Rosnando");
		}
		
	}
	
	public void reagir(int hora, int min){
		if (hora > 12)System.out.println("Abanando o rabo");
		else if (hora >= 18) System.out.println("Ignorando");
		else System.out.println("Abanando o rabo e latindo");
	}
	
	public void reagir (boolean dono){
		if (dono == true) System.out.println("Abanado o rabo");
		else System.out.println("Rosnando e latindo");
	}
	
	public void reagir (int idade, float peso){
		if (idade < 5 && peso < 10) System.out.println("Abanar o rabo");
		else if (idade > 5 && peso < 10)System.out.println("Rosnando");
		else System.out.println("Ignorando");
	}
}
