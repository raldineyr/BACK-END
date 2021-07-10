package Fundamentos;

public class Fundamento04 {
	public static void main(String[] args){
		
		double a = 4.5; // Declaração e inicialização da variável
		System.out.println(a);
		
		a = 12; // Variação dos dados armazenados
		System.out.println(a);
		// a = "texto" Uma vez declarada o tipo de uma variável em java, o (tipo) não pode mais ser modificada.
		
		var b = 4.5; //Inferência: O compilador identifica automaticamente o tipo do dado informado.
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		//c = 10000; Uma vez identificada o tipo dos dados armazenados no processo de inferencia o mesmo (tipo) não pode ser mosdificado;
	
		double d; // A variável foi declarada
		d = 3.141592653589793; // A variável foi inicializada
		System.out.println(d); // Utilizando
		
		var e = 12.45;
		System.out.println(e);
		
		var f = 12; // inteiro
		// f = 12.04; Quebra a regra.
		System.out.println(f);
		
		// Resumo a inferência nos possibilita criar uma variável usando a palavra (var), porém não o possibilita modificar o tipo da variável;
	
	}
	
}
