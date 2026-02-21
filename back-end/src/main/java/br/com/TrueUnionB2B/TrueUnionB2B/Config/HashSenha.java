package br.com.TrueUnionB2B.TrueUnionB2B.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class HashSenha {

	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
