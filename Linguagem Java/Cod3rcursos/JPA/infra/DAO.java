package JPA.infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO<E> {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<E> classe;

	static {
		try {
			emf = Persistence.createEntityManagerFactory("coder-cursos-jpa");
		} catch (Exception e) {

		}
	}
	
	public DAO() {
    		this(null);
 	}

	public DAO(Class<E> classe) {

		this.classe = classe;
		em = emf.createEntityManager();
	}

	public DAO<E> abrirTransacao() {

		em.getTransaction().begin();
		return this;
	}
	
	public DAO<E> fechar(){
		em.close();
		
		return this;
	}

	public DAO<E> fecharTransacao() {

		em.getTransaction().commit();
		return this;
	}

	public DAO<E> incluir(E entidade) {

		em.persist(entidade);
		return this;
	}

	public DAO<E> forcarInclusao(E entidade) {

		return this.abrirTransacao().incluir(entidade).fecharTransacao();

	}

	public E obterPorID(Object id) {
		return em.find(classe, id);
	}

	public List<E> obterTodos() {

		return this.obterTodos(5, 0);
	}

	public List<E> obterTodos(int quantidade, int deslocamento) {

		if (classe == null) {
			throw new UnsupportedOperationException("Classe nula.");
		}

		String jpql = "SELECT e FROM " + classe.getName() + " e";

		TypedQuery<E> query = em.createQuery(jpql, classe);

		query.setMaxResults(quantidade);

		query.setFirstResult(deslocamento);

		return query.getResultList();
	}

}
