package com.w3g.mscliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.w3g.mscliente.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
 
}
