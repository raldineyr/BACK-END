package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
// Collections Map
public class Collections06 {
	public static void main(String[] args){
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberto");
		usuarios.put(1, "Ricardo"); // Adicionou e alterou devido o ID: 1
		usuarios.put(2, "Rafaela");
		usuarios.put(3, "Rebeca");
		usuarios.put(4, "Boroca");
		
		System.out.println(usuarios.size()); // Tamanho
		System.out.println(usuarios.isEmpty()); // Verifica se está vazio
		System.out.println(usuarios.keySet()); // chave
		System.out.println(usuarios.values()); // valor
		System.out.println(usuarios.entrySet()); // Chave e valor
		System.out.println(usuarios.containsKey(20)); // Verifica se há a chave informada
		System.out.println(usuarios.containsKey(2)); // Verifica se há a chave informada
		System.out.println(usuarios.containsValue("Boroca")); // Verifica se há o valor informada
		System.out.println(usuarios.containsValue("Raldiney")); // Verifica se há o valor informada
		System.out.println(usuarios.get(1));
		System.out.println("Status da remoção: " + usuarios.remove(4, "Gui")); // Não
		
		for (int chave: usuarios.keySet()){
			System.out.println(chave);
		}
		
		for (String valor: usuarios.values()){
			System.out.println(valor);
		}
		
		for (Entry <Integer, String> registro: usuarios.entrySet()){ // java.util.Map.Entry
			System.out.println(registro.getKey());
			System.out.println(registro.getValue());
		}
	}	
}
