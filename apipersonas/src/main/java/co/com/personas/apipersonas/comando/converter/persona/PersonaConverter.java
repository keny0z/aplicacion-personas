package co.com.personas.apipersonas.comando.converter.persona;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.personas.apipersonas.comando.dto.persona.PersonaDTO;
import co.com.personas.apipersonas.dominio.ValidadorArgumento;
import co.com.personas.apipersonas.eliminar.manejador.movimiento.eliminar.ManejadorEliminarMovimiento;
import co.com.personas.apipersonas.model.Movimiento;
import co.com.personas.apipersonas.model.Persona;
import co.com.personas.apipersonas.model.TipoDocumento;
import co.com.personas.apipersonas.servicio.movimiento.consulta.ConsultaMovimientoService;
import co.com.personas.apipersonas.servicio.persona.consulta.ConsultaPersonaService;

@Component
public class PersonaConverter {
	
	
	@Autowired
	private ManejadorEliminarMovimiento manejadorEliminarMovimiento;

	@Autowired
	private ConsultaPersonaService consultaPersonaService;
	
	@Autowired
	private ConsultaMovimientoService consultaMovimientoService;

	private static final String EL_TIPO_DE_DOCUMENTO_SELECCIONADO_NO_EXISTE = "el tipo de documento seleccionado no existe";
	private static final String EL_ID_NO_ES_VALIDO = "El id no es valido";
	private static final String EL_NUMERO_DE_DOCUMENTO_DE_LA_PERSONA_ES_UN_DATO_OBLIGATORIO = "El número de documento de la persona es un dato obligatorio";
	private static final String EL_TIPO_DE_DOCUMENTO_DE_LA_PERSONA_ES_UN_DATO_OBLIGATORIO = "El tipo de documento de la persona es un dato obligatorio";
	private static final String EL_NOMBRE_DE_LA_PERSONA_ES_UN_DATO_OBLIGATORIO = "El nombre de la persona es un dato obligatorio";
	private static final String EL_APELLIDO_DE_LA_PERSONA_ES_UN_DATO_OBLIGATORIO = "El apellido de la persona es un dato obligatorio";
	private static final String YA_EXISTE_UNA_PERSONA_CON_EL_MISMO_NUMERO_Y_TIPO_DE_DOCUMENTO = "ya existe una persona con el mismo numero y tipo de documento";

	public Persona crear(PersonaDTO personaDto) {
		Persona persona = new Persona();
		TipoDocumento tipoDocumento = new TipoDocumento();

		//validar que los datos no sean nulos
		
		ValidadorArgumento.validarObligatorio(personaDto.getIdTipoDocumento(),
				EL_TIPO_DE_DOCUMENTO_DE_LA_PERSONA_ES_UN_DATO_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(personaDto.getNumeroDocumento(),
				EL_NUMERO_DE_DOCUMENTO_DE_LA_PERSONA_ES_UN_DATO_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(personaDto.getNombres(), EL_NOMBRE_DE_LA_PERSONA_ES_UN_DATO_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(personaDto.getApellidos(),
				EL_APELLIDO_DE_LA_PERSONA_ES_UN_DATO_OBLIGATORIO);
		
		//validar que los datos no lleguen vacios
		
		ValidadorArgumento.validarNoVacio(personaDto.getIdTipoDocumento(),EL_TIPO_DE_DOCUMENTO_DE_LA_PERSONA_ES_UN_DATO_OBLIGATORIO);
		ValidadorArgumento.validarNoVacio(personaDto.getNumeroDocumento(), EL_NUMERO_DE_DOCUMENTO_DE_LA_PERSONA_ES_UN_DATO_OBLIGATORIO);
		ValidadorArgumento.validarNoVacio(personaDto.getNombres(), EL_NOMBRE_DE_LA_PERSONA_ES_UN_DATO_OBLIGATORIO);
		ValidadorArgumento.validarNoVacio(personaDto.getApellidos(), EL_APELLIDO_DE_LA_PERSONA_ES_UN_DATO_OBLIGATORIO);
		
		//validar que el tipo de documento exista
		
		ValidadorArgumento.validarNumerosPermitidos(personaDto.getIdTipoDocumento(), EL_TIPO_DE_DOCUMENTO_SELECCIONADO_NO_EXISTE);
		
		
		//validar que no exista una persona con el mismo tipo y numero de documento
		//ValidadorArgumento.validarStringsIguales(personaDto.getNumeroDocumento(), consultaPersonaService.findById(personaDto.getNumeroDocumento()).getNumeroDocumento(), YA_EXISTE_UNA_PERSONA_CON_EL_MISMO_NUMERO_DE_DOCUMENTO);
		Iterable<Persona> personas = consultaPersonaService.findAll();
		ValidadorArgumento.validarDocumentoUnico(personas, personaDto, YA_EXISTE_UNA_PERSONA_CON_EL_MISMO_NUMERO_Y_TIPO_DE_DOCUMENTO);
		
		
		

		
		tipoDocumento.setIdTipoDocumento(personaDto.getIdTipoDocumento());
		persona.setTipoDocumento(tipoDocumento);
		persona.setNumeroDocumento(personaDto.getNumeroDocumento());
		persona.setNombres(personaDto.getNombres());
		persona.setApellidos(personaDto.getApellidos());
		
		

		return persona;

	}

	public Persona eliminar(Integer idPersona) {
		ValidadorArgumento.validarPositivo(idPersona, EL_ID_NO_ES_VALIDO);
		Persona persona = new Persona();
		persona.setIdPersona(idPersona);
		ArrayList<Movimiento> listaMovimientosAnteriores = buscarMovimientosAnteriores(persona.getIdPersona());
		
		if (!listaMovimientosAnteriores.isEmpty()) { 
			for (Movimiento movimiento : listaMovimientosAnteriores) {
				manejadorEliminarMovimiento.ejecutar(movimiento.getIdMovimiento());
			}
		} 

		return persona;

	}
	
//	public Movimiento eliminarMovimiento(Integer idMovimiento) {
//
//		ValidadorArgumento.validarPositivo(idMovimiento, EL_ID_NO_ES_VALIDO);
//		Movimiento movimiento = new Movimiento();
//		movimiento.setIdMovimiento(idMovimiento);
//		return movimiento;
//		
//
//	}

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
	
	//metodo encargado de buscar todos los movimientos que la persona haya realizado anteriormente
	public ArrayList<Movimiento> buscarMovimientosAnteriores(Integer idPersona) {
		ArrayList<Movimiento> listaMovimientosAnteriores = new ArrayList<>();
		for (Movimiento movimiento : consultaMovimientoService.findAll()) {
			if (movimiento.getPersona().getIdPersona().equals(idPersona)) {
				listaMovimientosAnteriores.add(movimiento);
			}
		}
		return listaMovimientosAnteriores;
	}

}
