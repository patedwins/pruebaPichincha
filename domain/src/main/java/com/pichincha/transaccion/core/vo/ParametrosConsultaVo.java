package com.pichincha.transaccion.core.vo;

public class ParametrosConsultaVo {
	
	private Long codOrganizacion;
	private String fechaCorteInicio;
	private String fechaCorteFin;
	private String nemonicoEstructura;
	private String estadoRegistro;
	private String estadoValidacion;
	
	public ParametrosConsultaVo() {
		//Constructor de la CLase		
	}

	public Long getCodOrganizacion() {
		return codOrganizacion;
	}

	public void setCodOrganizacion(Long codOrganizacion) {
		this.codOrganizacion = codOrganizacion;
	}

	public String getFechaCorteInicio() {
		return fechaCorteInicio;
	}

	public void setFechaCorteInicio(String fechaCorteInicio) {
		this.fechaCorteInicio = fechaCorteInicio;
	}

	public String getFechaCorteFin() {
		return fechaCorteFin;
	}

	public void setFechaCorteFin(String fechaCorteFin) {
		this.fechaCorteFin = fechaCorteFin;
	}

	public String getNemonicoEstructura() {
		return nemonicoEstructura;
	}

	public void setNemonicoEstructura(String nemonicoEstructura) {
		this.nemonicoEstructura = nemonicoEstructura;
	}

	public String getEstadoRegistro() {
		return estadoRegistro;
	}

	public void setEstadoRegistro(String estadoRegistro) {
		this.estadoRegistro = estadoRegistro;
	}

	public String getEstadoValidacion() {
		return estadoValidacion;
	}

	public void setEstadoValidacion(String estadoValidacion) {
		this.estadoValidacion = estadoValidacion;
	}


}
