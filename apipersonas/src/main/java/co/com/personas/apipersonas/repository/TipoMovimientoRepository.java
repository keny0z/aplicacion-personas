package co.com.personas.apipersonas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.com.personas.apipersonas.model.TipoMovimiento;

@Repository
public interface TipoMovimientoRepository extends CrudRepository<TipoMovimiento, Integer> {

}
