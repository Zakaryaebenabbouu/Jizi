package com.cf.services;

import java.util.List;

import org.hibernate.Session;

import com.cf.config.HibernateUtil;
import com.cf.entity.*;


public class ProjetServices {

	public ProjetServices() {
		// TODO Auto-generated constructor stub
	}
	
	public void addProjet(Projet p){	
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		if(session.getTransaction().isActive()){}else{session.beginTransaction();}
		session.save(p);
		session.getTransaction().commit();		
	}
	
	public List<Projet> get_projet_all(){
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		if(session.getTransaction().isActive()){}else{session.beginTransaction();}
		/*Iterator<utilisateur> crunchifyIterator = results.iterator();
		while (crunchifyIterator.hasNext()) {
			System.out.println(crunchifyIterator.next());
		}*/
		
		/*String sql = "SELECT id_projet, label_projet, description_projet, pdf_projet, image_projet FROM Projet";
         SQLQuery query = session.createSQLQuery(sql);session.createQuery("FROM Projet").list();
         query.list();*/
	 return session.createQuery("FROM Projet").list();
		
	}
	
	public Projet get_produit(int idp){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		if(session.getTransaction().isActive()){}else{session.beginTransaction();}
		Projet p = session.load(Projet.class, idp);
		return p;
		
	}
	
	public void update_projet_p(Projet projet){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		if(session.getTransaction().isActive()){}else{session.beginTransaction();}
		projet.setIdProjet(projet.getIdProjet());
		projet.setLabel(projet.getLabel());
		projet.setType(projet.getType());
		projet.setDescription(projet.getDescription());
		projet.setDateCreation(projet.getDateCreation());
		projet.setAprouver(projet.isAprouver());
		projet.setBudjet(projet.getBudjet());
		projet.setAttachement(projet.getAttachement());
		projet.setRegion(projet.getRegion());
		projet.setImage(projet.getImage());
		
		session.update(projet);
		session.getTransaction().commit();
	}
	
	
	
	public void delete_projet(Projet p){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.delete(p);
		session.getTransaction().commit();
	}
	

}
