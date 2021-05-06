package co.com.personas.apipersonas.comando.controlador.movimiento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.personas.apipersonas.aplicacion.ComandoRespuesta;
import co.com.personas.apipersonas.comando.dto.movimiento.MovimientoDTO;
import co.com.personas.apipersonas.comando.manejador.movimiento.crear.ManejadorCrearMovimiento;
import io.swagger.annotations.Api;

@Api(tags="Registrar Movimiento")
@RestController
@RequestMapping("/v1/movimiento")
public class ControladorComandoMovimiento {

	@Autowired
	private ManejadorCrearMovimiento manejadorCrearMovimiento;
	
	@PostMapping
	public ComandoRespuesta<Integer> insertar(@RequestBody MovimientoDTO movimientoDto) {
		return manejadorCrearMovimiento.ejecutar(movimientoDto);
	}
}
