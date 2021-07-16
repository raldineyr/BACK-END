package Fundamentos;

public class Fundamento19 {
	public static void main(String[] args){
		// Trabalho terça (V ou F)
		// Trabalho quinta (V ou F)
		// ou 32 + sorvete
		// e 50 + sorvete
		
		boolean trabalhouTerca = true;
		boolean trabalhouQuinta = false;
		
		
		boolean comprouTv32 = trabalhouTerca ^ trabalhouQuinta;
		boolean comprouTv50 = trabalhouTerca && trabalhouQuinta;		
		boolean comprouSorvete = trabalhouTerca || trabalhouQuinta;
		boolean maisSaudavel = !comprouSorvete; // Operador unário
		
		System.out.println("Comprou TV 32? " + comprouTv32);
		System.out.println("Comprou TV 50? "+ comprouTv50);
		System.out.println("Tomou sorvete com a família? " + comprouSorvete);
		System.out.println("Mais saudavel: " + maisSaudavel);
		
		
	}
}
