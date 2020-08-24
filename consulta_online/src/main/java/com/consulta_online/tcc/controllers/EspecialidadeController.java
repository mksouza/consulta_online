package com.consulta_online.tcc.controllers;



import java.util.List;


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

import com.consulta_online.tcc.model.Especialidade;
import com.consulta_online.tcc.service.EspecialidadeService;




@CrossOrigin(origins = "*") // "http://localhost:4200"
@RestController
@RequestMapping(value = "/especialidade")
public class EspecialidadeController {
	
	

	private EspecialidadeService especService;
	
	@Autowired
	public EspecialidadeController(EspecialidadeService especService) {
		this.especService = especService;
	}
	
	
	
	@GetMapping(value = "/espec/{id}")
	public ResponseEntity<List<Especialidade>> listarEspecPorId(@PathVariable(value = "id")long id){
		
		List<Especialidade> list = especService.listarEspecialidadePorId(id);
		
		return ResponseEntity.ok(list);
		
	}
	
	
	@GetMapping(value ="user/espec-todos")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public ResponseEntity<List<Especialidade>> listarEspectodos() {

		List<Especialidade> lista = especService.listarTodos();

		return ResponseEntity.ok(lista);
	}
		
	
	@PostMapping(value = "salvar-new-espec/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public Especialidade salvarEspecialidade(@RequestBody @Validated Especialidade espec) {
		return especService.salvar(espec);
	}

	
	@PutMapping(value = "atualizar-espec/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public Especialidade atualizarMedico(@RequestBody @Validated Especialidade espec) {
		
		return especService.salvar(espec);
	}

	@DeleteMapping(value = "/deletar-espec/admin/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public void deletarEspecialidade(@PathVariable(value = "id") Long id) {
		
			especService.deletar(id);
		 
	}




}
