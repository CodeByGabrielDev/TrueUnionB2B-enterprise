package br.com.TrueUnionB2B.TrueUnionB2B.Repository;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.TrueUnionB2B.TrueUnionB2B.Entities.User;


@Repository
public interface UsuariosTrueUnion extends CrudRepository<User, Long> {
	
	@Query("SELECT E FROM User E WHERE E.login = :login")
	User findByLogin(@Param("login")String login);
}
