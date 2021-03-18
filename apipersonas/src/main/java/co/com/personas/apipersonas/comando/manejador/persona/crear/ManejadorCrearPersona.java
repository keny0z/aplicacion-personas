package co.com.personas.apipersonas.comando.manejador.persona.crear;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.personas.apipersonas.aplicacion.ComandoRespuesta;
import co.com.personas.apipersonas.aplicacion.manejador.ManejadorComandoRespuesta;
import co.com.personas.apipersonas.comando.converter.persona.PersonaConverter;
import co.com.personas.apipersonas.comando.dto.persona.PersonaDTO;
import co.com.personas.apipersonas.servicio.persona.creacion.CreacionPersonaService;

@Component
public class ManejadorCrearPersona implements ManejadorComandoRespuesta<PersonaDTO, ComandoRespuesta<Integer>>{
	
	@Autowired
	private CreacionPersonaService creacionPersonaService;
	
	@Autowired
	private PersonaConverter personaConverter;

	@Override
	public ComandoRespuesta<Integer> ejecutar(PersonaDTO personaDto) {
		return new ComandoRespuesta<Integer>(creacionPersonaService.ejecutar(personaConverter.crear(personaDto)));
	}

}
