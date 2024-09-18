package com.techzn.main.repository;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.techzn.main.config.HibernateConfig;

import hibernateEntities.User;

@Repository
public class DbOperationsImpl implements DbOpretions{
	@Override
	public User getUserDetails(int id)
	{
		User user=null;
        try(
        		Session session = HibernateConfig.getSessionFactory().openSession();
        	)
        {
        
            	user=session.get(User.class, id);
		} 
        catch (Exception e) {
			// TODO: handle exception
		}
		
		return user;
	}

}
