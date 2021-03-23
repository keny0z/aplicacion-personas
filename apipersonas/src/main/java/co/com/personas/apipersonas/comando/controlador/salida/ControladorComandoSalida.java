package co.com.personas.apipersonas.comando.controlador.salida;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.personas.apipersonas.aplicacion.ComandoRespuesta;
import co.com.personas.apipersonas.comando.dto.salida.SalidaDTO;
import co.com.personas.apipersonas.comando.manejador.salida.crear.ManejadorCrearSalida;
import io.swagger.annotations.Api;

@Api(tags="Registrar Salida")
@RestController
@RequestMapping("/v1/salida")
@CrossOrigin(origins = "*", methods= {RequestMethod.POST})
public class ControladorComandoSalida {

	@Autowired
	private ManejadorCrearSalida manejadorCrearSalida;
	
	@PostMapping
	public ComandoRespuesta<Integer> insertar(@RequestBody SalidaDTO salidaDto) {
		return manejadorCrearSalida.ejecutar(salidaDto);
	}
}