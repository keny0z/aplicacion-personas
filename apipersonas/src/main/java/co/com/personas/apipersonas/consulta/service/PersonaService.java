package co.com.personas.apipersonas.consulta.service;

import java.util.List;

import co.com.personas.apipersonas.model.Persona;

public interface PersonaService {


	List<Persona> findAll();

	Persona findById(Integer idPersona);

}
