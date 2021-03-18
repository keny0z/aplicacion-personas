package co.com.personas.apipersonas.servicio.tipodocumento.consulta.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.personas.apipersonas.model.TipoDocumento;
import co.com.personas.apipersonas.repository.TipoDocumentoRepository;
import co.com.personas.apipersonas.servicio.tipodocumento.consulta.ConsultaTipoDocumentoService;

@Service
public class ConsultaTipoDocumentoServiceImpl implements ConsultaTipoDocumentoService{
	
	@Autowired
	private TipoDocumentoRepository tipoDocumentoRepository;

	@Override
	public Iterable<TipoDocumento> findAll() {
		return tipoDocumentoRepository.findAll();
	}

}
