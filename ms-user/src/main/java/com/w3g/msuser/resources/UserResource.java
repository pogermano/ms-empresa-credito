package com.w3g.msuser.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.w3g.msuser.entities.User;
import com.w3g.msuser.repositories.UserRepository;

@RefreshScope
@RestController
@RequestMapping(value ="/users")
public class UserResource {
	
	
	@Autowired
	private UserRepository repository;
    
	/*
	 * @GetMapping public ResponseEntity<List<User>> findAll() { List<User> list =
	 * repository.findAll(); return ResponseEntity.ok(list);
	 * 
	 * }
	 */
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
    	User user = repository.findById(id).get();    	
		return ResponseEntity.ok(user);
    	
    }

	
	  @GetMapping(value = "/search") 
	  public ResponseEntity<User>  findByEmail(@RequestParam String email) { 
		  User user =  repository.findByEmail(email); 
		  return ResponseEntity.ok(user);
	  
	  }
	 
    
}
