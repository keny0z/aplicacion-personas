package co.com.personas.apipersonas.servicio.tipomovimiento.consulta.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.personas.apipersonas.model.TipoMovimiento;
import co.com.personas.apipersonas.repository.TipoMovimientoRepository;
import co.com.personas.apipersonas.servicio.tipomovimiento.consulta.ConsultaTipoMovimientoService;

@Service
public class ConsultaTipoMovimientoServiceImpl implements ConsultaTipoMovimientoService {
	
	@Autowired
	private TipoMovimientoRepository tipoMovimientoRepository;

	@Override
	public Iterable<TipoMovimiento> findAll() {
		return tipoMovimientoRepository.findAll();
	}

}
