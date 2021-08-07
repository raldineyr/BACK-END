package POO.Heranca04;
//Relação herança e construtor

public class Monstro extends Jogador {
	
	// Construtor default interagindo com a Super classe	
	Monstro(){
		super();
	}
	
	// Construtor interagindo com o objeto
	Monstro(int x, int y){
		this.x = 0;
		this.y = 0;
	}
}
