/*
* Copyright (c) 2021.
*
* Superintendencia de Econom&iacute;a Popular y Solidaria
* Todos los derechos reservados
*/

package com.pichincha.transaccion.api.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pichincha.transaccion.api.service.IPersonaService;
import com.pichincha.transaccion.core.domain.Persona;
import com.pichincha.transaccion.core.repository.IHPersonaRepository;
import com.pichincha.transaccion.core.repository.IPersonaRepository;
import com.pichincha.transaccion.exception.PichinchaTransaccionException;

import lombok.extern.slf4j.Slf4j;

/**
 * @author <a href="mailto:patedwins@gmail.com">Patricio Peñaloza</a>
 */
@Service
@Slf4j
@Transactional
public class PersonaImpl implements IPersonaService {

	@Autowired
	private final transient IHPersonaRepository hPersonaRepository;
	@Autowired
	private final transient IPersonaRepository personaRepository;

	public PersonaImpl(IHPersonaRepository hPersonaRepository, IPersonaRepository personaRepository) {
		this.hPersonaRepository = hPersonaRepository;
		this.personaRepository = personaRepository;
	}

	@Override
	public Optional<Persona> buscarPersona(Integer codPersona) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional(readOnly = true)
	@Autowired
	@Override
	public List<Persona> buscarListaPersona() throws PichinchaTransaccionException {
		return personaRepository.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public void crearPersona(Persona persona) {
		// TODO Auto-generated method stub

	}

	@Transactional(readOnly = true)
	@Override
	public void actualizarPersona(Persona persona) {
		// TODO Auto-generated method stub

	}
}