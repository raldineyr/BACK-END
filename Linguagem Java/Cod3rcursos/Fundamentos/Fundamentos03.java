package Fundamentos;

public class Fundamento03{
	public static void main(String[] args){
		// (°F - 32) x 5/9 = °C
		double fahrenheit,celsius;
		
		fahrenheit = 212.0;
		celsius = (fahrenheit - 32)*5/9;
		
		System.out.println("Celsius: " + celsius + "°C");
		
		// Utilizando demais variáveis
		
		final double ajuste = 32;
		final double fator = 5/9.0;
		System.out.println("Celsisus: " + (fahrenheit - ajuste) * fator + "°C");
		
	}
}
