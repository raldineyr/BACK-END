package Heranca.Enumeracao;
//Enumeração

public class Jogador {

	int x;
	int y;
	
	boolean andar(Direcao direcao){
		
		switch (direcao) {
		
		case NORTE:
			y++;
			break;
			
		case LESTE:
			x++;
			break;
			
		case SUL:
			y--;
			break;
		
		case OESTE:
			x --;
			break;
		}
		
		return true;
	}	
}
