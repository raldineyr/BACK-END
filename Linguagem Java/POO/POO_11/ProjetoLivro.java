package POO11;

public class ProjetoLivro {
	
	public static void main(String[] args) {
		
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Raldiney", 26, "M");
		p[1] = new Pessoa("Mariana", 23, "F");
		
		l[0] = new Livro("Código Limpo", "Robert C. Martin", 405, 40, false,p[0]);
		l[1] = new Livro("Um defeito de cor","Ana M. Gonçalves", 900, 500, false,p[1]);
		l[2] = new Livro("Arquitetura Limpa","Robert C. Martin", 500, 75, false, p[0]);
	
		System.out.println(l[0].detalhes());
		System.out.println(l[1].detalhes());
		
	}

}
