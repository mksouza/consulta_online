package com.consulta_online.tcc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.consulta_online.tcc.model.AgendamentoConsulta;







@Repository
public interface AgendamentoConsultaRepository extends JpaRepository<AgendamentoConsulta, Long>{
	
	/*
	@Query("SELECT e.nomeEspecialidade, m.nomeMedico, t.tipo, s.situacao, n.nomeUsuario, p.nomePerfil, ag.horaConsulta, ag.dataConsulta FROM AgendamentoConsulta ag " + 
			"JOIN ag.Especialidade e " + 
			"JOIN ag.Medico m " + 
			"JOIN ag.TipoAgendamentoConsulta t " + 
			"JOIN ag.StatusConsulta s " + 
			"JOIN ag.UsuarioPaciente n " + 
			"JOIN ag.PerfilAcesso p ")
			 List<AgendamentoConsulta> buscar();
			 
	*/		
	
      
        List<AgendamentoConsulta> findByUsersIdIn(@Param("id") List<Long>  id);

   
	
    
	  List<AgendamentoConsulta> findByUsersUsernameIn(@Param("username") List<String> username);
}
