package com.consulta_online.tcc.controllers;



import java.util.List;

import javax.validation.Valid;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.consulta_online.tcc.model.AgendamentoConsulta;
import com.consulta_online.tcc.model.TipoAgendamentoConsulta;
import com.consulta_online.tcc.service.AgendamentoConsultaService;
import com.consulta_online.tcc.service.EspecialidadeService;
import com.consulta_online.tcc.service.TipoAgendamentoConsultaService;








@CrossOrigin(origins = "*") // "http://localhost:4200"
@RestController
@RequestMapping(value = "/agendamento")
public class AgendamentoConsultaController {
	
	
	private AgendamentoConsultaService agendamentoConsultaService;
	private TipoAgendamentoConsultaService tipoAgendamentoConsultaService;

	

	@Autowired
	public AgendamentoConsultaController(AgendamentoConsultaService agendamentoConsultaService, 
	    EspecialidadeService especialidadeService,
	    TipoAgendamentoConsultaService tipoAgendamentoConsultaService
	    ) {
		
		this.agendamentoConsultaService = agendamentoConsultaService;
		this.tipoAgendamentoConsultaService = tipoAgendamentoConsultaService;
	
	}
	
	
	
	@GetMapping(value ="/consulta-id/user/{id}")
	@PreAuthorize("hasRole('USER')")
	public ResponseEntity<List<AgendamentoConsulta>> listar(@PathVariable(value = "id")List<Long>   id) {

		List<AgendamentoConsulta> lista = agendamentoConsultaService.listarporId(id);

		return ResponseEntity.ok(lista);
	}
	

	@GetMapping(value ="/consulta-nome/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<List<AgendamentoConsulta>> listarPorNome(
			               @RequestParam @Validated  List<String> username) {

		List<AgendamentoConsulta> lista = agendamentoConsultaService.listarporNome(username);

		return ResponseEntity.ok(lista);
	}
	
	
	@GetMapping(value = "/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<List<AgendamentoConsulta>> listartodos() {

		List<AgendamentoConsulta> lista = agendamentoConsultaService.listarTodos();

		return ResponseEntity.ok(lista);
	}
	
	
	
	
	
	@PostMapping(value = "salvar-consulta/user")
	//@PreAuthorize("hasRole('USER')")
	public AgendamentoConsulta salvaConsulta(@RequestBody @Validated AgendamentoConsulta consulta) {
		return agendamentoConsultaService.salvar(consulta);
	}

	
	@DeleteMapping(value = "/deletar/admin/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public void deletarConsulta(@PathVariable(value = "id") Long id) {
		
		agendamentoConsultaService.deletar(id);
		 
	}
	
	@PutMapping(value = "atualizar/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public AgendamentoConsulta atualizarConsulta(@RequestBody @Validated AgendamentoConsulta consulta) {
		
		return agendamentoConsultaService.salvar(consulta);
	}
	

	@GetMapping(value ="/tipo-todos")
	public ResponseEntity<List<TipoAgendamentoConsulta>> listarTipoTodos() {

		List<TipoAgendamentoConsulta> lista = tipoAgendamentoConsultaService.listarTodos();
		return ResponseEntity.ok(lista);
	}

	
/*
	@GetMapping(value = "/produto")
	public Produtos listaProdutoUnico(@PathVariable(value = "id")long id) {
	
	return produtoEntidadeRepo.findbyId(id);
	
	}
	
	@PostMapping(value = "/produtosave")
	public Produtos salvaProduto(@RequestBody @Validated Produtos produto) {
		return produtoEntidadeRepo.save(produto);
		

	}
	*/

}
