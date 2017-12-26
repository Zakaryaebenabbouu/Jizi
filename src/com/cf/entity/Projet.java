package com.cf.entity;

public class Projet {

	
	private int idProjet;
	private String label;
	private String description;
	private String type;
	private String attachement;
	private String image;
	private double budjet;
	private String dateCreation;
	private String region;
	private boolean aprouver;
	public Projet() {
		// TODO Auto-generated constructor stub
	}
	public int getIdProjet() {
		return idProjet;
	}
	public void setIdProjet(int idProjet) {
		this.idProjet = idProjet;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAttachement() {
		return attachement;
	}
	public void setAttachement(String attachement) {
		this.attachement = attachement;
	}
	public double getBudjet() {
		return budjet;
	}
	public void setBudjet(double budjet) {
		this.budjet = budjet;
	}
	public String getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	
	public boolean isAprouver() {
		return aprouver;
	}
	public void setAprouver(boolean aprouver) {
		this.aprouver = aprouver;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Projet [idProjet=" + idProjet + ", label=" + label + ", description=" + description + ", type=" + type
				+ ", attachement=" + attachement + ", image=" + image + ", budjet=" + budjet + ", dateCreation="
				+ dateCreation + ", region=" + region + ", aprouver=" + aprouver + "]";
	}
	

	
	
	
}
