package com.test.hotel.service;

import java.util.List;

import com.test.hotel.dao.ClientDAO;
import com.test.hotel.dao.ClientDAOImp;
import com.test.hotel.dao.entity.Client;

public class ClientServicesImpl implements ClientServices {

	ClientDAO dao = new ClientDAOImp();
	
	@Override
	public void add(Client r) {
		dao.add(r);
		
	}

	@Override
	public Client edite(Client r) {
		return dao.edite(r);
	}

	@Override
	public void delete(Integer id) {
		dao.delete(id);
		
	}

	@Override
	public List<Client> findAll() {
		return dao.findAll();
	}

	@Override
	public Client findById(Integer id) {
		return dao.findById(id);
	}

}
