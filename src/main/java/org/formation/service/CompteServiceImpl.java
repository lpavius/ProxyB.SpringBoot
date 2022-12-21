package org.formation.service;

import org.formation.entity.Client;
import org.formation.entity.CompteCourant;
import org.formation.entity.CompteEpargne;
import org.formation.repository.ICompteCourantRepository;
import org.formation.repository.ICompteEpargneRepository;
import org.springframework.stereotype.Service;

@Service
public class CompteServiceImpl implements CompteService {
	
	ICompteCourantRepository ccRepository;
	ICompteEpargneRepository ceRepository;
	

	public CompteServiceImpl(ICompteCourantRepository cc, ICompteEpargneRepository ce) {
		super();
		this.ccRepository = cc;
		this.ceRepository = ce;
	}

	@Override
	public CompteCourant getCopmteCourant(long id) {
		return ccRepository.findByNumeroCompte(id);
	}

	@Override
	public CompteEpargne getCopmteEpargne(long id) {
		return ceRepository.findByNumeroCompte(id);
	}

	@Override
	public void virement(Client client, double montant) {
		CompteCourant cc = getCopmteCourant(client.getCc().getNumeroCompte());
		cc.setSolde(cc.getSolde() - montant);
		ccRepository.save(cc);
		CompteEpargne ce = getCopmteEpargne(client.getCompteEp().getNumeroCompte());
		ce.setSolde(ce.getSolde() + montant);
		ceRepository.save(ce);
	}

	@Override
	public CompteCourant updateCcourant(CompteCourant courant) {
		if(courant.getNumeroCompte() != null) {
			courant.setSolde(courant.getSolde());
			courant.setDate(courant.getDate());
			courant.setNumeroCompte(courant.getNumeroCompte());
			//compteRepository.save(compte);
		}
		return courant;
	}

	@Override
	public CompteEpargne updateCEpargne(CompteEpargne epargne) {
		if(epargne.getNumeroCompte() != null) {
			epargne.setSolde(epargne.getSolde());
			epargne.setDate(epargne.getDate());
			epargne.setNumeroCompte(epargne.getNumeroCompte());
			//compteRepository.save(compte);
		}
		return epargne;
	}

	
}
