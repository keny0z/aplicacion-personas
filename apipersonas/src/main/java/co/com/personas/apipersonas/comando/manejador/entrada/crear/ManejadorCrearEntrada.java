package co.com.personas.apipersonas.comando.manejador.entrada.crear;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.personas.apipersonas.aplicacion.ComandoRespuesta;
import co.com.personas.apipersonas.aplicacion.manejador.ManejadorComandoRespuesta;
import co.com.personas.apipersonas.comando.converter.entrada.EntradaConverter;
import co.com.personas.apipersonas.comando.dto.entrada.EntradaDTO;
import co.com.personas.apipersonas.servicio.entrada.creacion.CreacionEntradaService;

@Component
public class ManejadorCrearEntrada implements ManejadorComandoRespuesta<EntradaDTO, ComandoRespuesta<Integer>>{

	@Autowired
	private CreacionEntradaService creacionEntradaService;
	
	@Autowired
	private EntradaConverter entradaConverter;

	@Override
	public ComandoRespuesta<Integer> ejecutar(EntradaDTO entradaDto) {
		return new ComandoRespuesta<Integer>(creacionEntradaService.ejecutar(entradaConverter.crear(entradaDto)));
	}

}
