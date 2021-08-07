package POO.Heranca04;
//Relação herança e construtor

public class Jogo {

	public static void main(String[] args) {
		
		Heroi Boroca = new Heroi(1, 1);
		Monstro Ogro = new Monstro();
		
		Ogro.x = 1;
		Ogro.y = 2;
			
		System.out.println("Posição y: " + Boroca.vida);
		System.out.println("Posição x: " + Boroca.vida);
		
		Ogro.atacar(Boroca);
		Boroca.atacar(Ogro);
		
		Boroca.atacar(Ogro);
		Boroca.atacar(Ogro);
		
		Ogro.atacar(Boroca);
		Boroca.atacar(Ogro);
		
		Ogro.atacar(Boroca);
		Boroca.atacar(Ogro);
		
		System.out.println("Vida herói: " + Boroca.vida);
		System.out.println("Vida monstro: " + Ogro.vida);
	}
}
