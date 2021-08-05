package POO.Heranca01;
//Herança 
public class Jogo {

	public static void main(String[] args) {
		
		Heroi Boroca = new Heroi();
		Monstro Ogro = new Monstro();
		
		Boroca.x = 1;
		Boroca.y = 1;
		
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
		Boroca.atacar(Ogro);
		Boroca.atacar(Ogro);
		
		System.out.println("Vida J1: " + Boroca.vida);
		System.out.println("Vida J2: " + Ogro.vida);
	}
}
