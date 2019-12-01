package com.test.hotel.dao;

import java.util.List;

import com.test.hotel.dao.entity.Facture;

public interface FactureDAO {
	
	public void add (Facture r);
	
	public Facture edite (Facture r);
	
	public void delete (Integer id);

	public List <Facture> findAll();
	
	public Facture findById(Integer id);
}
	
