package se.input.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_roles")
public class Role implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static enum ROLE {
        admin, user
    }
	    
    @Id
    @Column(name = "role_name")
    @Enumerated(EnumType.STRING)
    private ROLE role;
    
    @Id
    @OneToOne
    @JoinColumn(name = "user_name")
    private User user;

    protected Role() {
    }

    public Role(ROLE role, User user) {
        this.role = role;
        this.user = user;
    }
}
