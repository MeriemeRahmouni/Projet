package com.test.hotel.presentation;


import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import org.apache.log4j.Logger;

import com.test.hotel.dao.entity.Responsable;
import com.test.hotel.service.ResponsableServices;
import com.test.hotel.service.ResponsableServicesImpl;

@ManagedBean(name="responsableBean1")
@RequestScoped
public class ResponsableBean {
	
	
	public Logger log = Logger.getLogger(ResponsableBean.class);
	private ResponsableServices services= new ResponsableServicesImpl();
	 
	 private String username;
	 private String password;
	 private String nom;
	 private String prenom;
	 private String tel;
	 private Integer group_id;
	private String success="";
	private boolean afficherForm;
	private List<Responsable> responsableList;
	private List<Responsable> responsableListAdmin;
	private List<Responsable> responsableListCommercial;
	private List<Responsable> responsableListComptable;
	private String id;
	private String operation;
	

	
	
	
	@PostConstruct
	public void initBean() {
		
		afficherForm=false;
		
		//préparer responsableList
		responsableList=services.findAll();
		responsableListAdmin=services.findAllAdmin();
		responsableListCommercial=services.findAllCommercial();
		responsableListComptable=services.findAllComptable();
		System.out.println("id------------ "+getParam("id"));
		System.out.println("operation------------ "+getParam("operation"));
		
		if("edit".equalsIgnoreCase(getParam("operation"))) {
			setOperation(getParam("operation"));
			Integer id=null;
			Responsable resp=null;
			
			try {
				 id = Integer.valueOf(getParam("id"));
				setId(getParam("id"));
				System.out.println("§§§§§§§§§§§§§§§§§§ya raaaaaaaaaabi");
			}catch(Exception e){
			}
			
			if(id!=null) {
				System.out.println("§§§§§§§§§§§§§§§§§§ya raaaaaaaaaabi2");
				 resp=services.findById(id);
				 if(resp!=null) {
					 username=resp.getUsername();
						password=resp.getPassword();
						nom=resp.getNom();
						prenom=resp.getPrenom();
						tel=resp.getTel();
						group_id=resp.getGroup_id();
				 }
			}
			
		}
	}
	
	
	
	
	








	



	public List<Responsable> getResponsableListAdmin() {
		return responsableListAdmin;
	}




	public void setResponsableListAdmin(List<Responsable> responsableListAdmin) {
		this.responsableListAdmin = responsableListAdmin;
	}




	public List<Responsable> getResponsableListCommercial() {
		return responsableListCommercial;
	}




	public void setResponsableListCommercial(List<Responsable> responsableListCommercial) {
		this.responsableListCommercial = responsableListCommercial;
	}




	public List<Responsable> getResponsableListComptable() {
		return responsableListComptable;
	}




	public void setResponsableListComptable(List<Responsable> responsableListComptable) {
		this.responsableListComptable = responsableListComptable;
	}




	public List<Responsable> getResponsableList() {
		return responsableList;
	}




	public void setResponsableList(List<Responsable> responsableList) {
		this.responsableList = responsableList;
	}




	public boolean isAfficherForm() {
		return afficherForm;
	}

	public void setAfficherForm(boolean afficherForm) {
		this.afficherForm = afficherForm;
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	{
		System.out.println("je suis un bloc normal");
	}
	
	
	static{
		
	System.out.println("je suis un bloc statique");
	}
	
	
	
	 
	 
	 public String getParam(String name) {
	 
		 FacesContext fc= FacesContext.getCurrentInstance();
		 Map<String,String>params= fc.getExternalContext().getRequestParameterMap();
		 return params.get(name);
	 }
	 
	 
	 public void AfficherFormAction(ActionEvent e) {
		 afficherForm=true; 
		 System.out.println("true");
	 }	 
	 
	 public void cancelAction(ActionEvent e) {
		 afficherForm=false; 
	 }
	 
	 public void addResponsable(ActionEvent e) {
		 success="";
		 Responsable r=null;
		 System.out.println("§§§§§§§§§§§§§§§§§§§§§id"+id);
		 System.out.println("§§§§§§§§§§§§§§§§§§§§§id"+operation);
		 if("edit".equalsIgnoreCase(operation)) {
			 System.out.println("§§§§§§§§§§§§§§§§§§ya raaaaaaaaaabi3 ");
			 r=services.findById(new Integer(id));
		 }else {
			 r=new Responsable(); 
		 }
		  
		 System.out.println("?????????"+operation);
		
		 System.out.println("--------"+id); 
		System.out.println("--------"+username);
		System.out.println("--------"+password);
		System.out.println("--------"+nom);
		System.out.println("--------"+prenom);
		System.out.println("--------"+tel);
		System.out.println("--------"+group_id);
		r.setUsername(username);
		r.setPassword(password);
		r.setNom(nom);
		r.setPrenom(prenom);
		r.setTel(tel);
		r.setGroup_id(Integer.valueOf(group_id));
		services.add(r);
		success="Le nouveau profil a été bien ajouté";
		//add to database
		
		username="";
		password="";
		nom="";
		prenom="";
		tel="";
		group_id=1;
		id="";
		operation="";
		responsableListAdmin=services.findAllAdmin();
		responsableListCommercial=services.findAllCommercial();
		responsableListComptable=services.findAllComptable();
		
		 
	 }
	 
	 
	 public void deleteResponsable(ActionEvent e) {
		 
	 FacesContext fc = FacesContext.getCurrentInstance();
	 Map<String, String> param = fc.getExternalContext().getRequestParameterMap();
	 System.out.println("------------------------------id"+param.get("id"));
	 
	 services.delete(new Integer(param.get("id")));
	 responsableListAdmin=services.findAllAdmin();
		responsableListCommercial=services.findAllCommercial();
		responsableListComptable=services.findAllComptable();
		
		 
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOperation() {
		return operation;
	}


	public void setOperation(String operation) {
		this.operation = operation;
	}

















	public Logger getLog() {
		return log;
	}

















	public void setLog(Logger log) {
		this.log = log;
	}

















	public ResponsableServices getServices() {
		return services;
	}

















	public void setServices(ResponsableServices services) {
		this.services = services;
	}
	 
	 
	 

}
