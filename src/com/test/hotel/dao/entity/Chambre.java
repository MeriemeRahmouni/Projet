package com.test.hotel.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "chambre")
public class Chambre {
	
	@Id
    @GeneratedValue
    @Column(name="id")
    private Integer id; 
	
	@Column(name="nbr_lit")
    private Integer nbr_lit; 
	
	@Column(name="prix")
    private Integer prix; 
	
	@Column(name="disponibilite")
    private Integer disponibilite; 
	
	@Column(name="type_chambre")
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
