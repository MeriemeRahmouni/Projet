package com.test.hotel.service;

import java.util.List;

import com.test.hotel.dao.entity.Responsable;

	public interface ResponsableServices {
	public void add (Responsable r);
	
	public Responsable edite (Responsable r);
	
	public void delete (Integer id);

	public List <Responsable> findAll();
	
	public List <Responsable> findAllAdmin();
	
	public List <Responsable> findAllCommercial();
	
	public List <Responsable> findAllComptable();
	
	public Responsable findById(Integer id);

}
