package com.subha.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.subha.dto.UserDetails;

public class HibernateTest {
	
	public static void main(String[] args) {
		UserDetails user = new UserDetails();
			user.setUserId(2);
			user.setUserName("Rai");
			
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
			
	}
}
