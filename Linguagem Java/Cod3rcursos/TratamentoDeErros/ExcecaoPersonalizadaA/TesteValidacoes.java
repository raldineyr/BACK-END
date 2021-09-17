package TratamentoDeErros.ExcecaoPersonalizadaA;

public class TesteValidacoes {
	public static void main (String[] args){
		
		try {
			Aluno aluno = new Aluno("adfga", 113);
			
			Validar.aluno(aluno);
			Validar.aluno(null);
			
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("FIM!");
		
	}

}
