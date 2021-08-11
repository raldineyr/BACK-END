package POO.Polimorfismo.Polimorfismo01;
//Fundamentos polimorfismo
public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa (99.65F);
		
		Arroz porcao1 = new Arroz(0.2F);
		Feijao porcao2 = new Feijao(0.1F);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(porcao1);
		convidado.comer(porcao2);
		
		System.out.println(convidado.getPeso());
		
		Sorvete sobremesa = new Sorvete(0.4F);
		
		convidado.comer(sobremesa);
		System.out.println(convidado.getPeso());
	}
}
