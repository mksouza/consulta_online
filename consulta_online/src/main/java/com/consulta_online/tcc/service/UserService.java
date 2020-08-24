package com.consulta_online.tcc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consulta_online.tcc.model.AgendamentoConsulta;
import com.consulta_online.tcc.model.User;
import com.consulta_online.tcc.repository.UserRepository;




@Service
public class UserService {
	
	
	private UserRepository userRepository;

	
	@Autowired
	public UserService(UserRepository userRepository) {
		
		this.userRepository = userRepository;
		
	}
	
	
	public List<User> listarTodos(){
		
		return  userRepository.findAll();
	}
	

	public User listarporNome(String  username) {
		
		return userRepository.findByUsernameContaining(username);
		
	}
	
	public Optional<User> listarPorId(Long id) {
		
		return userRepository.findById(id);
	}
	
	
	public User salvar(User user) {
		return userRepository.save(user);
	}
	
	

	
	  public void deletar( Long id) {
		  
		  userRepository.deleteById(id);
		  
	  }

	
}
