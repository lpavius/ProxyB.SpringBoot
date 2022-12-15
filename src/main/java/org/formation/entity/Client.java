 package org.formation.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;


@Entity
public class Client extends Personne  {
	
	private String telephone;
	
	@Embedded
	private Adresse adresse;
	
	public Client() {}

	public Client(Adresse adresse) {
	    this.adresse = adresse;
	}
	
	public Client(String nom, String prenom, String telephone, Adresse adresse) {
		super(nom,prenom);
		this.telephone = telephone;
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	public String toString() {
		 return " ID  : "+this.getId() +" - "+
		    	" Nom : "+this.getNom()+" - "+
		    	" Prénom : "+this.getPrenom() +" - "+
		    	" Telephone : "+this.getTelephone() +" - "/*+
		    	" Adresse : "+this.getAdresse().toString()*/;
	}
	
	

  
}
