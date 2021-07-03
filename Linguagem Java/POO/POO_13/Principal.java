package POO13;

public class Principal {
	
	public static void main (String[] args) {
		
		Pessoa p1 = new Pessoa("Raldiney R", 26, "M");
		Aluno p2  = new Aluno("Maria P", 63, "F");
		Professor p3 = new Professor("Marla R", 99,"F");
		Funcionario p4 = new Funcionario ("Joao U", 79, "M");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
	
		p2.fazerAniv();
		p3.receberAumento(2500);
		
	}
}
