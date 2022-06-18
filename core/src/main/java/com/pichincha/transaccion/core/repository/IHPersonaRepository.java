/*
* Copyright (c) 2021.
*
* Superintendencia de Econom&iacute;a Popular y Solidaria
* Todos los derechos reservados
*/

package com.pichincha.transaccion.core.repository;

import java.util.List;

import com.pichincha.transaccion.core.vo.PersonaVo;
import com.pichincha.transaccion.exception.PichinchaTransaccionException;

/**
 * @author <a href="mailto:maniac787@gmail.com">Roberto Chasipanta</a>
 */
public interface IHPersonaRepository {

	public List<PersonaVo> buscarListaPersona() throws PichinchaTransaccionException;

}