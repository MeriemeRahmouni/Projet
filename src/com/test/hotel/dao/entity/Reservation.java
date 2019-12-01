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
@Table(name = "reservation")
public class Reservation {
	
	@Id
    @GeneratedValue
    @Column(name="id")
    private Integer id;
	
	@Column(name="date_reservation")
	private Date date_reservation;
	
	@Column(name="date_arrivee")
	private Date date_arrivee;
	
	@Column(name="date_depart")
	private Date date_depart;
	
	@Column(name="etat")
	private Integer etat;
	
	@Column(name="prix_total")
	private Integer prix_total;

	@ManyToOne
	@JoinColumn(name="id_chambre",referencedColumnName="id", insertable=false, updatable=false)
	private Chambre chambre;
	
	@ManyToOne
	@JoinColumn(name="id_client",referencedColumnName="id", insertable=false, updatable=false)
	private Client client;
	
	@ManyToOne
	@JoinColumn(name="id_responsable",referencedColumnName="id", insertable=false, updatable=false)
	private Responsable responsable;
	
	
	public Chambre getChambre() {
		return chambre;
	}

	public void setChambre(Chambre chambre) {
		this.chambre = chambre;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Responsable getResponsable() {
		return responsable;
	}

	public void setResponsable(Responsable responsable) {
		this.responsable = responsable;
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
