package se.input.control;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ExempelBean implements Serializable {
	
	private int counter = 0;
	
	private static final long serialVersionUID = 1L;

	public void increaseCounter() {
		counter++;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	
}
