package com.test.hotel.utils;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.test.hotel.dao.ChambreDAO;
import com.test.hotel.dao.ChambreDAOImp;
import com.test.hotel.dao.entity.Chambre;

public class Test {
	static Session session = HibernateUtil.openSession();
	
	public static Logger log = Logger.getLogger(Test.class);
	
	public static void main(String[] args) {
		
		ChambreDAO dao = new ChambreDAOImp();
		
		Chambre r = new Chambre();
		r.setNbr_lit(5);
		dao.add(r);
		
		System.out.println("ooooo");
		log.info("aaaaaa");
		
		
		
	}

}
