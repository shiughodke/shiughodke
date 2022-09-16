package com.HbOnetoManyUni.config;

import org.hibernate.cfg.Configuration;
import org.hibernate.*;
public class HibernateUtil {
	
	private static SessionFactory  sessionFactory ;
     
	static {
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}
		catch(Exception e){
			System.out.println(e);
			
		}
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
