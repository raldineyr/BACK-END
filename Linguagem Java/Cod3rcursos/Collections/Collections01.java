package Collections;
// Fundamentos collections: set
import java.util.HashSet;
import java.util.Set;
// 
public class Collections01 {
	
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		// Adicionando dados ao conjunto set
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		conjunto.add("teste");
		
		System.out.println("Tamanho é: " + conjunto.size());
		
		conjunto.add("Boroca"); // Este é o sétimo conjunto adicionado
		
		System.out.println("Tamanho é: " + conjunto.size());
		
		System.out.println(conjunto.remove(1.2)); // Removendo dados do conjunto set: "true", pois é existente.
		System.out.println(conjunto.remove("teste")); // Removendo dados do conjunto set: "true", pois é existente.
		System.out.println(conjunto.remove("Mel Ribeiro")); // Removendo dados do conjunto set: "false", pois não é existente.
		
		System.out.println("Tamanho é: "+conjunto.size());
		
		// Método contains informa se há ou não valor informado contido no conjunto.
		
		System.out.println(conjunto.contains("Boroca"));
		System.out.println(conjunto.contains(true));
		System.out.println(conjunto.contains(10000000));
		
		Set nums = new HashSet(); // É possivel definir uma variável do tipo set e atribuir um objeto do tipo hashSet.
	
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
	
		conjunto.addAll(nums);// União entre dois conjuntos
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto); // Limpar todos os dados do conjunto
		
	}
}
