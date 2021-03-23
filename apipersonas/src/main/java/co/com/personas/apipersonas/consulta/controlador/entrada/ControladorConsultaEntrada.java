package co.com.personas.apipersonas.consulta.controlador.entrada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.personas.apipersonas.model.Entrada;
import co.com.personas.apipersonas.servicio.entrada.consulta.ConsultaEntradaService;
import io.swagger.annotations.Api;

@Api(tags="Consultar entrada")
@RestController
@RequestMapping("/v1/entrada")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET})
public class ControladorConsultaEntrada {

	@Autowired
	private ConsultaEntradaService entradaService;


	@GetMapping
	Iterable<Entrada> findAll() {
		return entradaService.findAll();
	}
	
	
	@GetMapping("/{idEntrada}")
	Entrada findById(@PathVariable("idEntrada") Integer idEntrada) {
		return entradaService.findById(idEntrada);
	}
}