package br.com.TrueUnionB2B.TrueUnionB2B.Config;

import org.springframework.http.HttpStatus;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.com.TrueUnionB2B.TrueUnionB2B.Entities.User;
import br.com.TrueUnionB2B.TrueUnionB2B.Repository.UsuariosTrueUnion;
import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class UsuariosSistemaDetailsService implements UserDetailsService {

	private final UsuariosTrueUnion usuario;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User usuario = this.usuario.findByLogin(username);
		if (usuario == null) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Nao encontrado");

		}
		return usuario;
	}

}
