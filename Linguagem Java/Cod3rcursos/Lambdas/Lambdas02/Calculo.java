package Lambdas.lambdas02;
//Fundamentos de função Lambda.

/*Existe a possibilidade de ter mais de um método em uma inter-
face funcional, porém precisamos ter apenas um único método 
abstrato (default) ou podemos ter um método estático (static)*/

@FunctionalInterface
public interface Calculo {
	
	public double executar (double a, double b);
	// double teste(); // Gera erros nas funções funcionais.

	default String abstratoSegundoMetodo() { // único método abstrato
		return "Retornando o segundo método: abstrato.";
	
	}
	
	static String estaticoTerceiroMetodo() {
		return "Retornando o terceiro método: estático";
	}
}
