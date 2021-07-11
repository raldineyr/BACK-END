package Fundamentos;
public class Fundamento02 {
	public static void main(String[] args){
		
	double raio = 2.00;
	final double pi = 3.14159;
	// pi = 3.14; A palavra final impossibilita a variação dos dados na variavel pi.
	System.out.printf("O valor da area é: %.4f\n",raio*raio*pi);
	double area = pi * raio * raio;
	System.out.println("A área é: " + area+" m2.");
		
	}

}
