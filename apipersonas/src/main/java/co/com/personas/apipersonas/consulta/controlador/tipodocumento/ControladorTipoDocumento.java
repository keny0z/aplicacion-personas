package co.com.personas.apipersonas.consulta.controlador.tipodocumento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.personas.apipersonas.model.TipoDocumento;
import co.com.personas.apipersonas.servicio.tipodocumento.consulta.ConsultaTipoDocumentoService;
import io.swagger.annotations.Api;

@Api(tags="Consulta los diferentes tipos de documentos de identidad")
@RestController
@RequestMapping("/v1/tipo-documento")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET})
public class ControladorTipoDocumento {

	@Autowired
	private ConsultaTipoDocumentoService consultaTipoDocumentoService;
	
	@GetMapping
	Iterable<TipoDocumento> findAll(){
		return consultaTipoDocumentoService.findAll();
	}
}
