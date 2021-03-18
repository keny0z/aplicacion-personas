package co.com.personas.apipersonas.aplicacion;

public class ComandoRespuesta<T> {

	private T valor;

    public ComandoRespuesta(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }
}
