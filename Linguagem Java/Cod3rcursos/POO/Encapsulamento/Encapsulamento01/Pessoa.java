package POO.Encapsulamento01;
// Fundamentos getters and setters

public class Pessoa {

	 private int idade;
	 
	 
	 public Pessoa(int idade){
		alterarIdade(0);
	 }
	 
	 public Pessoa(){
		 
	 }
	 
	 
	 // Getter
	 public int lerIdade() {
		 
		 return idade;
	 }
	 
	 // Setter
	 public void alterarIdade(int novaIdade){
		 novaIdade = Math.abs(novaIdade);
		 if (novaIdade >= 0 && novaIdade <= 120) this.idade = novaIdade;
	 }
}
