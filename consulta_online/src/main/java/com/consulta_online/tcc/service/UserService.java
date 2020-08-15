package com.consulta_online.tcc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
	

}
