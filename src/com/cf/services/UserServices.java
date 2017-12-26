package com.cf.services;

import java.util.List;

import org.hibernate.Session;

import com.cf.config.HibernateUtil;
import com.cf.entity.*;


public class UserServices {

	
	public void addUser(User s){	
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		if(session.getTransaction().isActive())
		{
			
		}
		else{
			session.beginTransaction();
			}
		session.save(s);
		session.getTransaction().commit();		
	}
	
	public List<User> get_authentification(){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		if(session.getTransaction().isActive()){}else{session.beginTransaction();}
		/*Iterator<utilisateur> crunchifyIterator = results.iterator();
		while (crunchifyIterator.hasNext()) {
			System.out.println(crunchifyIterator.next());
		}*/
		return session.createQuery("FROM User").list();
		
	}
	
	public List<User> get_user_all(){
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		if(session.getTransaction().isActive()){}else{session.beginTransaction();}
		/*Iterator<utilisateur> crunchifyIterator = results.iterator();
		while (crunchifyIterator.hasNext()) {
			System.out.println(crunchifyIterator.next());
		}*/
		
		/*String sql = "SELECT id_projet, label_projet, description_projet, pdf_projet, image_projet FROM Projet";
         SQLQuery query = session.createSQLQuery(sql);session.createQuery("FROM Projet").list();
         query.list();*/
	 return session.createQuery("FROM User").list();
		
	}
	
	
	public User get_user(int idu){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		if(session.getTransaction().isActive()){}else{session.beginTransaction();}
		User u = session.load(User.class, idu);
		return u;
		
	}
	
	public void update_user(User u){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		if(session.getTransaction().isActive()){}else{session.beginTransaction();}
		u.setEmail(u.getEmail());
		u.setFirstName(u.getFirstName());
		u.setIdUser(u.getIdUser());
		u.setLastName(u.getLastName());
		u.setPassword(u.getPassword());
		u.setPayment(u.getPayment());
		u.setRole(u.getRole());
		u.setUserName(u.getUserName());
		
		
	}
	
	public void delete_user(User u){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.delete(u);
		session.getTransaction().commit();
	}

}
