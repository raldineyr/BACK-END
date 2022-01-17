package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Usuario usuario = em.find(Usuario.class, 4L);
		
		usuario.setNome("Gabi");
		usuario.setEmail("mgabi@gmail.com");
		
		em.merge(usuario);
		
		System.out.println(usuario.getNome());
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}
