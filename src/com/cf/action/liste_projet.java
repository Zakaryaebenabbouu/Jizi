package com.cf.action;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;


import org.primefaces.event.RowEditEvent;

import com.cf.entity.*;
import com.cf.services.*;

@ManagedBean
public class liste_projet implements Serializable{
	@ManagedProperty(value="#{projets}")
	private List<Projet> projets;
	
	@ManagedProperty(value="#{filteredprojets}")
	private List<Projet> filteredprojets;
	
	@ManagedProperty(value="#{selectedprojet}")
    private Projet selectedprojet;
	
	/*@ManagedProperty( value = "#{types}")
	private String[] types;*/
	
	@PostConstruct
    public void init() {
		 ProjetServices sp = new ProjetServices();
		projets =  new ArrayList<Projet>();
		filteredprojets = new ArrayList<Projet>();
		projets = sp.get_projet_all();
		
		/*types= new String[2];
		types[0] = "materiel";
		types[1] = "consomable";*/
    }
	
	
	/*public String[] getTypes() {
		return types;
	}
	public void setTypes(String[] types) {
		this.types = types;
	}*/
	public List<Projet> getProjets() {
		return projets;
	}
	public void setProjets(List<Projet> projets) {
		this.projets = projets;
	}
	public List<Projet> getFilteredprojets() {
		return filteredprojets;
	}
	public void setFilteredprojets(List<Projet> filteredprojets) {
		this.filteredprojets = filteredprojets;
	}
	public Projet getSelectedprojet() {
		return selectedprojet;
	}
	public void setSelectedprojet(Projet selectedprojet) {
		this.selectedprojet = selectedprojet;
	}
	
	
	
	public void deleteprojet() throws IOException{
		//produits.remove(selectedproduit);
		ProjetServices svp = new ProjetServices();
		svp.delete_projet(selectedprojet);
		FacesContext.getCurrentInstance().getExternalContext().redirect("visitor.xhtml");
	}
	
	
	
	
	
public void onRowEdit(RowEditEvent event) {
        
		
		try {
			Projet p = new Projet();
			
			p.setAprouver(((Projet) event.getObject()).isAprouver());
			p.setAttachement(((Projet) event.getObject()).getAttachement());
			p.setBudjet(((Projet) event.getObject()).getBudjet());
			p.setDateCreation(((Projet) event.getObject()).getDateCreation());
			p.setDescription(((Projet) event.getObject()).getDescription());
			p.setIdProjet(((Projet) event.getObject()).getIdProjet());
			p.setLabel(((Projet) event.getObject()).getLabel());
			p.setType(((Projet) event.getObject()).getType());
			
			
			ProjetServices svpp = new ProjetServices();
			svpp.update_projet_p(p);
			
			FacesMessage msg = new FacesMessage("Le projet à été modifié" + p.getLabel());
	        FacesContext.getCurrentInstance().addMessage(null, msg);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }
     
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("La modification à été annulé");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

}
