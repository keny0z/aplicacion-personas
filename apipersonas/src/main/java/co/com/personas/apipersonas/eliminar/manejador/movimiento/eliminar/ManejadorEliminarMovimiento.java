package co.com.personas.apipersonas.eliminar.manejador.movimiento.eliminar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.personas.apipersonas.aplicacion.ComandoRespuesta;
import co.com.personas.apipersonas.aplicacion.manejador.ManejadorComandoRespuesta;
import co.com.personas.apipersonas.comando.converter.movimiento.MovimientoConverter;
import co.com.personas.apipersonas.servicio.movimiento.eliminar.EliminarMovimientoService;

@Component
public class ManejadorEliminarMovimiento implements ManejadorComandoRespuesta<Integer, ComandoRespuesta<Integer>>{

	@Autowired
	private EliminarMovimientoService eliminarMovimientoService;
	
	@Autowired
	private MovimientoConverter movimientoConverter;
	
	@Override
	public ComandoRespuesta<Integer> ejecutar(Integer idMovimiento) {
		return new ComandoRespuesta<Integer>(eliminarMovimientoService.ejecutar(movimientoConverter.eliminar(idMovimiento)));
	}

}
