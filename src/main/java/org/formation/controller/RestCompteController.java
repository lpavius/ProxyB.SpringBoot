package org.formation.controller;

import org.formation.entity.Client;
import org.formation.service.ClientServiceImpl;
import org.formation.service.CompteServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comptes")
@CrossOrigin(origins = {"http://localhost:4200"})
public class RestCompteController {

	CompteServiceImpl compteService;
	ClientServiceImpl clientService;
	
	public RestCompteController(CompteServiceImpl compteService, ClientServiceImpl clientService) {
		super();
		this.compteService = compteService;
		this.clientService = clientService;
	}

	@PutMapping("/virement/{id}")
	public void virement(@PathVariable Long id, double montant) {
		Client cl = clientService.readClient(id);
		compteService.virement(cl, montant);
	}
	
}
