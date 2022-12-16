package org.formation.service;

import java.util.List;

import org.formation.entity.Client;
import org.formation.repository.ClientRepository;

public class ClientServiceImpl implements ClientService {
	
	private ClientRepository clientRepository;
	
	public ClientServiceImpl(ClientRepository clientRepository) {
		super();
		this.clientRepository = clientRepository;
	}

	@Override
	public Client createClient(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public Client readClient(Long id) {
		return clientRepository.findById(id).get();
	}

	@Override
	public Client updateClient(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public void deleteClient(Long id) {
		clientRepository.deleteById(id);
	}

	@Override
	public List<Client> listClient() {
		return clientRepository.findAll();
	}

}
