package POO.Heranca02;
//Herança notação .super

public class Heroi extends Jogador {

boolean atacar (Jogador oponente){
		
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		return ataque1 || ataque2;
	}
	
}
