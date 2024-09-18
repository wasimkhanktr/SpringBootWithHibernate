package com.techzn.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.techzn.main.repository.DbOpretions;

import hibernateEntities.User;

@SpringBootApplication
public class TechznApplication {

    public static void main(String[] args) {
        
    	ApplicationContext context = SpringApplication.run(TechznApplication.class, args);
        
    	DbOpretions dbOpretions = context.getBean(DbOpretions.class);
    	
    	User user = dbOpretions.getUserDetails(1);
    	
    	if (user != null) {
            System.out.println("ID: " + user.getId());
            System.out.println("Name: " + user.getName());
            System.out.println("Email: " + user.getEmail());
            System.out.println("Password: " + user.getPassword());
            System.out.println("City: " + user.getCity());
    	}
    	else
    	{
    		System.out.println("User Not Found !");
    	}
    }
}
