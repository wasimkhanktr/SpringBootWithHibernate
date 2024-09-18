package com.techzn.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import hibernateEntities.User;

@SpringBootApplication
public class TechznApplication {

    public static void main(String[] args) {
        SpringApplication.run(TechznApplication.class, args);
        

		// Load configuration and build session factory
        Configuration cfg = new Configuration();
        cfg.configure("config/hibernate.cfg.xml");  // Ensure the path is correct
        
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        try {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter id : ");
        	int id=sc.nextInt();
        	User user=session.get(User.class, id);
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
			
		} catch (Exception e) {
			
		}
    }
}
