package co.com.personas.apipersonas.comando.controlador.entrada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.personas.apipersonas.aplicacion.ComandoRespuesta;
import co.com.personas.apipersonas.comando.dto.entrada.EntradaDTO;
import co.com.personas.apipersonas.comando.manejador.entrada.crear.ManejadorCrearEntrada;
import io.swagger.annotations.Api;

@Api(tags="Registrar Entrada")
@RestController
@RequestMapping("/v1/entrada")
@CrossOrigin(origins = "*", methods= {RequestMethod.POST})
public class ControladorComandoEntrada {

	@Autowired
	private ManejadorCrearEntrada manejadorCrearEntrada;
	
	@PostMapping
	public ComandoRespuesta<Integer> insertar(@RequestBody EntradaDTO entradaDto) {
		return manejadorCrearEntrada.ejecutar(entradaDto);
	}
}
