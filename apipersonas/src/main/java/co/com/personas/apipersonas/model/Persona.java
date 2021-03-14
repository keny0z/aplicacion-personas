package co.com.personas.apipersonas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Persona {

	private Integer idPersona;
	private String tipoDocumento;
	private String numeroDocumento;
	private String nombres;
	private String apellidos;

}
