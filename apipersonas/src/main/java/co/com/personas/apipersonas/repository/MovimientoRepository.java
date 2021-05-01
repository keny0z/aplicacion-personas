package co.com.personas.apipersonas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.com.personas.apipersonas.model.Movimiento;

@Repository
public interface MovimientoRepository extends CrudRepository<Movimiento, Integer>{

}
