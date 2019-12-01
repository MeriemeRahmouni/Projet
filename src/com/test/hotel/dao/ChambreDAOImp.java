package com.test.hotel.dao;
import java.util.List;

import org.hibernate.Session;

import com.test.hotel.dao.entity.Chambre;
import com.test.hotel.utils.HibernateUtil;

public class ChambreDAOImp implements ChambreDAO {
	Session session = HibernateUtil.openSession();

	@Override
	public void add(Chambre r) {
	session.beginTransaction();
	 session.save(r);
	session.getTransaction().commit();
	}

	@Override
	public Chambre edite(Chambre r) {
		session.beginTransaction();
		Chambre re = (Chambre) session.merge(r);
		session.getTransaction().commit();
			return re;
	}

	@Override
	public void delete(Integer id) {
		session.beginTransaction();
		Chambre r = findById(id);
		session.delete(r);
		session.getTransaction().commit();
	}

	@Override
	public List<Chambre> findAll() {
		return session.createQuery("select r from Chambre r").list();
	}

	@Override
	public Chambre findById(Integer id) {
		return (Chambre) session.get(Chambre.class, id);
	}

}
