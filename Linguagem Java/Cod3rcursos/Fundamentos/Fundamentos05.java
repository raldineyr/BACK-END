package Fundamentos;
// byte 1 byte: -127 a 127 / short 2 bye /int 4 byte /long 8 bye
public class Fundamento05 {
	public static void main(String[] args){
		// Informações do funcionário
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_324_845_223L;
		
		//Tipos númericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; //Ou true
		
		// Tipo caractere
		char status = 'A'; // ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Número de viagens
		System.out.println(numeroDeVoos /2);
		
		// Pontos por real 
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha ->"+ salario);
		System.out.println("Férias?"+ estaDeFerias);
		System.out.println("Status: "+ status);
		
		
	}

}
