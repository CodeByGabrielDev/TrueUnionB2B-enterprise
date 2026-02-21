package br.com.TrueUnionB2B.TrueUnionB2B.Entities;

import java.util.ArrayList;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import br.com.TrueUnionB2B.TrueUnionB2B.Enum.PerfilUsuario;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Usuario_trueUnion")
public class User implements UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nome_cerimonialista")
	private String nomeCerimonialista;
	private String cpf;
	private String login;
	private String email;
	private String senha;
	private Boolean inativo;

	private PerfilUsuario perfil;

	public User(String nomeCerimonialista, String cpf, String login, String email, String senha, PerfilUsuario perfil,
			boolean inativo) {
		super();
		this.cpf = cpf;
		this.nomeCerimonialista = nomeCerimonialista;
		this.login = login;
		this.email = email;
		this.senha = senha;
		this.perfil = perfil;
		this.inativo = inativo;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return List.of(() -> "ROLE_" + this.perfil.name());
	}

	@Override
	public String getPassword() {
		return this.senha;
	}

	@Override
	public String getUsername() {
		return this.login;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return !this.inativo;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return !this.inativo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeVendedor() {
		return nomeCerimonialista;
	}

	public void setNomeVendedor(String nomeCerimonialista) {
		this.nomeCerimonialista = nomeCerimonialista;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isInativo() {
		return inativo;
	}

	public void setInativo(boolean inativo) {
		this.inativo = inativo;
	}

}
