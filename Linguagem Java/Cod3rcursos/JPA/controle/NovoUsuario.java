package JPA.controle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.raldineyr.JPA.modelo.Usuario;

public class NovoUsuario {
	
	public static void main(String[] args) {
 
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("coder-cursos-jpa");
		EntityManager em = emf.createEntityManager();		
		
		Usuario novoUsuario = new Usuario("Jose vaqueiro", "ZeBoiada@gmail.com");
		
		em.getTransaction().begin();
		em.persist(novoUsuario);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		System.out.println("\t\tBD Ativado!");
		
	}

}
