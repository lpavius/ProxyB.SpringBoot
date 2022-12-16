package org.formation.service;

import java.time.LocalDate;

import java.util.List;

import org.formation.entity.Client;
import org.formation.entity.CompteCourant;
import org.formation.repository.ClientRepository;
import org.formation.repository.ICompteCourantRepository;
import org.springframework.stereotype.Service;
@Service
public class ClientServiceImpl implements ClientService {
	
	private ClientRepository clientRepository;
	private ICompteCourantRepository ccRepository;
	
	public ClientServiceImpl(ClientRepository clientRepository,ICompteCourantRepository compteCourantRepository ) {
		super();
		this.clientRepository = clientRepository;
		this.ccRepository = compteCourantRepository;
	}
	@Override
	public CompteCourant addCcourant(CompteCourant cc , Client client) {
		cc.setCient(client);
		return ccRepository.save(cc);
	}

	@Override
	public Client createClient(Client client) {
		
		//LocalDate date = LocalDate.now();
		CompteCourant cc = new CompteCourant(client, 100,LocalDate.now(), 1000d);
		client.setCc(cc);
		addCcourant(cc,client);
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
