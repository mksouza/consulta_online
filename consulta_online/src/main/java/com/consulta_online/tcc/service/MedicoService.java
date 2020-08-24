package com.consulta_online.tcc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.consulta_online.tcc.model.Medico;
import com.consulta_online.tcc.repository.MedicoRepository;


@Service
public class MedicoService {
	
	
	private MedicoRepository medicoRepository;

	
	@Autowired
	public MedicoService(MedicoRepository medicoRepository) {
		
		this.medicoRepository = medicoRepository;
		
	}
	
	
	public List<Medico> listarTodos(){
		
		return  medicoRepository.findAll();
	}
	
	
	public List<Medico> listarMedicoId(Long id){
		
		return medicoRepository.findByIdMedico(id);
	}

	public Medico salvar(Medico med) {
		return medicoRepository.save(med);
	}
	

	 public void deletar(Long id) {
		  
		  medicoRepository.deleteById(id);
		  
	  }
}
