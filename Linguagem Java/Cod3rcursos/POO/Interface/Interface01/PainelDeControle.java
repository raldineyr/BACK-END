package POO.Interface.Interface01;

	public class PainelDeControle {

		public static void main(String[] args) {
			
		Tesla Roadster = new Tesla();
			
		Roadster.acelerador(); 
		System.out.println(Roadster);
		
		Roadster.ligarTurbo();
		Roadster.acelerador();
		System.out.println(Roadster);

	}
}
