package com.test.hotel.dao.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "facture")
public class Facture {
	
	@Id
    @GeneratedValue
    @Column(name="id")
    private Integer id;
	
	@Column(name="date_debut")
	private Date date_debut;
	
	@Column(name="date_expiration")
	private Date date_expiration;
	
	@Column(name="statut")
	private Integer statut;
	
	@Column(name="id_reservation")
	private Integer id_reservation;
	
	@ManyToOne
	@JoinColumn(name="id_reservation",referencedColumnName="id", insertable=false, updatable=false)
	private Reservation reservation;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	public Date getDate_expiration() {
		return date_expiration;
	}

	public void setDate_expiration(Date date_expiration) {
		this.date_expiration = date_expiration;
	}

	public Integer getStatut() {
		return statut;
	}

	public void setStatut(Integer statut) {
		this.statut = statut;
	}

	public Integer getId_reservation() {
		return id_reservation;
	}

	public void setId_reservation(Integer id_reservation) {
		this.id_reservation = id_reservation;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	
	

}
