package co.com.personas.apipersonas.comando.controlador.persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.personas.apipersonas.aplicacion.ComandoRespuesta;
import co.com.personas.apipersonas.comando.dto.persona.PersonaDTO;
import co.com.personas.apipersonas.comando.manejador.persona.crear.ManejadorCrearPersona;
import io.swagger.annotations.Api;

@Api(tags="Crear Persona")
@RestController
@RequestMapping("/v1/persona")
@CrossOrigin(origins = "*", methods= {RequestMethod.POST})
public class ControladorComandoPersona {
	
	@Autowired
	private ManejadorCrearPersona manejadorCrearPersona;
	
	@PostMapping
	public ComandoRespuesta<Integer> insertar(@RequestBody PersonaDTO personaDto) {
		return manejadorCrearPersona.ejecutar(personaDto);
	}

}
