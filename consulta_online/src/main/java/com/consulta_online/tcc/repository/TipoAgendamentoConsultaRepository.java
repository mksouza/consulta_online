package com.consulta_online.tcc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.consulta_online.tcc.model.TipoAgendamentoConsulta;





@Repository
public interface TipoAgendamentoConsultaRepository extends JpaRepository<TipoAgendamentoConsulta, Long>{
	
	
	
        List<TipoAgendamentoConsulta> findByIdTipoAgendamentoConsulta(@Param("idTipoAgendamentoConsulta")Long id);  
	


}
