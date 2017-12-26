package com.cf.action;

import java.util.Iterator;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.bean.ManagedBean;
import com.cf.entity.*;
import com.cf.services.*;
@ManagedBean
public class authentification {

	
	
	private String text1;  
    private String text2;
    String login;
    String password;
    String role;
    String result;
    public String getText1() {
        return text1;
    }
 
    public void setText1(String text1) {
        this.text1 = text1;
    }
 
    public String getText2() {
        return text2;
    }
 
    public void setText2(String text2) {
        this.text2 = text2;
    }
     
    public String save() {
       // FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Data Saved"));
       
        UserServices su =new UserServices(); 
        Iterator<User> util = su.get_authentification().iterator();
        while (util.hasNext()) {
        	User uti = util.next();
			login=uti.getUserName();
			password=uti.getPassword();
			role=uti.getRole();
			System.out.println(login);
			System.out.println(password);
			System.out.println(getText1());
			System.out.println(getText2());
			
			if(getText1().equals(login) && getText2().equals(password) && role.equals("visitor")){
	        	
	        	System.out.println("pass");
	        	System.out.println("id : "+uti.getIdUser());
	        	result="visitor";
	    		break;

	        }
	        else{
	        	
	        	System.out.println("noo");
	        	result="index";
	        	

	        }
		}
        
        return result;
        
    }
    
    public String outcome(){
		return "/WEB-INF/Admin/Inscription.xhtml";
	}
}
