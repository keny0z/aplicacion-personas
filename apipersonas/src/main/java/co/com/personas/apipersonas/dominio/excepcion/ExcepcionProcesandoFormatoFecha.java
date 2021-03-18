package co.com.personas.apipersonas.dominio.excepcion;

public class ExcepcionProcesandoFormatoFecha extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ExcepcionProcesandoFormatoFecha(String mensaje) {
		super(mensaje);
	}

}
