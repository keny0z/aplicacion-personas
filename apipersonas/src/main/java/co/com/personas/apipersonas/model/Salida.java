package co.com.personas.apipersonas.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="salida")
@Data
@NoArgsConstructor
public class Salida {

	@Id
	@GeneratedValue
	@Column(name="idSalida")
	private Integer idSalida;
	@OneToOne
	@JoinColumn(name="idpersona")
	private Persona persona;
	@Column(name="salida")
	private Date salida;
	@OneToOne
	@JoinColumn(name="identrada")
	private Entrada entrada;
	@Column(name="tiempo")
	private Integer tiempo;

}