package com.test.hotel.service;

import java.util.List;

import com.test.hotel.dao.ChambreDAO;
import com.test.hotel.dao.ChambreDAOImp;
import com.test.hotel.dao.entity.Chambre;

public class ChambreServicesImpl implements ChambreServices {

	ChambreDAO dao = new ChambreDAOImp();
	
	@Override
	public void add(Chambre r) {
		dao.add(r);
		
	}

	@Override
	public Chambre edite(Chambre r) {
		// TODO Auto-generated method stub
		return dao.edite(r);
	}

	@Override
	public void delete(Integer id) {
		dao.delete(id);
		
	}

	@Override
	public List<Chambre> findAll() {
	
		return dao.findAll();
	}

	@Override
	public Chambre findById(Integer id) {
		return dao.findById(id);
	}

	
}
