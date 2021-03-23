package co.com.personas.apipersonas.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.com.personas.apipersonas.model.Persona;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Integer>{

	

	
}
