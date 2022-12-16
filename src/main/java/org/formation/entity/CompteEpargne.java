package org.formation.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;

@Entity
public class CompteEpargne extends Compte{
	
	public CompteEpargne() {
	
	}

	public CompteEpargne(double solde, LocalDate date) {
		super(solde, date);

	}
	
	

}
