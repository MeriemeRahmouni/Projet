package com.test.hotel.service;

import java.util.List;

import com.test.hotel.dao.ResponsableDAO;
import com.test.hotel.dao.ResponsableDAOImp;
import com.test.hotel.dao.entity.Responsable;

public class ResponsableServicesImpl implements ResponsableServices {
	ResponsableDAO dao = new ResponsableDAOImp();

	@Override
	public void add(Responsable r) {
		dao.add(r);
		
	}

	@Override
	public Responsable edite(Responsable r) {
		return dao.edite(r);
	}

	@Override
	public void delete(Integer id) {
		dao.delete(id);
		
	}

	@Override
	public List<Responsable> findAll() {
		return dao.findAll();
	}
	
	@Override
	public List<Responsable> findAllAdmin() {
		return dao.findAllAdmin();
	}
	
	@Override
	public List<Responsable> findAllCommercial() {
		return dao.findAllCommercial();
	}
	
	@Override
	public List<Responsable> findAllComptable() {
		return dao.findAllComptable();
	}

	@Override
	public Responsable findById(Integer id) {
		return dao.findById(id);
	}

}
