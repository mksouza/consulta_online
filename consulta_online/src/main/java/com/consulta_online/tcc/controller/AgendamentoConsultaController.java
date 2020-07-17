package com.consulta_online.tcc.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consulta_online.tcc.model.AgendamentoConsulta;
import com.consulta_online.tcc.model.Especialidade;
import com.consulta_online.tcc.model.Medico;
import com.consulta_online.tcc.service.AgendamentoConsultaService;
import com.consulta_online.tcc.service.EspecialidadeService;
import com.consulta_online.tcc.service.MedicoService;
import com.consulta_online.tcc.service.StatusConsultaService;
import com.consulta_online.tcc.service.TipoAgendamentoConsultaService;
import com.consulta_online.tcc.service.UsuarioPacienteService;




@RestController
@RequestMapping(value = "/agendamento")
public class AgendamentoConsultaController {
	
	
	private AgendamentoConsultaService agendamentoConsultaService;
	private EspecialidadeService especialidadeService;
	private TipoAgendamentoConsultaService tipoAgendamentoConsultaService;
	private UsuarioPacienteService usuarioPacienteService;
	private StatusConsultaService statusConsultaService;
	private MedicoService medicoservice;
	

	@Autowired
	public AgendamentoConsultaController(AgendamentoConsultaService agendamentoConsultaService, 
	    EspecialidadeService especialidadeService,
	    TipoAgendamentoConsultaService tipoAgendamentoConsultaService,
	    UsuarioPacienteService usuarioPacienteService,
	    StatusConsultaService statusConsultaService,
	    MedicoService medicoservice) {
		
		this.agendamentoConsultaService = agendamentoConsultaService;
		this.especialidadeService = especialidadeService;
		this.tipoAgendamentoConsultaService = tipoAgendamentoConsultaService;
		this.usuarioPacienteService = usuarioPacienteService;
		this.statusConsultaService = statusConsultaService;
		this.medicoservice = medicoservice;
	}
	
	
	
	@GetMapping(value ="/por/{id}")
	public ResponseEntity<List<AgendamentoConsulta>> listar(@PathVariable(value = "id")long id) {

		List<AgendamentoConsulta> lista = agendamentoConsultaService.listarporId(id);

		return ResponseEntity.ok(lista);
	}
	
	
	@GetMapping(value ="/por-todos")
	public ResponseEntity<List<AgendamentoConsulta>> listartodos() {

		List<AgendamentoConsulta> lista = agendamentoConsultaService.listarTodos();

		return ResponseEntity.ok(lista);
	}
	
	
	
	@GetMapping(value = "/espec/{id}")
	public ResponseEntity<List<Especialidade>> listarEspecPorId(@PathVariable(value = "id")long id){
		
		List<Especialidade> list = especialidadeService.listarEspecialidadePorId(id);
		
		return ResponseEntity.ok(list);
		
	}
	
	
	@GetMapping(value ="/espec-todos")
	public ResponseEntity<List<Especialidade>> listarEspectodos() {

		List<Especialidade> lista = especialidadeService.listarTodos();

		return ResponseEntity.ok(lista);
	}
	
	
	@GetMapping(value = "/medic/{id}")
	public ResponseEntity<List<Medico>> listarMedicPorId(@PathVariable(value = "id")long id){
		
		List<Medico> list = medicoservice.listarMedicoId(id);
		
		return ResponseEntity.ok(list);
		
	}
	
	
	@GetMapping(value ="/medic-todos")
	public ResponseEntity<List<Medico>> listarMedictodos() {

		List<Medico> lista = medicoservice.listarTodos();

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
