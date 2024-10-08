package com.techzn.main.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
	
	public static SessionFactory getSessionFactory()
	{
		// Load configuration and build session factory
        Configuration cfg = new Configuration();
        cfg.configure("com/techzn/main/resources/hibernate.cfg.xml");  // Ensure the path is correct
        
        return cfg.buildSessionFactory();
	}

}
