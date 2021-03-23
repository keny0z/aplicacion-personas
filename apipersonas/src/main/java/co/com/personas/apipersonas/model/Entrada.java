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
@Table(name="entrada")
@Data
@NoArgsConstructor
public class Entrada {

	@Id
	@GeneratedValue
	@Column(name="idEntrada")
	private Integer idEntrada;
	@OneToOne
	@JoinColumn(name="idpersona")
	private Persona persona;
	@Column(name="entrada")
	private Date entrada;

}
