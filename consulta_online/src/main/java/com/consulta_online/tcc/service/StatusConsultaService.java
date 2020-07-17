package com.consulta_online.tcc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.consulta_online.tcc.model.StatusConsulta;
import com.consulta_online.tcc.repository.StatusConsultaRepository;

@Service
public class StatusConsultaService {
	
	
	private StatusConsultaRepository statusConsultaRepository;

	
	@Autowired
	public StatusConsultaService(StatusConsultaRepository statusConsultaRepository) {
		
		this.statusConsultaRepository = statusConsultaRepository;
	}
	
	
	public List<StatusConsulta> listarTodos(){
		
		return statusConsultaRepository.findAll();
	}
	
	
	public List<StatusConsulta> listarEspecialidadePorId(Long id){
		
		return statusConsultaRepository.findByIdStatusConsulta(id);
	}

}
