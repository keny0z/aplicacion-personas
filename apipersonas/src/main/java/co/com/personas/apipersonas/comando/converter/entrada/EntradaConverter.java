package co.com.personas.apipersonas.comando.converter.entrada;

import org.springframework.stereotype.Component;

import co.com.personas.apipersonas.comando.dto.entrada.EntradaDTO;
import co.com.personas.apipersonas.model.Entrada;
import co.com.personas.apipersonas.model.Persona;

@Component
public class EntradaConverter {

	public Entrada crear(EntradaDTO entradaDto) {
		
		Entrada entrada= new Entrada();
		Persona persona= new Persona();
		
		entrada.setEntrada(entradaDto.getEntrada());
		persona.setIdPersona(entradaDto.getIdpersona());
		entrada.setPersona(persona);
		
		return entrada;
	}
}
