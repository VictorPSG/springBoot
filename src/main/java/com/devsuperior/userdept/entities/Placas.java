package com.devsuperior.userdept.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="tb_placas")
public class Placas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@OneToOne
	@JoinColumn(name = "modulos_id")
	private Modulos modulos;
	
	private float tensao;
	private float corrente;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Modulos getModulos() {
		return modulos;
	}
	public void setModulos(Modulos modulos) {
		this.modulos = modulos;
	}
	public float getTensao() {
		return tensao;
	}
	public void setTensao(float tensao) {
		this.tensao = tensao;
	}
	public float getCorrente() {
		return corrente;
	}
	public void setCorrente(float corrente) {
		this.corrente = corrente;
	}
	

}
