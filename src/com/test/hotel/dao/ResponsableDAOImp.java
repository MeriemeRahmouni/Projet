package com.test.hotel.dao;

import java.util.List;

import org.hibernate.Session;

import com.test.hotel.dao.entity.Responsable;
import com.test.hotel.utils.HibernateUtil;

public class ResponsableDAOImp implements ResponsableDAO {
	Session session = HibernateUtil.openSession();

	@Override
	public void add(Responsable r) {
	session.beginTransaction();
	 session.save(r);
	session.getTransaction().commit();
	}

	@Override
	public Responsable edite(Responsable r) {
		session.beginTransaction();
		Responsable re = (Responsable) session.merge(r);
		session.getTransaction().commit();
			return re;
	}

	@Override
	public void delete(Integer id) {
		session.beginTransaction();
		Responsable r = findById(id);
		session.delete(r);
		session.getTransaction().commit();
	}

	@Override
	public List<Responsable> findAll() {
		return session.createQuery("select r from Responsable r").list();
	}
	
	@Override
	public List<Responsable> findAllAdmin() {
		return session.createQuery("select r from Responsable r where r.group_id=1").list();
	}

	@Override
	public List<Responsable> findAllCommercial() {
		return session.createQuery("select r from Responsable r where r.group_id=2").list();
	}
	
	@Override
	public List<Responsable> findAllComptable() {
		return session.createQuery("select r from Responsable r where r.group_id=3").list();
	}
	
	@Override
	public Responsable findById(Integer id) {
		return (Responsable) session.get(Responsable.class, id);
	}

}
