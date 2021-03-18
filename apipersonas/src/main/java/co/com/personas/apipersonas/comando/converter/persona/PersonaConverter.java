package co.com.personas.apipersonas.comando.converter.persona;

import org.springframework.stereotype.Component;

import co.com.personas.apipersonas.comando.dto.persona.PersonaDTO;
import co.com.personas.apipersonas.dominio.ValidadorArgumento;
import co.com.personas.apipersonas.model.Persona;
import co.com.personas.apipersonas.model.TipoDocumento;

@Component
public class PersonaConverter {

	private static final String EL_ID_NO_ES_VALIDO = "El id no es valido";
	private static final String EL_NUMERO_DE_DOCUMENTO_DE_LA_PERSONA_ES_UN_DATO_OBLIGATORIO = "El número de documento de la persona es un dato obligatorio";
	private static final String EL_TIPO_DE_DOCUMENTO_DE_LA_PERSONA_ES_UN_DATO_OBLIGATORIO = "El tipo de documento de la persona es un dato obligatorio";
	private static final String EL_NOMBRE_DE_LA_PERSONA_ES_UN_DATO_OBLIGATORIO = "El nombre de la persona es un dato obligatorio";
	private static final String EL_APELLIDO_DE_LA_PERSONA_ES_UN_DATO_OBLIGATORIO = "El apellido de la persona es un dato obligatorio";

	public Persona crear(PersonaDTO personaDto) {
		Persona persona = new Persona();
		TipoDocumento tipoDocumento = new TipoDocumento();

		ValidadorArgumento.validarObligatorio(personaDto.getNombres(), EL_NOMBRE_DE_LA_PERSONA_ES_UN_DATO_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(personaDto.getApellidos(),
				EL_APELLIDO_DE_LA_PERSONA_ES_UN_DATO_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(personaDto.getIdTipoDocumento(),
				EL_TIPO_DE_DOCUMENTO_DE_LA_PERSONA_ES_UN_DATO_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(personaDto.getNumeroDocumento(),
				EL_NUMERO_DE_DOCUMENTO_DE_LA_PERSONA_ES_UN_DATO_OBLIGATORIO);

		persona.setNombres(personaDto.getNombres());
		persona.setApellidos(personaDto.getApellidos());

		tipoDocumento.setIdTipoDocumento(personaDto.getIdTipoDocumento());
		persona.setTipoDocumento(tipoDocumento);

		persona.setNumeroDocumento(personaDto.getNumeroDocumento());

		return persona;

	}

	public Persona eliminar(Integer idPersona) {

		ValidadorArgumento.validarPositivo(idPersona, EL_ID_NO_ES_VALIDO);
		Persona persona = new Persona();
		persona.setIdPersona(idPersona);
		return persona;

	}

	public Persona actualizar(PersonaDTO personaDto) {

		Persona persona = new Persona();
		TipoDocumento tipoDocumento = new TipoDocumento();

		ValidadorArgumento.validarPositivo(personaDto.getIdPersona(), EL_ID_NO_ES_VALIDO);
		ValidadorArgumento.validarObligatorio(personaDto.getNombres(), EL_NOMBRE_DE_LA_PERSONA_ES_UN_DATO_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(personaDto.getApellidos(),
				EL_APELLIDO_DE_LA_PERSONA_ES_UN_DATO_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(personaDto.getIdTipoDocumento(),
				EL_TIPO_DE_DOCUMENTO_DE_LA_PERSONA_ES_UN_DATO_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(personaDto.getNumeroDocumento(),
				EL_NUMERO_DE_DOCUMENTO_DE_LA_PERSONA_ES_UN_DATO_OBLIGATORIO);

		persona.setIdPersona(personaDto.getIdPersona());
		tipoDocumento.setIdTipoDocumento(personaDto.getIdTipoDocumento());
		persona.setTipoDocumento(tipoDocumento);
		persona.setNumeroDocumento(personaDto.getNumeroDocumento());
		persona.setNombres(personaDto.getNombres());
		persona.setApellidos(personaDto.getApellidos());

		return persona;

	}

}
