package com.cf.action;


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

@ManagedBean(name="listeProjetAction")
public class ListeProjetAction {
	
	@ManagedProperty( value = "#{liste_projets}")
	private List<Projet> liste_projets  =  new ArrayList<Projet>();
	
	@ManagedProperty( value = "#{liste_projets_filtre}")
	private List<Projet> liste_projets_filtre = new ArrayList<Projet>();
	
	@ManagedProperty( value = "#{selected_projets}")
	private List<Projet> liste_projets_select= new ArrayList<Projet>();
	
	/*private String date;
	
	@ManagedProperty( value = "#{types}")
	private String[] types;*/
	
	
	@PostConstruct
	public void init() {
		try {
			FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
			ProjetServices svp = new ProjetServices();
			liste_projets =  svp.get_projet_all();
			System.out.println("action "+liste_projets.size());
			for(int i=0;i<liste_projets.size();i++){
				
				System.out.println("//////////////////////////"+liste_projets.get(i).getIdProjet());
				
			}
			/*types= new String[2];
			types[0] = "materiel";
			types[1] = "consomable";*/
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Projet> getListe_projets() {
		return liste_projets;
	}
	public void setListe_projets(List<Projet> liste_projets) {
		this.liste_projets = liste_projets;
	}
	public List<Projet> getListe_projets_filtre() {
		return liste_projets_filtre;
	}
	public void setListe_projets_filtre(List<Projet> liste_projets_filtre) {
		this.liste_projets_filtre = liste_projets_filtre;
	}
	public List<Projet> getListe_projets_select() {
		return liste_projets_select;
	}
	public void setListe_projets_select(List<Projet> liste_projets_select) {
		this.liste_projets_select = liste_projets_select;
	}
	
	/*public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	public String[] getTypes() {
		return types;
	}
	public void setTypes(String[] types) {
		this.types = types;
	}*/
	
	
	




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
