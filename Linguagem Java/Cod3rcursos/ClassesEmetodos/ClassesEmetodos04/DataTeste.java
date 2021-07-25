package ClassesEmetodos04;
//Desafio criação de metódo

public class DataTeste {
	
	public static void main(String[] args){

		Data d1 = new Data();
		Data d2 = new Data();
		
		d1.dia = 16;
		d1.mes = 07;
		d1.ano = 2021;
				
		d2.dia = 17;
		d2.mes = 07;
		d2.ano = 2021;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		 
	}
}
