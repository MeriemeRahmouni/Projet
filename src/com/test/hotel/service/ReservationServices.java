package com.test.hotel.service;

import java.util.List;

import com.test.hotel.dao.entity.Reservation;

	public interface ReservationServices {
		
	public void add (Reservation r);
	
	public Reservation edite (Reservation r);
	
	public void delete (Integer id);

	public List <Reservation> findAll();
	
	public Reservation findById(Integer id);

}
