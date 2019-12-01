package com.test.hotel.service;

import java.util.List;

import com.test.hotel.dao.FactureDAO;
import com.test.hotel.dao.FactureDAOImp;
import com.test.hotel.dao.entity.Facture;

public class FactureServicesImpl implements FactureServices {
	FactureDAO dao = new FactureDAOImp();

	@Override
	public void add(Facture r) {
		dao.add(r);
		
	}

	@Override
	public Facture edite(Facture r) {
		return dao.edite(r);
	}

	@Override
	public void delete(Integer id) {
		dao.delete(id);
		
	}

	@Override
	public List<Facture> findAll() {
		return dao.findAll();
	}

	@Override
	public Facture findById(Integer id) {
		return dao.findById(id);
	}
	
}
