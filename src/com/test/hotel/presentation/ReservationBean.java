package com.test.hotel.presentation;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

import org.apache.log4j.Logger;

@ManagedBean(name="reservationBean1")
@RequestScoped
public class ReservationBean {
	
	public Logger log= Logger.getLogger(ReservationBean.class);
	private Integer id;
	private Date date_reservation;
	private Date date_arrivee;
	private Date date_depart;
	private Integer etat;
	private Integer prix_total=2200;
	
	
	public void saveData(ActionEvent e) {
		log.info("Le prix total est: "+ prix_total);
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDate_reservation() {
		return date_reservation;
	}
	public void setDate_reservation(Date date_reservation) {
		this.date_reservation = date_reservation;
	}
	public Date getDate_arrivee() {
		return date_arrivee;
	}
	public void setDate_arrivee(Date date_arrivee) {
		this.date_arrivee = date_arrivee;
	}
	public Date getDate_depart() {
		return date_depart;
	}
	public void setDate_depart(Date date_depart) {
		this.date_depart = date_depart;
	}
	public Integer getEtat() {
		return etat;
	}
	public void setEtat(Integer etat) {
		this.etat = etat;
	}
	public Integer getPrix_total() {
		return prix_total;
	}
	public void setPrix_total(Integer prix_total) {
		this.prix_total = prix_total;
	}
	
	

}
