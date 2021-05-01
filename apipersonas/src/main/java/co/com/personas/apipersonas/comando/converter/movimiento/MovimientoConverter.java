package co.com.personas.apipersonas.comando.converter.movimiento;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.personas.apipersonas.comando.dto.movimiento.MovimientoDTO;
import co.com.personas.apipersonas.dominio.ValidadorArgumento;
import co.com.personas.apipersonas.model.Movimiento;
import co.com.personas.apipersonas.model.Persona;
import co.com.personas.apipersonas.model.TipoMovimiento;
import co.com.personas.apipersonas.servicio.movimiento.consulta.ConsultaMovimientoService;
import co.com.personas.apipersonas.servicio.persona.consulta.ConsultaPersonaService;

@Component
public class MovimientoConverter {

	@Autowired
	private ConsultaPersonaService consultaPersonaService;

	@Autowired
	private ConsultaMovimientoService consultaMovimientoService;
	
	private static final String EL_ID_NO_ES_VALIDO = "El id no es valido";

	public Movimiento crear(MovimientoDTO movimientoDto) {

		Movimiento movimiento = new Movimiento();
		TipoMovimiento tipoMovimiento = new TipoMovimiento();

		Persona persona = consultaPersonaService.findById(movimientoDto.getIdpersona());
		Integer tiempo = 0;

		movimiento.setFecha(movimientoDto.getFecha());
		movimiento.setPersona(persona);



		ArrayList<Movimiento> listaMovimientosAnteriores = buscarMovimientosAnteriores(persona.getIdPersona());

		if (listaMovimientosAnteriores.isEmpty()) { //si la persona no ha realizado movimientos antes, su primer movimiento sera una entrada
			tipoMovimiento.setIdTipoMovimiento(1);
		} else {
			Movimiento ultimoMovimiento = buscarUltimoMovimiento(listaMovimientosAnteriores); //se busca el movimiento mas reciente de la persona, para saber si este fue una entrada o una salida
			if (ultimoMovimiento.getTipoMovimiento().getIdTipoMovimiento().equals(1)) { //si el ultimo movimiento fue una entrada, se crea el nuevo movimiento como una salida
				tipoMovimiento.setIdTipoMovimiento(2);
				tiempo = (int) TimeUnit.MILLISECONDS
						.toMinutes(movimiento.getFecha().getTime() - ultimoMovimiento.getFecha().getTime()); //se calcula el tiempo en minutos que transcurrio entre la entrada y la salida
			} else { //si el ultimo movimiento fue una salida, se crea el nuevo movimiento como una entrada
				tipoMovimiento.setIdTipoMovimiento(1);
			}
		}

		movimiento.setTipoMovimiento(tipoMovimiento);

		movimiento.setTiempo(tiempo); 

		return movimiento;
	}
	
	public Movimiento eliminar(Integer idMovimiento) {

		ValidadorArgumento.validarPositivo(idMovimiento, EL_ID_NO_ES_VALIDO);
		Movimiento movimiento = new Movimiento();
		movimiento.setIdMovimiento(idMovimiento);
		return movimiento;

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

	//metodo encargado de seleccionar el movimiento mas reciente entre todos los movimientos realizados anteriormente 
	public Movimiento buscarUltimoMovimiento(ArrayList<Movimiento> listaMovimientosAnteriores) {
		Movimiento ultimoMovimiento = listaMovimientosAnteriores.get(0);
		for (Movimiento movimiento : listaMovimientosAnteriores) {
			if (movimiento.getFecha().after(ultimoMovimiento.getFecha())) {
				ultimoMovimiento = movimiento;
			}
		}
		return ultimoMovimiento;
	}



}
