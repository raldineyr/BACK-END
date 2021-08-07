package POO.Heranca04;
// Relação entre herança e construtores

public class Heroi extends Jogador {
	
	// Construtor default interagindo com a Super classe	
	
	Heroi(int x, int y){
		super(x, y);	
	}

	boolean atacar (Jogador oponente){
		
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		return ataque1 || ataque2;
	}
	
}

