package com.test.hotel.dao.entity;
import org.hibernate.*;




public class ResponsableModel extends AbstractModel<Responsable> {
	
	public ResponsableModel() {
		super(Responsable.class);
	}
	public Responsable login(String username,String  password) {
		try {
			if (!sessionFactory.getCurrentSession().getTransaction().isActive())
                sessionFactory.getCurrentSession().getTransaction().begin();  
			Query query = sessionFactory.getCurrentSession().createQuery("from Responsable r where r.username=:username and r.password=:password");
			query.setString("username", username);
			query.setString("password", password);
			return (Responsable) query.uniqueResult();
		}catch (Exception e) {
			return null;
		}
	}
	

}
