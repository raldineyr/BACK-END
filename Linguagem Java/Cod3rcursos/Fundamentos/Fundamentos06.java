package Fundamentos;
public class Fundamento06 {
	public static void main(String[] args){
		
		String s = "Bom dia x";
		s = s.replace("x","senhor"); // .replace(); É uma função de substituição.
		s = s.toUpperCase(); // toUpperCase(); Modifica os caracteres para a forma maiúscula.
		s = s.concat("!!!"); // Adiciona o dado informado na variavel
		System.out.println(s);
		
		// As funções a partir do ponto também podem ser utilizadas diretamente nas impressões: syso
		System.out.println("raldiney r".toUpperCase());
		
		// Pode-se também armazenar o dado em uma variável 
		String x = "marlene r".toUpperCase();
		System.out.println(x);
		// Esta modificação acima também pode ser utilizada em funções .replace() e muito mais!!!
		String y = "Boa noite y".replace("y","Princesa").toUpperCase().concat("!!!");
		System.out.println(y);
		
		// Tipos primitivos não tem o operador ponto ".".
		
	}
}
