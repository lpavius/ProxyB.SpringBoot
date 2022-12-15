package org.formation.entity;

import jakarta.persistence.Entity;

@Entity
public class CompteCourant extends Compte {
	     
	public CompteCourant() {
		
	}

	public CompteCourant(double solde) {
		super(solde);
		
	}
	

}
