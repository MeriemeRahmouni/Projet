package com.test.hotel.presentation;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="factureBean1")
@RequestScoped
public class FactureBean {
	private Integer id;
	private Date date_debut;
	private Date date_expiration;
	private Integer statut;
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
	
	

}
