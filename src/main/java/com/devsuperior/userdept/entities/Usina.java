package com.devsuperior.userdept.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="tb_usina")
public class Usina {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private boolean status;
	private int watts;

	@OneToMany(mappedBy = "usina", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("usina")
    private List<Modulos> modulos;

	public Usina() {
		
	}
	
	public List<Modulos> getModulos() {
		return modulos;
	}


	public void setModulos(List<Modulos> modulos) {
		this.modulos = modulos;
	}

	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	public boolean getStatus() {
		return status;
	}
	
	
	
	public void setWatts(int watts) {
		this.watts = watts;
	}
	public int getWatts() {
		return watts;
	}
	
	
}
