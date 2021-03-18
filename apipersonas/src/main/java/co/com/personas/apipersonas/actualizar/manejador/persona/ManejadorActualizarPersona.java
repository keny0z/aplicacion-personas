package co.com.personas.apipersonas.actualizar.manejador.persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.personas.apipersonas.aplicacion.ComandoRespuesta;
import co.com.personas.apipersonas.aplicacion.manejador.ManejadorComandoRespuesta;
import co.com.personas.apipersonas.comando.converter.persona.PersonaConverter;
import co.com.personas.apipersonas.comando.dto.persona.PersonaDTO;
import co.com.personas.apipersonas.servicio.persona.actualizar.ActualizarPersonaService;

@Component
public class ManejadorActualizarPersona implements ManejadorComandoRespuesta<PersonaDTO, ComandoRespuesta<Integer>> {

	@Autowired
	private ActualizarPersonaService actualizarPersonaService;
	
	@Autowired
	private PersonaConverter personaConverter;
	
	@Override
	public ComandoRespuesta<Integer> ejecutar(PersonaDTO personaDto) {
		
		return new ComandoRespuesta<Integer>(actualizarPersonaService.ejecutar(personaConverter.actualizar(personaDto)));
	}

	

}
