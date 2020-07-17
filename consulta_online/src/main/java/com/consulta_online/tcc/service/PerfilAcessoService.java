package com.consulta_online.tcc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.consulta_online.tcc.model.PerfilAcesso;
import com.consulta_online.tcc.repository.PerfilAcessoRepository;


@Service
public class PerfilAcessoService {
	
	
	private PerfilAcessoRepository perfilAcessoRepository;

	
	@Autowired
	public PerfilAcessoService(PerfilAcessoRepository perfilAcessoRepository) {
		
		this.perfilAcessoRepository = perfilAcessoRepository;
	}
	
	
	public List<PerfilAcesso> listarTodos(){
		
		return perfilAcessoRepository.findAll();
	}
	
	
	public List<PerfilAcesso> listarPerfilAcessoPorId(Long id){
		
		return perfilAcessoRepository.findByIdCodPerfil(id);
	}

}
