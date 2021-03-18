package co.com.personas.apipersonas.dominio.excepcion;

public class ExcepcionValorInvalido extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ExcepcionValorInvalido(String message) {
		super(message);
	}
}
