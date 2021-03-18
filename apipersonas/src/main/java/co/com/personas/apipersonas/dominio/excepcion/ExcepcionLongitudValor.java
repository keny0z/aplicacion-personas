package co.com.personas.apipersonas.dominio.excepcion;

public class ExcepcionLongitudValor extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ExcepcionLongitudValor(String message) {
		super(message);
	}
}
