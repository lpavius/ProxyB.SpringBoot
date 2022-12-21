package org.formation.service;

import org.formation.entity.Client;
import org.formation.entity.CompteCourant;
import org.formation.entity.CompteEpargne;

public interface CompteService {
	
	CompteCourant getCopmteCourant(long id);
	void virement(Client client, double montant);
	CompteEpargne getCopmteEpargne(long id);
	CompteCourant updateCcourant(CompteCourant courant);
	CompteEpargne updateCEpargne(CompteEpargne epargne);
}
