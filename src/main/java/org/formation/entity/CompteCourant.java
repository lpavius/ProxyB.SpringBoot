package org.formation.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class CompteCourant extends Compte {
	
	private double decouvert = 1000d;
	
	@OneToOne
	@JsonIgnore
	@JoinColumn(name = "client_id", updatable = false)
	private Client client ;
	     
	public CompteCourant() {
		
	}

	public CompteCourant(double solde,LocalDate date) {
		super(solde, date);
//		this.client = new Client();
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

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	
	
	

	

	

}
