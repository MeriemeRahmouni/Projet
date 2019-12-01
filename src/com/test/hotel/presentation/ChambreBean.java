package com.test.hotel.presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="chambreBean1")
@RequestScoped
public class ChambreBean {
	
	 private Integer id;
	 private Integer nbr_lit;
	 private Integer prix; 
	 private Integer disponibilite; 
	 private Integer type_chambre;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNbr_lit() {
		return nbr_lit;
	}
	public void setNbr_lit(Integer nbr_lit) {
		this.nbr_lit = nbr_lit;
	}
	public Integer getPrix() {
		return prix;
	}
	public void setPrix(Integer prix) {
		this.prix = prix;
	}
	public Integer getDisponibilite() {
		return disponibilite;
	}
	public void setDisponibilite(Integer disponibilite) {
		this.disponibilite = disponibilite;
	}
	public Integer getType_chambre() {
		return type_chambre;
	}
	public void setType_chambre(Integer type_chambre) {
		this.type_chambre = type_chambre;
	}
	 
	 
	 
	 
	 

}
