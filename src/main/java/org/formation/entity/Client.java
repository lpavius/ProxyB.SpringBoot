package org.formation.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class Client extends Personne  {
	
	private String telephone;
	
	@Embedded
	private Adresse adresse;
	@OneToOne(mappedBy = "client", cascade = {CascadeType.ALL})
	//@JoinColumn(name = "numCompteCourant")
	private CompteCourant cc;
	@OneToOne(mappedBy = "client", cascade = {CascadeType.ALL})
	private CompteEpargne ce;
	
	public Client() {}
	
	public Client(String nom , String prenom,String  telephone, Adresse adresse, CompteCourant cc) {
		super(nom, prenom);
		this.telephone = telephone;
		this.adresse = adresse;
		this.cc = cc;
	}

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
	
	public CompteCourant getCc() {
		return cc;
	}

	public void setCc(CompteCourant cc) {
		this.cc = cc;
	}

	public CompteEpargne getCe() {
		return ce;
	}

	public void setCe(CompteEpargne ce) {
		this.ce = ce;
	}
  
}
