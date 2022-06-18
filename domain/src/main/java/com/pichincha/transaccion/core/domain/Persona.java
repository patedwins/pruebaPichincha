/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pichincha.transaccion.core.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

/**
 *
 * @author lchasipanta
 */
@Entity
@Table(name = "PERSONA")
@NamedQueries({ @NamedQuery(name = "Persona.findAll", query = "SELECT c FROM Persona c") })
@Data
public class Persona implements Serializable {

	private static final long serialVersionUID = 1L;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Id
	@Basic(optional = false)
	@Column(name = "COD_PERSONA")
	private BigDecimal codPersona;
	@Basic(optional = false)
	@Column(name = "NOMBRE")
	private String nombre;
	@Basic(optional = false)
	@Column(name = "GENERO")
	private String genero;
	@Basic(optional = false)
	@Column(name = "EDAD")
	private long edad;
	@Basic(optional = false)
	@Column(name = "IDENTIFICACION")
	private String identificacion;
	@Basic(optional = false)
	@Column(name = "DIRECCION")
	private String direccion;
	@Basic(optional = false)
	@Column(name = "TELEFONO")
	private String telefono;

	public Persona() {
	}

	public Persona(BigDecimal codPersona) {
		this.codPersona = codPersona;
	}

	public Persona(BigDecimal codPersona, String nombre, String genero, long edad, String identificacion,
			String direccion, String telefono) {
		this.codPersona = codPersona;
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
		this.identificacion = identificacion;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (codPersona != null ? codPersona.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Persona)) {
			return false;
		}
		Persona other = (Persona) object;
		if ((this.codPersona == null && other.codPersona != null)
				|| (this.codPersona != null && !this.codPersona.equals(other.codPersona))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.pichincha.transaccion.core.domain.Persona[ codPersona=" + codPersona + " ]";
	}

}
