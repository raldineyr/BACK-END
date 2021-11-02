package JPA.controle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.raldineyr.JPA.modelo.Usuario;

public class AlterarUsuario1 {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("coder-cursos-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 7L);
		usuario.setNome("Juci Jacaroa");
		usuario.setEmail("Juci-Jaca@gmail.com");
		
		em.merge(usuario); // Método responsável pelo UPDATE
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		System.out.println("\t\t BD ATIVADO!");
	}

}
