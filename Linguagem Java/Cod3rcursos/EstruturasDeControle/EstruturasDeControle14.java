package EstruturasDeControle;
// Estrutura de controle Swith sem break
public class EstruturasDeControle14 {
	
	public static void main(String[] args){
		
		String faixa = "vermelha";
		
		switch (faixa.toLowerCase()){
		
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		
		case "roxa":
			System.out.println("Sei o Heidan Godan");
		
		case "verde":
			System.out.println("Sei o Heidan Yodan");
		
		case "laranja": 
			System.out.println("Sei o Heidan Sandan");
		
		case "vermelha":
			System.out.println("Sei o Heidan Nidan");
		
		case "amarela":
			System.out.println("Sei o Heidan Shodan");
			break;
			
		default:
			System.out.println("Sou faixa branca, não sei nada.");
			
			// É necessário usar o "break;" para não perpetuar as linhas de código posteriores.
		}		
	}
}
