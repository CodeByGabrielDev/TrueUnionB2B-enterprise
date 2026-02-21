package br.com.TrueUnionB2B.TrueUnionB2B.Config;

import java.time.LocalDate;

import java.util.Date;
import javax.crypto.SecretKey;
import org.springframework.stereotype.Component;

import br.com.TrueUnionB2B.TrueUnionB2B.Entities.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class TokenService {

	private static final SecretKey SECRET_KEY = Keys.hmacShaKeyFor("trueunion-secret-super-segura-123456".getBytes());

	public String gerarToken(User usuario) {

		return Jwts.builder().setSubject(usuario.getLogin())
				.claim("perfil", usuario.getPerfil().name()).setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))
				.signWith(SECRET_KEY, SignatureAlgorithm.HS256) 
				.compact();

	}
	public String getSubject(String token) {
		Claims claims = Jwts.parserBuilder().setSigningKey(SECRET_KEY) 
				.build().parseClaimsJws(token).getBody();
		return claims.getSubject();
	}

}
