package org.formation.service;

import java.util.List;

import org.formation.entity.Client;

public interface ClientService {

	Client createClient(Client client);
	Client readClient(Long id);
	Client updateClient(Client client);
	void deleteClient(Long id);
	List<Client> listClient();
	
}
