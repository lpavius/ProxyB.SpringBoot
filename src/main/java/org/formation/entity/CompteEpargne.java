package org.formation.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class CompteEpargne extends Compte {
	
	private int interet = 3;
	
	@OneToOne
	@JsonIgnore
	private Client client;
	
	public CompteEpargne() {
	
	}

	public CompteEpargne(double solde, LocalDate date) {
		super(solde, date);
	}

	public int getInteret() {
		return interet;
	}

	public Client getClient() {
		return client;
	}

	public void setInteret(int interet) {
		this.interet = interet;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
}
