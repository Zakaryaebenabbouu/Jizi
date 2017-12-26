package com.cf.entity;

import java.util.HashSet;
import java.util.Set;


public class User {
	
	private int idUser;
	private String firstName;
	private String lastName;
	private String email;
	private String userName;
	private String password;
	private String image;
	private String role;
	private Set<Investissement> payment = new HashSet<Investissement>();
	private Set<Projet> projets = new HashSet<Projet>();
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Set<Investissement> getPayment() {
		return payment;
	}
	public void setPayment(Set<Investissement> payment) {
		this.payment = payment;
	}
	public Set<Projet> getProjets() {
		return projets;
	}
	public void setProjets(Set<Projet> projets) {
		this.projets = projets;
	}
	
	
	
	
	

}
