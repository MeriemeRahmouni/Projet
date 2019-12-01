package com.test.hotel.dao.entity;

import javax.faces.bean.ManagedBean;
//import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="ResponsableController")
@SessionScoped
public class ResponsableController {
	private ResponsableModel ResponsableModel = new ResponsableModel();
	private Responsable responsable = new Responsable();
	private String message = "";
	// getter and setter of objet Connection
	public Responsable getResponsable() {
		return responsable;
	}
	public void setResponsable(Responsable Responsable) {
		this.responsable = Responsable;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String Login()
	{
		if(ResponsableModel.login(this.responsable.getUsername(), this.responsable.getPassword())!=null && ResponsableModel.login(this.responsable.getUsername(), this.responsable.getPassword()).getGroup_id() ==1)
		{
			return "admin";
		}
		
		if(ResponsableModel.login(this.responsable.getUsername(), this.responsable.getPassword())!=null && ResponsableModel.login(this.responsable.getUsername(), this.responsable.getPassword()).getGroup_id() ==2)
		{
			return "commercial";
		}
		if(ResponsableModel.login(this.responsable.getUsername(), this.responsable.getPassword())!=null && ResponsableModel.login(this.responsable.getUsername(), this.responsable.getPassword()).getGroup_id() ==3)
		{
			return "comptable";
		}
		else
		{
			
			this.message = " Erreur d'authentification";
			this.responsable = new Responsable();
			return "login";
		}
		
	}

}
