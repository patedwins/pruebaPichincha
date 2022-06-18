/*
* Copyright (c) 2021.
*
* Superintendencia de Econom&iacute;a Popular y Solidaria
* Todos los derechos reservados
*/

package com.pichincha.transaccion.api.service;

import java.util.List;
import java.util.Optional;

import com.pichincha.transaccion.core.domain.Persona;
import com.pichincha.transaccion.exception.PichinchaTransaccionException;

/**
 * @author <a href="mailto:patedwins@gmail.com">Patricio Peñaloza</a>
 */
public interface IPersonaService {

	Optional<Persona> buscarPersona(Integer codPersona);

	List<Persona> buscarListaPersona() throws PichinchaTransaccionException;

	void crearPersona(Persona persona);

	void actualizarPersona(Persona persona);

}