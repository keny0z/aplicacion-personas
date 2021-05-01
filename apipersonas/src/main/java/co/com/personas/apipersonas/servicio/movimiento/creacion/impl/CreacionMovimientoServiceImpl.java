package co.com.personas.apipersonas.servicio.movimiento.creacion.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.personas.apipersonas.model.Movimiento;
import co.com.personas.apipersonas.repository.MovimientoRepository;
import co.com.personas.apipersonas.servicio.movimiento.creacion.CreacionMovimientoService;

@Service
public class CreacionMovimientoServiceImpl implements CreacionMovimientoService{

	@Autowired
	private MovimientoRepository movimientoRepository;
	
	@Override
	public Integer ejecutar(Movimiento movimiento) {
		movimientoRepository.save(movimiento);
		return movimiento.getIdMovimiento();
	}

}
