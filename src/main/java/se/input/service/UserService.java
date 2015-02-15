package se.input.service;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import se.input.model.Role;
import se.input.model.User;

public class UserService extends PersistenceService {

	public void register(User user) {
		Role role = new Role(Role.ROLE.user, user);
		user.setRole(role);
		save(user);
	}

	public List<User> getAllUsers() {
		EntityManager em = createEntityManager();
		TypedQuery<User> query = em.createNamedQuery(User.GET_ALL_USERS, User.class);
		return query.getResultList();
	}
}