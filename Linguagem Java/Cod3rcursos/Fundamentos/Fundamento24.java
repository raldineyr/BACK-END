package Fundamentos;
// Igualdade com strings

import java.util.Scanner;

public class Fundamento24 {
	public static void main(String[] args){
		
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s));
		
		Scanner entrada = new Scanner(System.in);
		String s2 = entrada.next();
		
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim()));
    
		// Utilizar o equals para comparar strings
    
		entrada.close();
	}
}
