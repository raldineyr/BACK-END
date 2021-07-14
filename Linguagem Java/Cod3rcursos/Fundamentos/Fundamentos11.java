package Fundamentos;
// Wrappers
public class Fundamento11 {
	public static void main(String[] args) {
		
		/* Para cada tipo primitivo temos um wrapper, porém,
		   uma função ponto não pode ser associada diretamente a um tipo primitivo
		*/
		
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		Float f = 3.14159F;
		Double d = 6.02214076;
		Long l = 100000L;
		Character c = 'X';
		
		// "Pegando" o valor primitivo de dentro das classes
		
		System.out.println(b.byteValue());
		System.out.println(s.shortValue());
		System.out.println(i.intValue());
		System.out.println(f.floatValue());
		System.out.println(d.doubleValue());
		System.out.println(l.floatValue());
		System.out.println(c.charValue());
		
		// Operações 
		
		System.out.println("\n" + i * 3);
		System.out.println(l * 3);
		System.out.println(d / f);
		
	/*   
	  - Conversão direta na variável usando o metódo parse.
	 
		Byte b = Byte.parseByte("100");
		Short s = Short.parseShort("1000");
		Integer i = Integer.parseInt("10000");
		Long l = Long.parseLong("100000L");
		
	  - Receber informação direta pelo terminal
		
		Scanner entrada = new Scanner(System.in);
		Integer i = Integer.parseInt(entrada.nextLine);    
	*/
		
	}

}
