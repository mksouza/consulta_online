package com.consulta_online.tcc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.consulta_online.tcc.model.StatusConsulta;






@Repository
public interface StatusConsultaRepository extends JpaRepository<StatusConsulta, Long>{
	
	
      
        List<StatusConsulta> findByIdStatusConsulta(@Param("idStatusConsulta")Long id);  
	
        
        
	


}
