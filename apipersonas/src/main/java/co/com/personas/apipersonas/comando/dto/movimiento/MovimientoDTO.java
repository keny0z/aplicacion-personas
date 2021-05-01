package co.com.personas.apipersonas.comando.dto.movimiento;

import java.util.Date;

import lombok.Data;

@Data
public class MovimientoDTO {

	private Integer idMovimiento;
	private Integer idpersona;
	private Integer idTipoMovimiento;
	private Date fecha;
	private Integer tiempo;
}
