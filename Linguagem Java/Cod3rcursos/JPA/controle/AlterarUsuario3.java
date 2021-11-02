package JPA.controle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.raldineyr.JPA.modelo.Usuario;

public class AlterarUsuario3 {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("coder-cursos-jpa");	
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 3L);
		em.detach(usuario); // Desassociando, porém se utilizar o merge após, a alteração é efetuada.

		usuario.setNome("Juci Jacaroa2");
		em.getTransaction().commit();
		
		
		em.close();
		emf.close();
	}

}
