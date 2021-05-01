package co.com.personas.apipersonas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tipomovimiento")
@Data
@NoArgsConstructor
public class TipoMovimiento {

	@Id
	@Column(name="idtipomovimiento")
	private Integer idTipoMovimiento;
	@Column(name="nombremovimiento")
	private String nombreMovimiento;
}
