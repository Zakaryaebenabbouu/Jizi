package com.cf.entity;

public class Investissement {
	
	private InvestissementMapping id;
	private double don;
	private String dateCreation;

	public Investissement() {
		// TODO Auto-generated constructor stub
	}

	public InvestissementMapping getId() {
		return id;
	}

	public void setId(InvestissementMapping id) {
		this.id = id;
	}

	public double getDon() {
		return don;
	}

	public void setDon(double don) {
		this.don = don;
	}

	public String getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}

	
}
