package co.com.personas.apipersonas.servicio.movimiento.eliminar.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.personas.apipersonas.model.Movimiento;
import co.com.personas.apipersonas.repository.MovimientoRepository;
import co.com.personas.apipersonas.servicio.movimiento.eliminar.EliminarMovimientoService;

@Service
public class EliminarMovimientoServiceImpl implements EliminarMovimientoService {

	@Autowired
	private MovimientoRepository movimientoRepository;

	@Override
	public Integer ejecutar(Movimiento movimiento) {
		movimientoRepository.delete(movimiento);
		return movimiento.getIdMovimiento();
	}

}
