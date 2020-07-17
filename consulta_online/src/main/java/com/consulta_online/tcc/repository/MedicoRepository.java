package com.consulta_online.tcc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.consulta_online.tcc.model.Medico;


@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long>{
		
	
      
        List<Medico> findByIdMedico(@Param("idMedico")Long id);
	
	


}
