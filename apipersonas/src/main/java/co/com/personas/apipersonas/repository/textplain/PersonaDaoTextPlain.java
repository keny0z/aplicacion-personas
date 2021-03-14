package co.com.personas.apipersonas.repository.textplain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import co.com.personas.apipersonas.model.Persona;
import co.com.personas.apipersonas.repository.PersonaRepository;

@Repository
public class PersonaDaoTextPlain implements PersonaRepository{

	@Override
	public List<Persona> findAll() {
		List<Persona> personas= new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			personas.add(new Persona(i+1, "tipoDocumento" +i, "numeroDocumento"+i, "nombres"+i, "apellidos"+i));
		}
		return personas;
	}

	@Override
	public Persona findById(Integer idPersona) {
		List<Persona> personas= findAll();
		Persona persona= null;
		for (Persona p : personas) {
			if (p.getIdPersona().equals(idPersona)) {
				persona=p;
				break;
			}
		}
		return persona;
	}
	
	

}
