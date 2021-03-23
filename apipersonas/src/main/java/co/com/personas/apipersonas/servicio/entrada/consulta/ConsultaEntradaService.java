package co.com.personas.apipersonas.servicio.entrada.consulta;

import co.com.personas.apipersonas.model.Entrada;

public interface ConsultaEntradaService {

	Iterable<Entrada> findAll();

	Entrada findById(Integer idEntrada);
}
