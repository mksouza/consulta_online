package com.consulta_online.tcc.repository;


import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.consulta_online.tcc.model.User;




@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	Optional<User> findByUsername(String username);

	Boolean existsByUsername(String username);
	
	Boolean existsByCpf(Integer cpf);

	Boolean existsByEmail(String email);
	
	
}
