package POO15;

public class Principal {
	public static void main(String[] args){
		
		Arara arara = new Arara();
		Canguru canguru = new Canguru();
		Cobra cobra = new Cobra();
		Tartaruga tartaruga = new Tartaruga();
		
		arara.alimentar();
		arara.locomover();
		arara.emitirSom();
		
		canguru.alimentar();
		canguru.locomover();
		canguru.emitirSom();
		
		cobra.alimentar();
		cobra.locomover();
		cobra.emitirSom();
		
		tartaruga.alimentar();
		tartaruga.locomover();
		
	}

}
