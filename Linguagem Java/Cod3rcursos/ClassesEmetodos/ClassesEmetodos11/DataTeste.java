package ClassesEmetodos11;
//Classes e  métodos: This e this();

public class DataTeste {
	
	public static void main(String[] args) {
		
	Data d1 = new Data(16,11,1971);
		
		var d2 = new Data();
		
		d2.dia = 01;
		d2.mes = 01;
		d2.ano = 1970;
		
		String dataFormatada1 = d1.obterDataFormatada();
		System.out.println(dataFormatada1);
		
		String dataFormatada2 = d2.obterDataFormatada();
		System.out.println(dataFormatada2);		
	}
}
