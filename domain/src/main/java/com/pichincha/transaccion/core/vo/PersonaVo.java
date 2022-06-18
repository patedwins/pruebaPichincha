package com.pichincha.transaccion.core.vo;

import java.math.BigDecimal;

public class PersonaVo {

	private BigDecimal codPersona;
	private String nombre;
	private String genero;
	private long edad;
	private String identificacion;
	private String direccion;
	private String telefono;

	public PersonaVo() {
		// Constructor de la CLase
	}

	public PersonaVo(BigDecimal codPersona, String nombre, String genero, long edad, String identificacion,
			String direccion, String telefono) {
		this.codPersona = codPersona;
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
		this.identificacion = identificacion;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public BigDecimal getCodPersona() {
		return codPersona;
	}

	public void setCodPersona(BigDecimal codPersona) {
		this.codPersona = codPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public long getEdad() {
		return edad;
	}

	public void setEdad(long edad) {
		this.edad = edad;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
