package ClassesEmetodos09;
// Teste: Valor vs Referência

public class ValorVsReferencia {
	
	public static void main(String[] args) {
				
		double a = 2;
		double b = a; // Atribuição por valor 
		
		a++;
		b--;
		
		System.out.println(a + "\n" + b);
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // Atribuição por referência (Objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		
		d1.ano = 2025;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		/* A partir de um métdodo que pertence a classe conseguimos acessar outro que pertence
		   a mesma classe, porém não conseguimos acessar um método de instância utilizando um 
		   método estático. */
		
		System.out.println("Chamada do método \"voltar data para valor padrão\" e suas consequências\n");
		voltarDataParaValorPadrão(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}
	
	/* Como eu estou passando um objeto com parametro para uma função, por padrão ele irá como referenciado
	   alterando os demais.*/
	
	static void voltarDataParaValorPadrão(Data d){

		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int a){
		
		/* A assinatura permite a construção de um endereço de mémoria
		   diferente, portanto não impacta nos demais.
		*/
		
		a++;
	}
}
