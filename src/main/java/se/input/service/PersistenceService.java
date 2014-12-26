package se.input.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class PersistenceService {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("InputPU");
	
	protected EntityManager createEntityManager() {
		return emf.createEntityManager();
	}
	
	protected void save(Object entity) {
		EntityManager em = createEntityManager();
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
	}
}
