package POO.Encapsulamento02;

public class PessoaTeste {

		public static void main(String[] args) {
			
			Pessoa p1 = new Pessoa("Boroca","Palmeiron" ,- 45);
			
			//p1.idade = -30; // Alteração
			//p1.setIdade(-45); // Alteração
			
			//System.out.println(p1.idade); // Leitura
			System.out.println(p1.getIdade()); // Leitura
			System.out.println(p1); //toString
			System.out.println(p1.getNomeCompleto());
			
/* Os métodos getters and setters tem relação com o encapsulamento, tornar os 
 * métodos privados e criar tais métodos ajuda na proteção de acesso e alteração
 * dos dados.*/
	}
}
