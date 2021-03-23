package co.com.personas.apipersonas.comando.manejador.salida.crear;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.personas.apipersonas.aplicacion.ComandoRespuesta;
import co.com.personas.apipersonas.aplicacion.manejador.ManejadorComandoRespuesta;
import co.com.personas.apipersonas.comando.converter.salida.SalidaConverter;
import co.com.personas.apipersonas.comando.dto.salida.SalidaDTO;
import co.com.personas.apipersonas.servicio.salida.creacion.CreacionSalidaService;

@Component
public class ManejadorCrearSalida implements ManejadorComandoRespuesta<SalidaDTO, ComandoRespuesta<Integer>> {

	@Autowired
	private CreacionSalidaService creacionSalidaService;
	
	@Autowired
	private SalidaConverter salidaConverter;

	@Override
	public ComandoRespuesta<Integer> ejecutar(SalidaDTO salidaDto) {
		return new ComandoRespuesta<Integer>(creacionSalidaService.ejecutar(salidaConverter.crear(salidaDto)));
	}
}
