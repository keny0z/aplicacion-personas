package co.com.personas.apipersonas.servicio.persona.eliminar.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.personas.apipersonas.model.Persona;
import co.com.personas.apipersonas.repository.PersonaRepository;
import co.com.personas.apipersonas.servicio.persona.eliminar.EliminarPersonaService;

@Service
public class EliminarPersonaServiceImpl implements EliminarPersonaService {

	@Autowired
	private PersonaRepository personaRepository;

	@Override
	public Integer ejecutar(Persona persona) {
		personaRepository.delete(persona);
		return persona.getIdPersona();
	}

	

}
