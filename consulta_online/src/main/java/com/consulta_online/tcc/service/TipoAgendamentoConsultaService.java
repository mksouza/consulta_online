package com.consulta_online.tcc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.consulta_online.tcc.model.TipoAgendamentoConsulta;
import com.consulta_online.tcc.repository.TipoAgendamentoConsultaRepository;

@Service
public class TipoAgendamentoConsultaService {
	
	
	private TipoAgendamentoConsultaRepository tipoAgendamentoConsultaRepository;

	
	@Autowired
	public TipoAgendamentoConsultaService(TipoAgendamentoConsultaRepository tipoAgendamentoConsultaRepository) {
		
		this.tipoAgendamentoConsultaRepository = tipoAgendamentoConsultaRepository;
	}
	
	
	public List<TipoAgendamentoConsulta> listarTodos(){
		
		return tipoAgendamentoConsultaRepository.findAll();
	}
	
	
	public List<TipoAgendamentoConsulta> listarTipoAgendamentoId(Long id){
		
		return tipoAgendamentoConsultaRepository.findByIdTipoAgendamentoConsulta(id);
	}

}
