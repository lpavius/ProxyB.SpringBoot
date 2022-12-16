package org.formation.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class CompteCourant extends Compte {
	
	private double decouvert = 1000d;
	
	@OneToOne
	@JsonIgnore
	private Client client ;
	     
	public CompteCourant() {
		
	}

	public CompteCourant( Client client, double solde,LocalDate date, double decouvert ) {
		super(solde, date);
		this.decouvert = decouvert;
		this.client = client;
	}

	public CompteCourant(Client client) {
		super();
		this.client = client;
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	public Client getCient() {
		return client;
	}

	public void setCient(Client client) {
		this.client = client;
	}
	
	

	

	

}
