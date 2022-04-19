package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarios {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("curso_java");
		EntityManager em = emf.createEntityManager();

		String jpql = "select u from Usuario u";
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		query.setMaxResults(5);

		List<Usuario> usduarios = query.getResultList();

		for (Usuario usuario : usduarios) {
			System.out.println("ID " + usuario.getId() + " E-mail: " + usuario.getEmail());
		}
		
		em.close();
		em.close();
	}

}
