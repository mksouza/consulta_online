package com.consulta_online.tcc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.consulta_online.tcc.model.Especialidade;
import com.consulta_online.tcc.model.User;
import com.consulta_online.tcc.repository.EspecialidadeRepository;

@Service
public class EspecialidadeService {
	
	
	
	private EspecialidadeRepository especialidadeRepository;

	
	@Autowired
	public EspecialidadeService(EspecialidadeRepository especialidadeRepository) {
		
		this.especialidadeRepository = especialidadeRepository;
	}
	
	
	public List<Especialidade> listarTodos(){
		
		return especialidadeRepository.findAll();
	}
	
	
	public List<Especialidade> listarEspecialidadePorId(Long id){
		
		return especialidadeRepository.findByIdEspecialidade(id);
	}
	
	
	public Especialidade salvar(Especialidade espec) {
		return especialidadeRepository.save(espec);
	}
	
	

	
	  public void deletar(Long id) {
		  
		  especialidadeRepository.deleteById(id);
		  
	  }

}
