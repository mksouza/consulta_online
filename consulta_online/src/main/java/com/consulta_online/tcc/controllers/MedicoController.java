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

import com.consulta_online.tcc.model.Medico;
import com.consulta_online.tcc.service.MedicoService;



@CrossOrigin(origins = "*") // "http://localhost:4200"
@RestController
@RequestMapping(value = "/medico")
public class MedicoController {
	
	

	private MedicoService medicoService;
	
	@Autowired
	public MedicoController(MedicoService medicoService) {
		this.medicoService = medicoService;
	}
	
	
	@GetMapping(value = "/medic/{id}")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')") 
	public ResponseEntity<List<Medico>> listarMedicPorId(@PathVariable(value = "id")long id){
		
		List<Medico> list = medicoService.listarMedicoId(id);
		
		return ResponseEntity.ok(list);
		
	}
	
	
	@GetMapping(value ="/medic-todos/admin")
	@PreAuthorize("hasRole('ADMIN')") 
	public ResponseEntity<List<Medico>> listarMedictodos() {

		List<Medico> lista = medicoService.listarTodos();

		return ResponseEntity.ok(lista);
	}
	
	
	
	
	@PostMapping(value = "salvar-new-medico/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public Medico salvarMedico(@RequestBody @Validated Medico medic) {
		return medicoService.salvar(medic);
	}

	
	@PutMapping(value = "atualizar-medico/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public Medico atualizarMedico(@RequestBody @Validated Medico medic) {
		
		return medicoService.salvar(medic);
	}

	@DeleteMapping(value = "/deletar-medico/admin/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public void deletarMedico(@PathVariable(value = "id") Long id) {
		
			medicoService.deletar(id);
		 
	}




}
