package Fundamentos;

// Conversão de tipos primitivos
public class Fundamento12 {
	public static void main(String[] args){
	
		double a = 1; // Conversão implicita
		System.out.println(a);
		
		float b = (float)1.0; // Conversão explicita (CAST)
		System.out.println(b);
		
		// O Java não analisa os valores e sim os tipos ex: 
		int c = 10;
		byte d = (byte) c; // O compilador automaticamente solicita o CAST (explicito)		
		System.out.println(d);
		
		double e = 6.999999;
		int f = (int) e; // explicita (CAST)
		System.out.println(f);
	}

}
