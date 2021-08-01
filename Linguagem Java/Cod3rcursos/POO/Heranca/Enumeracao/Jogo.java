package Heranca.Enumeracao;
//Enumeração

public class Jogo {

	public static void main(String[] args) {
		
		Jogador player1 = new Jogador();
		
		player1.x = 0;
		player1.y = 0;
		
		player1.andar(Direcao.NORTE);
		player1.andar(Direcao.LESTE);
		player1.andar(Direcao.NORTE);
		player1.andar(Direcao.NORTE);
		player1.andar(Direcao.SUL);
		
		System.out.println("Posição y: " + player1.y);
		System.out.println("Posição x: " + player1.x);
	}
}
