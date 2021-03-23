package co.com.personas.apipersonas.servicio.salida.consulta.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.personas.apipersonas.model.Salida;
import co.com.personas.apipersonas.repository.SalidaRepository;
import co.com.personas.apipersonas.servicio.salida.consulta.ConsultaSalidaService;

@Service
public class ConsultaSalidaServiceImpl implements ConsultaSalidaService  {
	
	@Autowired
	private SalidaRepository salidaRepository;

	@Override
	public Iterable<Salida> findAll() {
		return salidaRepository.findAll();
	}

	@Override
	public Salida findById(Integer idSalida) {
		return salidaRepository.findById(idSalida).orElse(null);
	}

}
