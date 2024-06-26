package com.devsuperior.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.userdept.entities.Modulo;
import com.devsuperior.userdept.repositories.ModuloRepository;

@RestController
@RequestMapping(value = "/modulos")
class ModuloController {
	
	@Autowired
	private ModuloRepository repository;

	@GetMapping
	public List<Modulo> findAll(){
		return repository.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Modulo findById(@PathVariable long id) {
		return repository.findById(id).get();
	}
	
	@PostMapping
	public Modulo insertUsina(@RequestBody Modulo modulo) {
		return repository.save(modulo);
	}
	
	@DeleteMapping(value = "/{id}")
	public String deleteModulo(@PathVariable long id) {
		if(repository.existsById(id)){
			repository.deleteById(id);
			return "Apagado com Sucesso!";
		}else {
			return "ID:"+id+" não existe";
		}
	}
	
	
}
