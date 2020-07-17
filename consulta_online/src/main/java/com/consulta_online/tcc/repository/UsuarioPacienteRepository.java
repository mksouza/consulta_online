package com.consulta_online.tcc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.consulta_online.tcc.model.UsuarioPaciente;


@Repository
public interface UsuarioPacienteRepository extends JpaRepository<UsuarioPaciente, Long>{

      
        List<UsuarioPaciente> findByIdUsuario(@Param("idUsuario") Long id);
	
	


}
