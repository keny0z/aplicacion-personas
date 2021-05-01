package co.com.personas.apipersonas.servicio.tipomovimiento.consulta;

import co.com.personas.apipersonas.model.TipoMovimiento;

public interface ConsultaTipoMovimientoService {
	
	Iterable<TipoMovimiento> findAll();

}
