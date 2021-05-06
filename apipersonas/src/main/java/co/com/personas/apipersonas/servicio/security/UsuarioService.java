package co.com.personas.apipersonas.servicio.security;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;



import co.com.personas.apipersonas.model.seguridad.Usuario;
import co.com.personas.apipersonas.repository.UsuarioRepository;

@Service
public class UsuarioService implements UserDetailsService{
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepository.findByNombreUsuario(username);
		List<GrantedAuthority> authorities = usuario.getRoles().stream().map(role-> new SimpleGrantedAuthority(role.getNombreRol())).collect(Collectors.toList());
		return new User(username,usuario.getPassword(), usuario.isEnabled(),true, true, true,authorities);
	}

}