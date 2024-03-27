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

import com.devsuperior.userdept.entities.Placas;
import com.devsuperior.userdept.repositories.PlacaRepository;

@RestController
@RequestMapping(value = "placas")
public class PlacaController {

	@Autowired
	PlacaRepository repository;
	
	@GetMapping
	public List<Placas> findAll(){
		return repository.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Placas findById(@PathVariable long id) {
		return repository.findById(id).get();
	}	
	
	@PostMapping
	public Placas insertPlaca(@RequestBody Placas placa) {
		return repository.save(placa);
	}
	
	
	@DeleteMapping(value = "/{id}")
	public String deleteModulo(@PathVariable long id) {
		if(repository.existsById(id)){
			repository.deleteById(id);
			return "Apagado com Sucesso!";
		}
		else {
			return "ID:"+id+" não existe";
		}
	}
}
