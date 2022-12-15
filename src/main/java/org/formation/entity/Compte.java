package org.formation.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Compte {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long numeroCompte;
	private double solde; 
	private LocalDate date;
	//private static long count = 1000;
	
	public Compte() {
		
	}

	public Compte(double solde) {
		super();
		//count++;
		//this.numeroCompte = count;
		this.solde = solde;
		this.date = LocalDate.now();
	}

	public long getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(long numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Compte [numeroCompte=" + numeroCompte + ", solde=" + solde + ", date=" + date + "]";
	}
	
	
	

}


