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
	private CompteCourant cc;
	
	@OneToOne(mappedBy = "client", cascade = {CascadeType.ALL})
	private CompteEpargne compteEp;
	
	public Client() {}
	
	public Client(String nom , String prenom,String  telephone, Adresse adresse) {
		super(nom, prenom);
		this.telephone = telephone;
		this.adresse = adresse;
	}

	public Client(String telephone, Adresse adresse, CompteCourant cc, CompteEpargne compteEp) {
		super();
		this.telephone = telephone;
		this.adresse = adresse;
		this.cc = cc;
		this.compteEp = compteEp;
	}

	public Client(CompteCourant cc, CompteEpargne compteEp) {
		super();
		this.cc = cc;
		this.compteEp = compteEp;
	}

	public Client(Adresse adresse) {
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

	public CompteEpargne getCompteEp() {
		return compteEp;
	}

	public void setCompteEp(CompteEpargne compteEp) {
		this.compteEp = compteEp;
	}

  
}
