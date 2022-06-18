/*
* Copyright (c) 2021.
*
* Superintendencia de Econom&iacute;a Popular y Solidaria
* Todos los derechos reservados
*/

package com.pichincha.transaccion.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pichincha.transaccion.core.domain.Persona;

/**
 * @author <a href="mailto:patedwins@gmail.com">Patricio Peñaloza</a>
 */
@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Integer> {

}