package com.consulta_online.tcc.repository;


import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.consulta_online.tcc.model.User;

import antlr.collections.List;






@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	
	Optional<User> findById(Long id);
	
	Optional<User> findByUsername(String  username);

	Boolean existsByUsername(String username);
	
	Boolean existsByCpf(String cpf);

	Boolean existsByEmail(String email);
	
	
    User findByUsernameContaining(String username);

	
	
}
