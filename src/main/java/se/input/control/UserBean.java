package se.input.control;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import se.input.model.User;
import se.input.service.UserService;


@ManagedBean
@SessionScoped
public class UserBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private User user = new User();
	private List<User> allUsers;
	
	private UserService userService = new UserService();
	
	public void register() {
		userService.register(user);
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public List<User> getAllUsers() {
		return allUsers;
	}

	public void setAllUsers(List<User> allUsers) {
		this.allUsers = allUsers;
	}

	public void findAllUsers() {
		allUsers = userService.getAllUsers();
	}
}