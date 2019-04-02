package com.project.base.projectBase.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Reniec", schema = "DataProject")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Reniec implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="IdReniec")
	private int codReniec;
	
	@Column(name="DocIdentidad")
	private String docIdentidad;
	
	@Column(name="ApPaterRazonSoc")
	private String apellidoPaterno;
	
	@Column(name="ApMateRazonSoc")
	private String ApellidoMaterno;
	
	@Column(name="FirstName")
	private String primerNombre;
	
	@Column(name="LastName")
	private String segundoNombre;
	
}
