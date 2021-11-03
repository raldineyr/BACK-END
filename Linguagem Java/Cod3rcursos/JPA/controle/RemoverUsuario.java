package JPA.controle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.raldineyr.JPA.modelo.Usuario;

public class RemoverUsuario {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("coder-cursos-jpa");
		EntityManager em = emf.createEntityManager();
				
		Usuario usuario = em.find(Usuario.class,7L);
				
		if(usuario != null ) {
			em.getTransaction().begin();;
			em.remove(usuario);
			em.getTransaction().commit();
		}
		
		em.close();
		emf.close();
	}
}
