package co.com.personas.apipersonas.eliminar.controlador.persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.personas.apipersonas.aplicacion.ComandoRespuesta;
import co.com.personas.apipersonas.eliminar.manejador.persona.eliminar.ManejadorEliminarPersona;
import io.swagger.annotations.Api;

@Api(tags="Eliminar persona")
@RestController
@RequestMapping("/v1/persona")
public class ControladorEliminarPersona {

	@Autowired
	private ManejadorEliminarPersona manejadorEliminarPersona;

	@DeleteMapping("/{idPersona}")
	public ComandoRespuesta<Integer> eliminar(@PathVariable Integer idPersona) {

		return manejadorEliminarPersona.ejecutar(idPersona);
	}

}