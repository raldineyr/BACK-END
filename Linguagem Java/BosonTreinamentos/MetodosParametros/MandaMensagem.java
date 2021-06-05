package MetodosParametros;

public class MandaMensagem {
	
	public void enviaMensagem() {
		
		System.out.print("Bem vindo a Bóson Treinamentos!");
	}
	
	public void mandaBoasVindas(String nome, int idade) {
		
		//System.out.println("Bem vindo ao curso de Java, " + nome +".");
		System.out.printf("Olá, %s, você tem %d anos.", nome, idade);
	}

}
