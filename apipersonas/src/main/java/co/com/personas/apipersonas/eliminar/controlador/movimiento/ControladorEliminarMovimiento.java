package co.com.personas.apipersonas.eliminar.controlador.movimiento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.personas.apipersonas.aplicacion.ComandoRespuesta;
import co.com.personas.apipersonas.eliminar.manejador.movimiento.eliminar.ManejadorEliminarMovimiento;
import io.swagger.annotations.Api;

@Api(tags="Eliminar movimiento")
@RestController
@RequestMapping("/v1/movimiento")
public class ControladorEliminarMovimiento {

	@Autowired
	private ManejadorEliminarMovimiento manejadorEliminarMovimiento;

	@DeleteMapping("/{idMovimiento}")
	public ComandoRespuesta<Integer> eliminar(@PathVariable Integer idMovimiento) {

		return manejadorEliminarMovimiento.ejecutar(idMovimiento);
	}
}
