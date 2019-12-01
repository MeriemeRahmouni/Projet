package com.test.hotel.dao.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name ="responsable")
public class Responsable implements Serializable{

		@Id
        @GeneratedValue
        @Column(name="id")
        private Integer id; 

        @Column(name="username")
        private String username;

        @Column(name="password")
        private String password;        

        @Column(name="nom")
        private String nom;
        
        @Column(name="prenom")
        private String prenom;
        
        @Column(name="tel")
        private String tel;
        
        @Column(name="group_id")
        private Integer group_id;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		public String getTel() {
			return tel;
		}

		public void setTel(String tel) {
			this.tel = tel;
		}

		public Integer getGroup_id() {
			return group_id;
		}

		public void setGroup_id(Integer group_id) {
			this.group_id = group_id;
		}
        
        

}