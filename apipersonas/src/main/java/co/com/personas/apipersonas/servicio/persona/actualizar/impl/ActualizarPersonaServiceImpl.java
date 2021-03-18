package co.com.personas.apipersonas.servicio.persona.actualizar.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.personas.apipersonas.model.Persona;
import co.com.personas.apipersonas.repository.PersonaRepository;
import co.com.personas.apipersonas.servicio.persona.actualizar.ActualizarPersonaService;

@Service
public class ActualizarPersonaServiceImpl implements ActualizarPersonaService {

	@Autowired
	private PersonaRepository personaRepository;

	@Override
	public Integer ejecutar(Persona persona) {
		personaRepository.save(persona);
		return persona.getIdPersona();
	}
	

	

}
