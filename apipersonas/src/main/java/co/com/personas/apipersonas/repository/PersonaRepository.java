package co.com.personas.apipersonas.repository;

import java.util.List;

import co.com.personas.apipersonas.model.Persona;

public interface PersonaRepository {

	List<Persona> findAll();

	Persona findById(Integer idPersona);

}
