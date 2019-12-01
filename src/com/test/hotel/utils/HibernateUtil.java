package com.test.hotel.utils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.boot.registry.StandardServiceRegistry;

/**
 * @author Deepak Kumar 
 * * Web: http://www.roseindia.net
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory;


    static {

            try {
            	
            	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");        	

            	StandardServiceRegistryBuilder sb = new StandardServiceRegistryBuilder();
            	
            	sb.applySettings(cfg.getProperties());
            	
            	StandardServiceRegistry standardServiceRegistry = sb.build();           	
            	
            	sessionFactory = cfg.buildSessionFactory(standardServiceRegistry);
            	
       	
            } catch (Throwable th) {

                    System.err.println("Enitial SessionFactory creation failed" + th);

                    throw new ExceptionInInitializerError(th);

            }

    }

   
	
	//des méthodes util
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	public static Session openSession() {
		return sessionFactory.openSession();
		}
	
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public static void close() {
		if(sessionFactory != null) {
			sessionFactory.close();
		}
		
		
	}
}

