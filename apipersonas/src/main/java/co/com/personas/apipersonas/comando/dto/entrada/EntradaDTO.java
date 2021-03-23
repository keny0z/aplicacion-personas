package co.com.personas.apipersonas.comando.dto.entrada;

import java.util.Date;

import lombok.Data;

@Data
public class EntradaDTO {

	private Integer idEntrada;
	private Integer idpersona;
	private Date entrada;
}
