package com.devsuperior.userdept.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name="tb_modulo")
public class Modulo {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private int watts;
	private String serie;
	
	@ManyToOne
	@JoinColumn(name="usina_id")
	@JsonIgnoreProperties("modulos")
	private Usina usina;
	
	public Modulo() {
		
	}
	
	
	public String getSerie() {
		return serie;
	}


	public void setSerie(String serie) {
		this.serie = serie;
	}

	public Usina getUsina() {
		return usina;
	}
	public void setUsina(Usina usina) {
		this.usina = usina;
	}
	
	public long getId() {
		return id;
	}
	public void setId(short id) {
		this.id = id;
	}
	public int getWatts() {
		return watts;
	}
	public void setWatts(int watts) {
		this.watts = watts;
	}
	
}
