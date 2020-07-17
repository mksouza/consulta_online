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
	
	
	
	public List<AgendamentoConsulta> listarporId(Long id)  {
		
		return agendamentoConsultaRepository.findByIdAgendamentoConsulta(id);
		
		
	}
	
	
	public List<AgendamentoConsulta> listarTodos(){
		
		return agendamentoConsultaRepository.findAll();
	}
	
	
}
