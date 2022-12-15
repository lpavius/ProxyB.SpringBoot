package org.formation.entity;

import jakarta.persistence.Entity;

@Entity
public class CompteEpargne extends Compte{
	
	public CompteEpargne() {
	
	}

	public CompteEpargne(double solde) {
		super(solde);

	}
	
	

}
