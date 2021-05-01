package co.com.personas.apipersonas.comando.manejador.movimiento.crear;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.personas.apipersonas.aplicacion.ComandoRespuesta;
import co.com.personas.apipersonas.aplicacion.manejador.ManejadorComandoRespuesta;
import co.com.personas.apipersonas.comando.converter.movimiento.MovimientoConverter;
import co.com.personas.apipersonas.comando.dto.movimiento.MovimientoDTO;
import co.com.personas.apipersonas.servicio.movimiento.creacion.CreacionMovimientoService;

@Component
public class ManejadorCrearMovimiento implements ManejadorComandoRespuesta<MovimientoDTO, ComandoRespuesta<Integer>> {

	@Autowired
	private CreacionMovimientoService creacionMovimientoService;
	
	@Autowired
	private MovimientoConverter movimientoConverter;
	
	@Override
	public ComandoRespuesta<Integer> ejecutar(MovimientoDTO movimientoDto) {
		return new ComandoRespuesta<Integer>(creacionMovimientoService.ejecutar(movimientoConverter.crear(movimientoDto)));
	}

}
