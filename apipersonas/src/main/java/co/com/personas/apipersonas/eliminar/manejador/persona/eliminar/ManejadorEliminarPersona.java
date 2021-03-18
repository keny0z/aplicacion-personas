package co.com.personas.apipersonas.eliminar.manejador.persona.eliminar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.personas.apipersonas.aplicacion.ComandoRespuesta;
import co.com.personas.apipersonas.aplicacion.manejador.ManejadorComandoRespuesta;
import co.com.personas.apipersonas.comando.converter.persona.PersonaConverter;
import co.com.personas.apipersonas.servicio.persona.eliminar.EliminarPersonaService;

@Component
public class ManejadorEliminarPersona implements ManejadorComandoRespuesta<Integer, ComandoRespuesta<Integer>>{

	@Autowired
	private EliminarPersonaService eliminarPersonaService;
	
	@Autowired
	private PersonaConverter personaConverter;

	
	
	
	@Override
	public ComandoRespuesta<Integer> ejecutar(Integer idPersona) {
		return new ComandoRespuesta<Integer>(eliminarPersonaService.ejecutar(personaConverter.eliminar(idPersona)));
		
	}

}
