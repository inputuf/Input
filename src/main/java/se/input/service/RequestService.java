package se.input.service;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import se.input.model.Request;

public class RequestService extends PersistenceService {

	public void create(Request request) {
		request.setId(1); 
		save(request);
	}
	
	public List<Request> getAllRequests() {
		EntityManager em = createEntityManager();
		TypedQuery<Request> query = em.createNamedQuery(Request.GET_ALL_REQUESTS, Request.class);
		return query.getResultList();
	}
}