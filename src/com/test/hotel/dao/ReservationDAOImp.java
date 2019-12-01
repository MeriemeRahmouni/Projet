package com.test.hotel.dao;

import java.util.List;

import org.hibernate.Session;

import com.test.hotel.dao.entity.Reservation;
import com.test.hotel.utils.HibernateUtil;

public class ReservationDAOImp implements ReservationDAO {
	Session session = HibernateUtil.openSession();

	@Override
	public void add(Reservation r) {
	session.beginTransaction();
	 session.save(r);
	session.getTransaction().commit();
	}

	@Override
	public Reservation edite(Reservation r) {
		session.beginTransaction();
		Reservation re = (Reservation) session.merge(r);
		session.getTransaction().commit();
			return re;
	}

	@Override
	public void delete(Integer id) {
		session.beginTransaction();
		Reservation r = findById(id);
		session.delete(r);
		session.getTransaction().commit();
	}

	@Override
	public List<Reservation> findAll() {
		return session.createQuery("select r from Reservation r").list();
	}

	@Override
	public Reservation findById(Integer id) {
		return (Reservation) session.get(Reservation.class, id);
	}

}
