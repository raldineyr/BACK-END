package Generics;

public class ParesTeste {

	public static void main(String[] args) {
		
		Pares<Integer, String> resultadoConcurso = new Pares<>();
			
		resultadoConcurso.adicionar(1,"Mari");
		resultadoConcurso.adicionar(2,"Mel");
		resultadoConcurso.adicionar(3,"Yuri");
		resultadoConcurso.adicionar(4,"Marcelo");
		resultadoConcurso.adicionar(5,"Edi");
		resultadoConcurso.adicionar(6,"Jonas");
		resultadoConcurso.adicionar(1,"Kayke");
		resultadoConcurso.adicionar(8,"Mamaca");
		
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(2));
		System.out.println(resultadoConcurso.getValor(3));
		System.out.println(resultadoConcurso.getValor(4));
		System.out.println(resultadoConcurso.getValor(5));
		System.out.println(resultadoConcurso.getValor(0));
	}
}
