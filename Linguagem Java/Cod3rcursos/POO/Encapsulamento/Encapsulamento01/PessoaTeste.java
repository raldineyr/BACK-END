package POO.Encapsulamento01;
//Fundamentos getters and setters

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		
		//p1.idade = -30; // Alteração
		p1.alterarIdade(-45); // Alteração
		
		//System.out.println(p1.idade); // Leitura
		System.out.println(p1.lerIdade()); // Leitura

	}
}
