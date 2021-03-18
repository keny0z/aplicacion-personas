package co.com.personas.apipersonas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tipodocumento")
@Data
@NoArgsConstructor
public class TipoDocumento {

	@Id
	@Column(name="idtipodocumento")
	private Integer idTipoDocumento;
	@Column(name="nombredocumento")
	private String nombreDocumento;
}
