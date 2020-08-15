package com.consulta_online.tcc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.consulta_online.tcc.model.Especialidade;







public interface EspecialidadeRepository extends JpaRepository<Especialidade, Long> {
	
	List<Especialidade> findByIdEspecialidade(@Param("idEspecialidade")Long id);

}
