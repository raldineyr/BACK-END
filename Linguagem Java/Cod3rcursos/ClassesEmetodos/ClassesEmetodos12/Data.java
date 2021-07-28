package ClassesEmetodos12;
// Váriaveis locais

public class Data {
		
	int dia;
	int mes;
	int ano;
	
	Data(int dia, int mes, int ano){
	
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	Data(){
			
		this(01,01,1970);
	}
	
	String obterDataFormatada() {
/* Quando definimos uma variável dentro de um método ela é intitulada como local.
   Uma vez definida a visibilidade será apenas para o método atual e os posteriores.
*/		
		final String formato = "%d/%d/%d"; // Se utilizado o "final" a variavel local, tornase uma constante local.
		return String.format(formato, dia, mes, ano);
	}
}
