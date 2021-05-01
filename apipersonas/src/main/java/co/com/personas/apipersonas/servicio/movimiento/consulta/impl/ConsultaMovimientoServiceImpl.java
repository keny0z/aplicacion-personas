package co.com.personas.apipersonas.servicio.movimiento.consulta.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.personas.apipersonas.model.Movimiento;
import co.com.personas.apipersonas.repository.MovimientoRepository;
import co.com.personas.apipersonas.servicio.movimiento.consulta.ConsultaMovimientoService;

@Service
public class ConsultaMovimientoServiceImpl implements ConsultaMovimientoService  {

	
	@Autowired
	private MovimientoRepository movimientoRepository;
	
	@Override
	public Iterable<Movimiento> findAll() {
		return movimientoRepository.findAll();
	}

	@Override
	public Movimiento findById(Integer idMovimiento) {
		return movimientoRepository.findById(idMovimiento).orElse(null);
	}

}
