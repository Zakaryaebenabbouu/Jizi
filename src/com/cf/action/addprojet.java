package com.cf.action;

import java.io.IOException;
import java.util.GregorianCalendar;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.primefaces.model.UploadedFile;

import com.cf.entity.*;
import com.cf.services.*;

@ManagedBean
public class addprojet {

	@ManagedProperty(value="#{label}")
	private String label;
	@ManagedProperty(value="#{description}")
	private String description;
	@ManagedProperty(value="#{type}")
	private String type;
	@ManagedProperty(value="#{attachement}")
	private UploadedFile attachement;
	@ManagedProperty(value="#{budjet}")
	private double budjet;
	@ManagedProperty(value="#{dateCreation}")
	private String dateCreation;
	@ManagedProperty(value="#{aprouver}")
	private String aprouver;
	
	public addprojet() {
		// TODO Auto-generated constructor stub
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

	public UploadedFile getAttachement() {
		return attachement;
	}

	public void setAttachement(UploadedFile attachement) {
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

	public String getAprouver() {
		return aprouver;
	}

	public void setAprouver(String aprouver) {
		this.aprouver = aprouver;
	}
	
	public void upload() {
        if(attachement != null) {
            FacesMessage message = new FacesMessage("Succesful", attachement.getFileName() + " is uploaded.");
            FacesContext.getCurrentInstance().addMessage(null, message);
            System.out.println(attachement.getFileName());
            System.out.println("ma Tnaketch");
        }
        else{
        	System.out.println("Tnaket");
        }
    }
	
	public void save() throws IOException{
		// upload();
		GregorianCalendar gc = new GregorianCalendar();
		int day = gc.get(GregorianCalendar.DAY_OF_MONTH);
		int month = gc.get(GregorianCalendar.MONTH) + 1;
		int year = gc.get(GregorianCalendar.YEAR);
		String d = day+"/"+month+"/"+year;
		System.out.println(d);
		
		ProjetServices ps = new ProjetServices();
		Projet p = new Projet();
		
		p.setLabel(getLabel());
		p.setDescription(getDescription());
		p.setType(getType());
		p.setAttachement("C:/Users/windownet/Downloads/Document/sannonce ABD.pdf");
		p.setBudjet(getBudjet());
		p.setDateCreation(d);
		p.setAprouver(false);
		
		ps.addProjet(p);
	
		FacesContext.getCurrentInstance().getExternalContext().redirect("visitor.xhtml");
		
	}
	
	

}
