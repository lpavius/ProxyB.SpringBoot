package org.formation.controller;

import java.util.List;

import org.formation.entity.Client;
import org.formation.repository.ClientRepository;
import org.formation.service.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
//@CrossOrigin(origins = {"http://localhost:4200"})
public class RestClientContoller {

	@Autowired
	ClientRepository clientRepository;
	
	ClientServiceImpl clientServiceImpl;

	public RestClientContoller(ClientServiceImpl clientServiceImpl) {
	super();
	this.clientServiceImpl = clientServiceImpl;
}

	@GetMapping
	public List<Client> getClients() {
//		return clientRepository.findAll();
		return clientServiceImpl.listClient();
	}

	@PostMapping
	public Client createClient(@RequestBody Client client) {
//		return clientRepository.save(client);
		return clientServiceImpl.createClient(client);
	}

	@PutMapping
//	@CrossOrigin(origins = "*", methods = RequestMethod.PUT, allowedHeaders = "*")
	public Client updateClient(@RequestBody Client client) {
//		return clientRepository.save(client);
		return clientServiceImpl.updateClient(client);

	}

	@DeleteMapping("/{id}")
	public void deleteClient(@PathVariable("id") Long id) {
//		clientRepository.deleteById(id);
		clientServiceImpl.deleteClient(id);
	}

	@GetMapping("/{id}")
	public Client getClient(@PathVariable("id") Long id) {
//		return clientRepository.findById(id).get();
		return clientServiceImpl.readClient(id);

	}

}
