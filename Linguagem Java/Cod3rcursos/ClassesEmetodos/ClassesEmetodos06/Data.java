package ClassesEmetodos06;
// Desafio método construtor

public class Data {
	// Atributos 
	
	int dia;
	int mes;
	int ano;
	
	Data(int diaInicial, int mesInicial, int anoInicial){
		
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	Data(){
		
		dia = 01;
		mes = 01;
		ano = 1970;	
	}
	
	String obterDataFormatada() {
		
		return String.format("%d/%d/%d\n", dia, mes, ano);
	}
}
