package co.com.personas.apipersonas.comando.converter.salida;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.personas.apipersonas.comando.dto.salida.SalidaDTO;
import co.com.personas.apipersonas.model.Entrada;
import co.com.personas.apipersonas.model.Persona;
import co.com.personas.apipersonas.model.Salida;
import co.com.personas.apipersonas.servicio.entrada.consulta.ConsultaEntradaService;

@Component
public class SalidaConverter {

	@Autowired
	private ConsultaEntradaService consultaEntradaService;

	public Salida crear(SalidaDTO salidaDto) {

		Entrada entrada = consultaEntradaService.findById(salidaDto.getIdEntrada());
		Salida salida = new Salida();
		Persona persona = new Persona();

		salida.setSalida(salidaDto.getSalida());
		persona.setIdPersona(salidaDto.getIdpersona());
		salida.setPersona(persona);
		salida.setEntrada(entrada);
		Integer minutos = (int) TimeUnit.MILLISECONDS.toMinutes(salida.getSalida().getTime()-salida.getEntrada().getEntrada().getTime());
		salida.setTiempo(minutos);

		return salida;

	}

}
