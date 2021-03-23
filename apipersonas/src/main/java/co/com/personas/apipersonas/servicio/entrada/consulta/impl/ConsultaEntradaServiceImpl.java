package co.com.personas.apipersonas.servicio.entrada.consulta.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.personas.apipersonas.model.Entrada;
import co.com.personas.apipersonas.repository.EntradaRepository;
import co.com.personas.apipersonas.servicio.entrada.consulta.ConsultaEntradaService;

@Service
public class ConsultaEntradaServiceImpl implements ConsultaEntradaService{

	@Autowired
	private EntradaRepository entradaRepository;

	@Override
	public Iterable<Entrada> findAll() {
		return entradaRepository.findAll();
	}

	@Override
	public Entrada findById(Integer idEntrada) {
		return entradaRepository.findById(idEntrada).orElse(null);
	}
	
}
