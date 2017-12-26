package com.cf.services;

import com.cf.services.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.cf.entity.*;

public class Test {

	public static void main(String[] args) throws Exception {
	
		UserServices us = new UserServices();
		User u =new User();
		
		u.setFirstName("karim");
		u.setLastName("mustapha");
		u.setEmail("hichamhaidar96@gmail.com");
		u.setUserName("walid");
		u.setPassword("ahmadi");
		u.setRole("admin");
		u.setImage("img/team/0.jpg");
		
		
		us.addUser(u);
        
	}

}
