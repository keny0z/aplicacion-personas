package co.com.personas.apipersonas.dominio.excepcion;

public class ExcepcionProcesandoJson extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ExcepcionProcesandoJson(String mensaje) {
		super(mensaje);
	}

}
