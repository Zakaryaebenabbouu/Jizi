package com.cf.action;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import com.cf.services.*;
import com.cf.entity.*;
@ManagedBean
public class inscription {

	@ManagedProperty(value="#{firstName}")
	private String firstName;
	@ManagedProperty(value="#{lastName}")
	private String lastName;
	private String email;
	private String userName;
	private String password;
	
	public inscription() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String save(){
		System.out.println("début");
	
		UserServices us = new UserServices();
		User u = new User();
		
		/*u.setFirstName(getFirstName());
		u.setLastName(getLastName());
		u.setEmail(getEmail());
		u.setUserName(getUserName());
		u.setPassword(getPassword());
		u.setRole("visitor");*/
		u.setFirstName("karim");
		u.setLastName("mustapha");
		u.setEmail("hichamhaidar96@gmail.com");
		u.setUserName("walid");
		u.setPassword("ahmadi");
		u.setRole("visitor");
		
		us.addUser(u);
		
		
		return "index";
	}

	
	
}
