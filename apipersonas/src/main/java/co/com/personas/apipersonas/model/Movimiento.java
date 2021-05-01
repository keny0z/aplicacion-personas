package co.com.personas.apipersonas.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "movimiento")
@Data
@NoArgsConstructor
public class Movimiento {

	@Id
	@GeneratedValue
	@Column(name = "idmovimiento")
	private Integer idMovimiento;

	@ManyToOne
	@JoinColumn(name = "idtipomovimiento")
	private TipoMovimiento tipoMovimiento;

	@OneToOne
	@JoinColumn(name = "idpersona")
	private Persona persona;
	@Column(name = "fecha")
	private Date fecha;
	@Column(name = "tiempo")
	private Integer tiempo;
}
