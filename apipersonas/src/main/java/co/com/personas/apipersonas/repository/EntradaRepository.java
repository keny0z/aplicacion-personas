package co.com.personas.apipersonas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.com.personas.apipersonas.model.Entrada;

@Repository
public interface EntradaRepository extends CrudRepository<Entrada, Integer>{

}
