package co.com.personas.apipersonas.servicio.tipodocumento.consulta;

import co.com.personas.apipersonas.model.TipoDocumento;

public interface ConsultaTipoDocumentoService {

	Iterable<TipoDocumento> findAll();

}
