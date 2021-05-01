package co.com.personas.apipersonas.consulta.controlador.tipomovimiento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.personas.apipersonas.model.TipoMovimiento;
import co.com.personas.apipersonas.servicio.tipomovimiento.consulta.ConsultaTipoMovimientoService;
import io.swagger.annotations.Api;

@Api(tags="Consulta los diferentes tipos de movimientos")
@RestController
@RequestMapping("/v1/tipo-movimiento")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET})
public class ControladorTipoMovimiento {

	@Autowired
	private ConsultaTipoMovimientoService consultaTipoMovimientoService;
	
	@GetMapping
	Iterable<TipoMovimiento> findAll(){
		return consultaTipoMovimientoService.findAll();
	}
}
