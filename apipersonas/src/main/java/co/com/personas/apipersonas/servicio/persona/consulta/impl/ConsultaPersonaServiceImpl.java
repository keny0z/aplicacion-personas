package co.com.personas.apipersonas.servicio.persona.consulta.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.personas.apipersonas.model.Persona;
import co.com.personas.apipersonas.model.TipoDocumento;
import co.com.personas.apipersonas.repository.PersonaRepository;
import co.com.personas.apipersonas.servicio.persona.consulta.ConsultaPersonaService;

@Service
public class ConsultaPersonaServiceImpl implements ConsultaPersonaService {

	@Autowired
	private PersonaRepository personaRepository;

	@Override
	public Iterable<Persona> findAll() {
		return personaRepository.findAll();
	}

	@Override
	public Persona findById(Integer idPersona) {
		return personaRepository.findById(idPersona).orElse(null);
	}

	

//	@Override
//	public Persona buscarPorDocumento(String numeroDocumento) {
//		String sentencia ="select tipodocume_.idtipodocumento, tipodocume_.nombredocumento as nombredo2_3_ from tipodocumento tipodocume_ where tipodocume_.idtipodocumento=?";
//		
//	}

}
