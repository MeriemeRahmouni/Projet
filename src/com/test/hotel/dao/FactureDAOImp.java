package com.test.hotel.dao;

import java.util.List;

import org.hibernate.Session;

import com.test.hotel.dao.entity.Facture;
import com.test.hotel.utils.HibernateUtil;

public class FactureDAOImp implements FactureDAO {
	Session session = HibernateUtil.openSession();

	@Override
	public void add(Facture r) {
	session.beginTransaction();
	 session.save(r);
	session.getTransaction().commit();
	}

	@Override
	public Facture edite(Facture r) {
		session.beginTransaction();
		Facture re = (Facture) session.merge(r);
		session.getTransaction().commit();
			return re;
	}

	@Override
	public void delete(Integer id) {
		session.beginTransaction();
		Facture r = findById(id);
		session.delete(r);
		session.getTransaction().commit();
	}

	@Override
	public List<Facture> findAll() {
		return session.createQuery("select r from Facture r").list();
	}

	@Override
	public Facture findById(Integer id) {
		return (Facture) session.get(Facture.class, id);
	}

}
