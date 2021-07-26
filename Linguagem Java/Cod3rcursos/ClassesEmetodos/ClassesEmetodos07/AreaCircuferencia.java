package ClassesEmetodos07;
// Membros de instância e membros de classe.

public class AreaCircuferencia {

	// Atributos
	double raio;
	static double PI = 3.14159;
	
	// Métodos construtores 
	
	public AreaCircuferencia(double raioInicial) {
		raio = raioInicial;		
	}
	
	// Métodos especiais 
	
	double area(){
		
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double raio){
		
		return PI * Math.pow(raio,2);
	}
}
