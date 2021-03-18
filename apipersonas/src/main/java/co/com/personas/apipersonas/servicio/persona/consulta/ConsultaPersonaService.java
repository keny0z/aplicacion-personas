package co.com.personas.apipersonas.servicio.persona.consulta;

import co.com.personas.apipersonas.model.Persona;

public interface ConsultaPersonaService {


	Iterable<Persona> findAll();

	Persona findById(Integer idPersona);

}
