package org.formation.service;

import java.util.List;

import org.formation.entity.Client;
import org.formation.entity.CompteCourant;
import org.formation.entity.CompteEpargne;

public interface ClientService {

	Client createClient(Client client);
	Client readClient(Long id);
	Client updateClient(Client client);
	void deleteClient(Long id);
	List<Client> listClient();
	public CompteCourant addCcourant(Client client);
	public CompteEpargne addCptEpargne(Client client);

}
