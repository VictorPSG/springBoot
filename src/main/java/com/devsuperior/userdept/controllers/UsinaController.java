package com.devsuperior.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.userdept.entities.Usina;
import com.devsuperior.userdept.repositories.UsinaRepository;


@RestController
@RequestMapping(value = "/usinas")
public class UsinaController {
	
	@Autowired
	private UsinaRepository repository;
	
	@GetMapping
	public List<Usina> findAll(){
		return repository.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Usina findById(@PathVariable long id) {
		return repository.findById(id).get();
	}
	
	@PostMapping
	public Usina insertUsina(@RequestBody Usina usina) {
		return repository.save(usina);
	}
	
	@DeleteMapping(value = "/{id}")
	public String deleteUsina(@PathVariable long id) {
		if(repository.existsById(id)){
			repository.deleteById(id);
			return "Apagado com Sucesso!";
		}else {
			return "ID:"+id+" não existe";
		}
	}
	
	

}
