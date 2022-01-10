package com.w3g.msuser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.w3g.msuser.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {
	
	User findByEmail(String email);

}
