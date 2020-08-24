package com.consulta_online.tcc.controllers;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consulta_online.tcc.model.User;
import com.consulta_online.tcc.service.UserService;


@CrossOrigin(origins = "*") // "http://localhost:4200"
@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	

	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	
	
	}
	
	@GetMapping(value ="/lista-todos-usuarios/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<List<User>> listarUser() {

		List<User> lista = userService.listarTodos();

		return ResponseEntity.ok(lista);
	}
	
	
	@GetMapping(value ="/user-por-id/admin/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<Optional<User>> listar(@PathVariable(value = "id")Long id) {

		Optional<User> lista = userService.listarPorId(id);

		return ResponseEntity.ok(lista);
	}
	

	@GetMapping(value ="/user-por-nome/admin/{username}")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<User> listarPorNome(@PathVariable(value = "username")String username) {


		 
		User lista = userService.listarporNome(username);

		return ResponseEntity.ok(lista);
	}
	
	
	@PostMapping(value = "salvar-new-user/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public User salvaProduto(@RequestBody @Validated User user) {
		return userService.salvar(user);
	}

	
	@PutMapping(value = "atualizar-user/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public User atualizarUser(@RequestBody @Validated User users) {
		
		return userService.salvar(users);
	}

	@DeleteMapping(value = "/deletar-user/admin/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public void deletarUser(@PathVariable(value = "id") Long id) {
		
			userService.deletar(id);
		 
	}
	


}
