package com.test.hotel.service;

import java.util.List;

import com.test.hotel.dao.entity.Chambre;

public interface ChambreServices {
	
	public void add (Chambre r);
	
	public Chambre edite (Chambre r);
	
	public void delete (Integer id);

	public List <Chambre> findAll();
	
	public Chambre findById(Integer id);
	
}
