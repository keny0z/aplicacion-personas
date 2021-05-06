package co.com.personas.apipersonas.consulta.controlador.salida;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.personas.apipersonas.model.Salida;
import co.com.personas.apipersonas.servicio.salida.consulta.ConsultaSalidaService;
import io.swagger.annotations.Api;

@Api(tags="Consultar salida")
@RestController
@RequestMapping("/v1/salida")
public class ControladorConsultaSalida {

	@Autowired
	private ConsultaSalidaService salidaService;


	@GetMapping
	Iterable<Salida> findAll() {
		return salidaService.findAll();
	}
	
	
	@GetMapping("/{idSalida}")
	Salida findById(@PathVariable("idSalida") Integer idSalida) {
		return salidaService.findById(idSalida);
	}
}
