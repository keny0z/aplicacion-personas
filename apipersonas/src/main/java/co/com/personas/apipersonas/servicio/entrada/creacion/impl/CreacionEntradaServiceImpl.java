package co.com.personas.apipersonas.servicio.entrada.creacion.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.personas.apipersonas.model.Entrada;
import co.com.personas.apipersonas.repository.EntradaRepository;
import co.com.personas.apipersonas.servicio.entrada.creacion.CreacionEntradaService;

@Service
public class CreacionEntradaServiceImpl implements CreacionEntradaService{
	
	@Autowired
	private EntradaRepository entradaRepository;

	@Override
	public Integer ejecutar(Entrada entrada) {
		entradaRepository.save(entrada);
		return entrada.getIdEntrada();
	}

}
