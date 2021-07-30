package Collections;

import java.util.TreeSet;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

// Fundamentos conjuntos: set

public class Collections02 {
	public static void main(String[] args) {
		
	// Set<String> listaAprovados = new HashSet<>();
	SortedSet<String> listaAprovados = new TreeSet<>();
	
	// O SortedSet tem critérios de ordenação.
	// TreeSet faz parte do SortedSet e estabelece ordem alfbabética
	
	listaAprovados.add("Radiney R.");
	listaAprovados.add("Boroca P.");
	listaAprovados.add("Mel R.");
	listaAprovados.add("Juliio César");
	
	for (String candidato: listaAprovados){
		System.out.println(candidato);
		
		Set<Integer> nums = new HashSet<>();

		nums.add(1);
		nums.add(2);
		nums.add(128);
		nums.add(6);
		
		for(int n: nums){
			System.out.println(n);
			}
		}
	}
}
