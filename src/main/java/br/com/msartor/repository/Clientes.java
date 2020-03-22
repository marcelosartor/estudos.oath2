package br.com.msartor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.msartor.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long> {

}