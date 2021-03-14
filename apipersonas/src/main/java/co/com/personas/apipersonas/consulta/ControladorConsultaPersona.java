package co.com.personas.apipersonas.consulta;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.personas.apipersonas.consulta.service.PersonaService;
import co.com.personas.apipersonas.model.Persona;

@RequestMapping("/v1/persona")
public class ControladorConsultaPersona {

	@Autowired
	private PersonaService personaService;

	
	List<Persona> findAll() {
		return personaService.findAll;
	}
}
