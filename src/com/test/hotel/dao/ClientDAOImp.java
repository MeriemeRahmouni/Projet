package com.test.hotel.dao;

import java.util.List;

import org.hibernate.Session;

import com.test.hotel.dao.entity.Client;
import com.test.hotel.utils.HibernateUtil;

public class ClientDAOImp implements ClientDAO {
	Session session = HibernateUtil.openSession();

	@Override
	public void add(Client r) {
	session.beginTransaction();
	 session.save(r);
	session.getTransaction().commit();
	}

	@Override
	public Client edite(Client r) {
		session.beginTransaction();
		Client re = (Client) session.merge(r);
		session.getTransaction().commit();
			return re;
	}

	@Override
	public void delete(Integer id) {
		session.beginTransaction();
		Client r = findById(id);
		session.delete(r);
		session.getTransaction().commit();
	}

	@Override
	public List<Client> findAll() {
		return session.createQuery("select r from Client r").list();
	}

	@Override
	public Client findById(Integer id) {
		return (Client) session.get(Client.class, id);
	}

}
