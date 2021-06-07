package ClasseMath;

public class Matematica {

	public static void main (String[] args){
		
		int x = 3, y = 4;
		double z = 81.56;
		
		System.out.println("Pi vale: "+ Math.PI);
		System.out.println("O valor absoluto de x é: " + Math.abs(x));
		System.out.println("O maior valor entre x e y é: " + Math.max(x, y));
		System.out.println("O menor valor entre x e y é: " + Math.min(x,y));
		System.out.println("A raiz quadrada de z è: " + Math.sqrt(z));
		System.out.println("Z arredondado para cima é: " + Math.ceil(z));
		System.out.println("Número aleatório gerado: " + Math.random());
		System.out.println("A hypotenusa de x e y é: "+ Math.hypot(x, y));
		System.out.println("O seno de 90° é: " + Math.sin(Math.PI/2));
		
	}
	
}
