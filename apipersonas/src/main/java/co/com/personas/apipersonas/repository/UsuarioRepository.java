package co.com.personas.apipersonas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.com.personas.apipersonas.model.seguridad.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

	Usuario findByNombreUsuario(String nombreUsuario);
}