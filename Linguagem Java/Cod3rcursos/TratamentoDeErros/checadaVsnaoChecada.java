package TratamentoDeErros.TratamentoDeExcessao02;

public class checadaVsnaoChecada {
	
	public static void main (String[] args) {
		
	try {
		geraErro1();
	} catch (RuntimeException e) {
		System.out.println(e.getMessage());
	}
	
	
	try {
		geraErro2();
	} catch (Throwable e) {
		System.out.println(e.getMessage());
	}
	
	
	System.out.println("FIM");
	
	}
	
// Não basta criar um erro, tem que lançar o erro com o throw	

	// Não checada ou não verificada	
	static void geraErro1(){
	throw new RuntimeException("Ocorreu um erro #1");
		
	}
	
	// Exeção checada ou verificada
	static void geraErro2() throws Exception{
		throw new Exception("Ocorreu um erro #2");
		
	}
}
