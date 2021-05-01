package co.com.personas.apipersonas.servicio.movimiento.consulta;

import co.com.personas.apipersonas.model.Movimiento;

public interface ConsultaMovimientoService {

	Iterable<Movimiento> findAll();

	Movimiento findById(Integer idMovimiento);
}
