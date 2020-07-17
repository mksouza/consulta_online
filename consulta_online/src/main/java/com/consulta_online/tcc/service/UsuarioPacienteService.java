package com.consulta_online.tcc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.consulta_online.tcc.model.UsuarioPaciente;
import com.consulta_online.tcc.repository.UsuarioPacienteRepository;

@Service
public class UsuarioPacienteService {
	
	
	private UsuarioPacienteRepository usuarioPacienteRepository;

	
	@Autowired
	public UsuarioPacienteService(UsuarioPacienteRepository usuarioPacienteRepository) {
		
		this.usuarioPacienteRepository = usuarioPacienteRepository;
		
	}
	
	
	public List<UsuarioPaciente> listarTodos(){
		
		return  usuarioPacienteRepository.findAll();
	}
	
	
	public List<UsuarioPaciente> listarUsuarioPacienteId(Long id){
		
		return usuarioPacienteRepository.findByIdUsuario(id);
	}

}
