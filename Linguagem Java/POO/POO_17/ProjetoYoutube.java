package POO17;

public class ProjetoYoutube {
	public static void main(String[] args){
		
		Video v[] = new Video[3];
		Gafanhoto g[] = new Gafanhoto[3];
		Visualizacao visualizacao = new Visualizacao(g[2],v[1]);
		
		v[0] = new Video("Redes de computadores");
		v[1] = new Video("Git e GitHub");
		v[2] = new Video("Liguagem C, GO, JAVA");
		
		g[0] = new Gafanhoto("Raldiney",27,"M","raldineyr");
		g[1] = new Gafanhoto("Marlene", 49, "F","marlener");
		g[2] = new Gafanhoto("Boroca",23,"F","borocar");
		
		/*
		System.out.println("========== VIDEO ==========");
		System.out.println(v[0].toString());
		System.out.println(v[1].toString());
		System.out.println(v[2].toString());
		
		System.out.println("========== USUÁRIO ==========");
		System.out.println(g[0].toString());
		System.out.println(g[1].toString());
		System.out.println(g[2].toString()); 
		*/
		
		System.out.println("========== VISUALIZAÇÃO ==========");
		System.out.println(visualizacao.toString());
	}

}
