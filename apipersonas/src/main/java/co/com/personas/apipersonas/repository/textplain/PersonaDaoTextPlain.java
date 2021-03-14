package co.com.personas.apipersonas.repository.textplain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import co.com.personas.apipersonas.model.Persona;
import co.com.personas.apipersonas.repository.PersonaRepository;

@Repository
public class PersonaDaoTextPlain implements PersonaRepository{
	
	@Override
	public List<Persona> findAll(){
		List<Persona> personas= new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			personas.add(new Persona(i+1, "nombres "+i+1,"apellidos "+i+1))
		}
		return personas;
	}

}
