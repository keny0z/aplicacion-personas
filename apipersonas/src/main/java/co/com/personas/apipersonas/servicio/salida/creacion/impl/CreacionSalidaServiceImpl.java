package co.com.personas.apipersonas.servicio.salida.creacion.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.personas.apipersonas.model.Salida;
import co.com.personas.apipersonas.repository.SalidaRepository;
import co.com.personas.apipersonas.servicio.salida.creacion.CreacionSalidaService;

@Service
public class CreacionSalidaServiceImpl implements CreacionSalidaService {

	@Autowired
	private SalidaRepository salidadaRepository;

	@Override
	public Integer ejecutar(Salida salida) {
		salidadaRepository.save(salida);
		return salida.getIdSalida();
	}
}
