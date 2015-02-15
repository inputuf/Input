package se.input.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries(
		@NamedQuery(name = Request.GET_ALL_REQUESTS, query = "SELECT r FROM Request r"))

@Entity
@Table(name = "requests")
public class Request implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static final String GET_ALL_REQUESTS = "GET_ALL_REQUESTS";
	
	@Id
	@Column(name = "request_id")
	private int id;
    
	@Column(name ="request_owner")
	private String owner;
	
	@Column(name ="request_message")
	private String message;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}