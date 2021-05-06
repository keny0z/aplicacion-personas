package co.com.personas.apipersonas.consulta.controlador.movimiento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.personas.apipersonas.model.Movimiento;
import co.com.personas.apipersonas.servicio.movimiento.consulta.ConsultaMovimientoService;
import io.swagger.annotations.Api;

@Api(tags="Consultar movimiento")
@RestController
@RequestMapping("/v1/movimiento")
public class ControladorConsultaMovimiento {

	@Autowired
	private ConsultaMovimientoService movimientoService;


	@GetMapping
	Iterable<Movimiento> findAll() {
		return movimientoService.findAll();
	}
	
	
	@GetMapping("/{idEntrada}")
	Movimiento findById(@PathVariable("idMovimiento") Integer idMovimiento) {
		return movimientoService.findById(idMovimiento);
	}
	
}
