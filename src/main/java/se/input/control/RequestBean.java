package se.input.control;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import se.input.model.Request;
import se.input.service.RequestService;


@ManagedBean
@SessionScoped
public class RequestBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Request request = new Request();
	private List<Request> allRequests;
	
	private RequestService requestService = new RequestService();
	
	public void create() {
		requestService.create(request);
	} 
	
	public Request getRequest() {
		return request;
	}
	
	public void setRequest(Request request) {
		this.request = request;
	}
	
	public List<Request> getAllRequests() {
		return allRequests;
	}
	
	public void setAllRequest(List<Request> allRequests) {
		this.allRequests = allRequests;
	}

	public void findAllRequests() {
		allRequests = requestService.getAllRequests();
	}
}