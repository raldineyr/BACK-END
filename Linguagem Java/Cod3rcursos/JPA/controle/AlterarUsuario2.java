package JPA.controle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.raldineyr.JPA.modelo.Usuario;

public class AlterarUsuario2 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("coder-cursos-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Usuario usuario = em.find(Usuario.class, 10L);
		usuario.setNome("Alterar nome do usuario");

		 /*
		  em.merge(usuario); Mesmo sem o método merge() a alteração será realizada
		  devido a entidade estar em um estado gerenciado.
		 */
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
