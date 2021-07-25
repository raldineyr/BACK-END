package ClassesEmetodos04;
// Desafio criação de metódo

public class Data {

	// Atributos 
	
	int dia;
	int mes;
	int ano;
	
/* Dentro de uma classe que tem como objetivo ser genérica o ideal é usar 
parâmetros de entrada e retorno. */
	
	String obterDataFormatada() {
		
		return String.format("%d/%d/%d\n", dia, mes, ano);
	}
}
