package com.cf.config;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

public static final SessionFactory sessionFactory;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
          
            sessionFactory = new Configuration().configure("com/cf/config/hibernate.cfg.xml").buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Exception stack Trace ************** begin");
            System.err.println("Hibernate : Initial SessionFactory creation failed." + ex);
            ex.printStackTrace();
            System.err.println("Exception Stack Trace ********* END");
            throw new ExceptionInInitializerError(ex);
          
            
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
	
}
