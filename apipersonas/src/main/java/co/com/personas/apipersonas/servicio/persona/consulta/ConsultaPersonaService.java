package co.com.personas.apipersonas.servicio.persona.consulta;

import co.com.personas.apipersonas.model.Persona;
import co.com.personas.apipersonas.model.TipoDocumento;

public interface ConsultaPersonaService {


	Iterable<Persona> findAll();

	Persona findById(Integer idPersona);
	
	
	
	//Persona buscarPorDocumento(String numeroDocumento);
	
	

}
