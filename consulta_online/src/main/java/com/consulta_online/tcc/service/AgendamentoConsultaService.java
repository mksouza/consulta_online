package com.consulta_online.tcc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consulta_online.tcc.model.AgendamentoConsulta;
import com.consulta_online.tcc.repository.AgendamentoConsultaRepository;


@Service
public class AgendamentoConsultaService {
	
	
	private AgendamentoConsultaRepository agendamentoConsultaRepository;


	
	@Autowired
	public AgendamentoConsultaService(AgendamentoConsultaRepository agendamentoConsultaRepository) {
		this.agendamentoConsultaRepository = agendamentoConsultaRepository;
		
	}
	
	public List<AgendamentoConsulta> listarporId(List<Long>  id) {
		
		return agendamentoConsultaRepository.findByUsersIdIn(id);	
	}
	

	public List<AgendamentoConsulta> listarporNome(List<String>  username) {
		
		return agendamentoConsultaRepository.findByUsersUsernameIn(username);
	}
	
	public List<AgendamentoConsulta> listarTodos(){
		
		return agendamentoConsultaRepository.findAll();
	}
	
   public AgendamentoConsulta salvar(AgendamentoConsulta consulta) {
	   return agendamentoConsultaRepository.save(consulta);
   }
   
  
   public AgendamentoConsulta atualizar(AgendamentoConsulta consulta) {
	   return agendamentoConsultaRepository.save(consulta);
   }
   
  public void deletar( Long id) {
	  
	  agendamentoConsultaRepository.deleteById(id);
	  
  }
  
  
 

	
	
}
