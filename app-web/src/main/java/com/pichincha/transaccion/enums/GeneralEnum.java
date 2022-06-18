package com.pichincha.transaccion.enums;

public enum GeneralEnum {
	PROCESADO_CORRECTO("PC"),
	ACTIVO("ACT"),
	PROESADO_ERROR("PE"),
	INACTIVO("INA");
	
	private String general;

	GeneralEnum(String general) {
		this.general = general;
	}

	public String getGeneral() {
		return this.general;
	}

}
