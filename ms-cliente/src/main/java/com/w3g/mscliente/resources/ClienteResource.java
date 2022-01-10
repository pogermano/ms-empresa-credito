package com.w3g.mscliente.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.w3g.mscliente.entities.Cliente;
import com.w3g.mscliente.repositories.ClienteRepository;

@RefreshScope
@RestController
@RequestMapping(value ="/clientes")
public class ClienteResource {

	@Autowired
	private ClienteRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> findAll() {
		List<Cliente> list =repository.findAll();    	
		return ResponseEntity.ok(list);
		
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Cliente> findById(@PathVariable Long id) {
		Cliente cliente =repository.findById(id).get();    	
		return ResponseEntity.ok(cliente);
		
	}
	


}








