package co.com.personas.apipersonas.comando.dto.salida;

import java.util.Date;

import lombok.Data;

@Data
public class SalidaDTO {

	private Integer idSalida;
	private Integer idpersona;
	private Date salida;
	private Integer idEntrada;
	private Integer tiempo;
}