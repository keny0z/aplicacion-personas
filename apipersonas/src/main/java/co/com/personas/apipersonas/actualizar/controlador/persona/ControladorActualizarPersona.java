package co.com.personas.apipersonas.actualizar.controlador.persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.personas.apipersonas.actualizar.manejador.persona.ManejadorActualizarPersona;
import co.com.personas.apipersonas.aplicacion.ComandoRespuesta;
import co.com.personas.apipersonas.comando.dto.persona.PersonaDTO;
import io.swagger.annotations.Api;

@Api(tags = "Actualizar persona")
@RestController
@RequestMapping("/v1/persona")
public class ControladorActualizarPersona {

	@Autowired
	private ManejadorActualizarPersona manejadorActualizarPersona;

	@Secured({"ROLE_ADMIN"})
	@PutMapping("/{idPersona}")
	public ComandoRespuesta<Integer> actualizar(@PathVariable Integer idPersona, @RequestBody PersonaDTO personaDto) {
		personaDto.setIdPersona(idPersona);
		return manejadorActualizarPersona.ejecutar(personaDto);

	}

}
