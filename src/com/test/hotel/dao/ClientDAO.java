package com.test.hotel.dao;

import java.util.List;

import com.test.hotel.dao.entity.Client;



public interface ClientDAO {
	
	public void add (Client r);
	
	public Client edite (Client r);
	
	public void delete (Integer id);

	public List <Client> findAll();
	
	public Client findById(Integer id);
}
	
