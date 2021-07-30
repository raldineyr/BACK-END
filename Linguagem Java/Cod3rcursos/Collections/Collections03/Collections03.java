package Collections03;

import java.util.ArrayList;
import java.util.List;

// Lista > Usuario
public class Collections03 {
	public static void main(String[] args) {
		
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Boroca");
		lista.add(u1);
		
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3).nome);
		
		lista.remove(1);
		System.out.println(lista.remove(new Usuario("Manu")));
		System.out.println("Tem o elemento? usuário:" + lista.contains(new Usuario("Lia")));
		System.out.println("Tem o elemento? usáeio: " + lista.contains(u1));
		for(Usuario u: lista){
			System.out.println(u.toString());
		}
	}
}
