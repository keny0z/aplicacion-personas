package co.com.personas.apipersonas.consulta;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.personas.apipersonas.consulta.service.PersonaService;
import co.com.personas.apipersonas.model.Persona;

@RestController
@RequestMapping("/v1/persona")
public class ControladorConsultaPersona {

	@Autowired
	private PersonaService personaService;


	@GetMapping
	List<Persona> findAll() {
		return personaService.findAll();
	}
	
	@GetMapping("/{idPersona}")
	Persona findById(@PathVariable("idPersona") Integer idPersona) {
		return personaService.findById(idPersona);
	}
}
