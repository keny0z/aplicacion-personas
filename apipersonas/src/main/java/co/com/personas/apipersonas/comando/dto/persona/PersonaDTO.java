package co.com.personas.apipersonas.comando.dto.persona;

import lombok.Data;

@Data
public class PersonaDTO {

	private Integer idPersona;
	private Integer idTipoDocumento;
	private String numeroDocumento;
	private String nombres;  
	private String apellidos;
	
}
