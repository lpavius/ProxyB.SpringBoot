package org.formation.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ClientEntreprise extends Personne {
	
	private String telephone;
	
	@Embedded
	private Adresse adresse;
	
	public ClientEntreprise() {}

	public ClientEntreprise(String nom, String telephone, Adresse adresse) {
		super(nom);
		this.telephone = telephone;
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "ClientEntreprise [nom=" + this.getNom() +
								", telephone=" + telephone + 
								", adresse=" + adresse + "]";
	}

	
}
