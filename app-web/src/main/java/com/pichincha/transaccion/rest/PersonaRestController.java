/*
* Copyright (c) 2021.
*
* Superintendencia de Econom&iacute;a Popular y Solidaria
* Todos los derechos reservados
*/

package com.pichincha.transaccion.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pichincha.transaccion.api.service.IPersonaService;
import com.pichincha.transaccion.core.domain.Persona;
import com.pichincha.transaccion.core.vo.PersonaVo;
import com.pichincha.transaccion.exception.PichinchaTransaccionException;

import ec.gob.ec.core.util.rest.EndPointPrefix;
import lombok.extern.slf4j.Slf4j;

/**
 * @author <a href="mailto:patedwins@gmail.com">Patricio Peñaloza</a>
 */
@Slf4j
@RestController
@RequestMapping("/api/Persona")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PersonaRestController {

	@Autowired
	private final transient IPersonaService personaService;
	public static final String MENSAJE_ERROR = "No se encontró datos.";

	public PersonaRestController(IPersonaService personaService) {
		this.personaService = personaService;
	}

	@PostMapping(value = EndPointPrefix.crear, produces = { MimeTypeUtils.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Persona crearCrtCargaEstructura(@RequestBody Persona persona) {
		// personaService.crearCrtCargaEstructura(persona);
		return persona;
	}

	@PostMapping(value = EndPointPrefix.actualizar, produces = { MimeTypeUtils.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Persona actualizarCrtCargaEstructura(@RequestBody Persona persona) {
		// crtCargaEstructuraService.actualizarCrtCargaEstructura(crtCargaEstructura);
		return persona;
	}

	@PostMapping(value = EndPointPrefix.obtenerPorId, produces = { MimeTypeUtils.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Optional<Persona> buscarCrtCargaEstructura(@RequestParam Integer persona) {
		return null;
	}

	@GetMapping(value = EndPointPrefix.obtenerLista, produces = { MimeTypeUtils.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<Persona> obtenerPersonaLista() {
		List<Persona> listaPersona;
		try {
			listaPersona = personaService.buscarListaPersona();
			return listaPersona;
		} catch (PichinchaTransaccionException e) {
			return null;
		}
	}

	@GetMapping("/all")
	@ResponseBody
	public ResponseEntity<Object> obtenerListaCargaEstructuraOrgFechaCorteEstructura() {
		try {
			List<PersonaVo> listaPersona = null;// personaService.buscarListaPersona();
			System.out.println(listaPersona.size());
			if (!listaPersona.isEmpty()) {
				return ResponseEntity.status(HttpStatus.OK).body(listaPersona);
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(MENSAJE_ERROR);
			}

		} catch (PichinchaTransaccionException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}
}