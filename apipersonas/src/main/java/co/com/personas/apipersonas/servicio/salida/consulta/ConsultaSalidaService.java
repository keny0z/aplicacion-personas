package co.com.personas.apipersonas.servicio.salida.consulta;

import co.com.personas.apipersonas.model.Salida;

public interface ConsultaSalidaService {

	Iterable<Salida> findAll();

	Salida findById(Integer idSalida);
}
