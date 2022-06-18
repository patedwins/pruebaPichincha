/*
* Copyright (c) 2021.
*
* Superintendencia de Econom&iacute;a Popular y Solidaria
* Todos los derechos reservados
*/

package com.pichincha.transaccion.core.repository.Impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.pichincha.transaccion.core.domain.Persona;
import com.pichincha.transaccion.core.domain.Persona_;
import com.pichincha.transaccion.core.repository.IHPersonaRepository;
import com.pichincha.transaccion.core.vo.PersonaVo;
import com.pichincha.transaccion.exception.PichinchaTransaccionException;

/**
 * @author <a href="mailto:patedwins@gmail.com">Patricio Peñaloza</a>
 */
@Repository
public class HPersonaImpl implements IHPersonaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<PersonaVo> buscarListaPersona() throws PichinchaTransaccionException {
		List<PersonaVo> listaRespuesta = new ArrayList<PersonaVo>();
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<PersonaVo> criteriaQuery = cb.createQuery(PersonaVo.class);
		Root<Persona> rootCargaEstructura = criteriaQuery.from(Persona.class);
		criteriaQuery.select(cb.construct(PersonaVo.class, rootCargaEstructura.get(Persona_.COD_PERSONA),
				rootCargaEstructura.get(Persona_.NOMBRE), rootCargaEstructura.get(Persona_.GENERO),
				rootCargaEstructura.get(Persona_.EDAD), rootCargaEstructura.get(Persona_.IDENTIFICACION),
				rootCargaEstructura.get(Persona_.DIRECCION), rootCargaEstructura.get(Persona_.TELEFONO)));

		List<Predicate> predicates;
		// System.out.println(parametro.getCodOrganizacion());
		// System.out.println(parametro.getFechaCorteInicio());
		// predicates = new ArrayList<>();

		// criteriaQuery.where(predicates.toArray(new Predicate[] {}));

		listaRespuesta = (List<PersonaVo>) entityManager.createQuery(criteriaQuery).getResultList();
		return listaRespuesta;
	}
}