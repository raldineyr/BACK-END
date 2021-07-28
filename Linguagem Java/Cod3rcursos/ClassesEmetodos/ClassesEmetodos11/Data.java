package ClassesEmetodos11;
// Classes e  métodos: This e this();

/* O this é utilizado para referênciar os atributos de instância,
  sanando o conflitos entre os seus nomes.
*/
public class Data {
	
	// Atributos 
	
	int dia;
	int mes;
	int ano;
	
	Data(int dia, int mes, int ano){
	
		// O this está referenciando os atributos do objeto. 
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
		/* O this é utilizado para referênciar os atributos de instância,
		sanando o conflitos entre os seus nomes.
		 */
	}
	
	Data(){
		
		//this.dia = 01;
		//this.mes = 01;
		//this.ano = 1970;	
		this(01,01,1970); // Podemos também usar o this como método
	}
	
	String obterDataFormatada() {
		
		return String.format("%d/%d/%d\n", dia, mes, ano);
	}
}
