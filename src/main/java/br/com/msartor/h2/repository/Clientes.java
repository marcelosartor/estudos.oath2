package br.com.msartor.h2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.msartor.h2.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long> {

}