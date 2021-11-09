package JPA.controle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import JPA.modelo.Usuario;

public class ObterUsuario {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("coder-cursos-jpa");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = em.find(Usuario.class,4L);
		System.out.println(usuario.getNome());
		
		em.close();
		emf.close();
	}

}
