package ClassesEmetodos13;
//Desafio do módulo

public class Pessoa {

	String nome;
	float peso;
	
	Pessoa(String nome, float peso){
		this.nome = nome;
		this.peso = peso;
	}

	 void comer(Comida comida){
	
		 if (comida != null) {
			 this.peso += comida.peso;
		 }
	}
	 
	 String apresentar(){
		 
		 return nome + " esta com " + peso + " Kg."; 
	 }
}
