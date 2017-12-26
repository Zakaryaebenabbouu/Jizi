package com.cf.entity;

import java.io.Serializable;

public class InvestissementMapping implements Serializable {

	private static final long serialVersionUID = -4466109438914540231L;
	private User user;
	private Projet projet;
	
	public InvestissementMapping() {
		// TODO Auto-generated constructor stub
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}
	
	
	

}
