package ClassesEmetodos02;
//Iniciando atributos e instâncias

public class DataTeste {
	
	public static void main(String[] args){
		
		Data d1 = new Data();
		
		d1.dia = 16;
		d1.mes = 07;
		d1.ano = 2021;
		
		var d2 = new Data();
		
		d2.dia = 00;
		d2.mes = 00;
		d2.ano = 2021;
		
		System.out.printf("Data: %d.%d.%d\n",d1.dia,d1.mes,d1.ano);
		
		System.out.printf("Data: %d.%d.%d",d2.dia,d2.mes,d2.ano);
	}

}
