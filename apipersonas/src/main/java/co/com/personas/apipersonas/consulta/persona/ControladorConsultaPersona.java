package co.com.personas.apipersonas.consulta.persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.personas.apipersonas.model.Persona;
import co.com.personas.apipersonas.servicio.persona.consulta.ConsultaPersonaService;
import io.swagger.annotations.Api;

@Api(tags="Consultar persona")
@RestController
@RequestMapping("/v1/persona")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET})
public class ControladorConsultaPersona {

	@Autowired
	private ConsultaPersonaService personaService;


	@GetMapping
	Iterable<Persona> findAll() {
		return personaService.findAll();
	}
	
	@GetMapping("/{idPersona}")
	Persona findById(@PathVariable("idPersona") Integer idPersona) {
		return personaService.findById(idPersona);
	}
}
