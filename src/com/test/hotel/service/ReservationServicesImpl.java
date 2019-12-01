package com.test.hotel.service;

import java.util.List;

import com.test.hotel.dao.ReservationDAO;
import com.test.hotel.dao.ReservationDAOImp;
import com.test.hotel.dao.entity.Reservation;

public class ReservationServicesImpl implements ReservationServices {
	ReservationDAO dao = new ReservationDAOImp();

	@Override
	public void add(Reservation r) {
		dao.add(r);
		
	}

	@Override
	public Reservation edite(Reservation r) {
		return dao.edite(r);
	}

	@Override
	public void delete(Integer id) {
		dao.delete(id);
		
	}

	@Override
	public List<Reservation> findAll() {
		return dao.findAll();
	}

	@Override
	public Reservation findById(Integer id) {
		return dao.findById(id);
	}

}
