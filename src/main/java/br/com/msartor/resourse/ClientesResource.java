package br.com.msartor.resourse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.msartor.model.Cliente;
import br.com.msartor.repository.Clientes;

@RestController
@RequestMapping("/clientes")
public class ClientesResource {
	
	@Autowired
	private Clientes clientes;
	
	@GetMapping
	public List<Cliente> listar(){
		return this.clientes.findAll();
	}
}