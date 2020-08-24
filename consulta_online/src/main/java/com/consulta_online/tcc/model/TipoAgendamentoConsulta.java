package com.consulta_online.tcc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_agendamento_consulta")
public class TipoAgendamentoConsulta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_agendamento_consulta")
	private Long idTipoAgendamentoConsulta;
	
	@Column(name = "tipo")
	private String tipo;
	
	

	public TipoAgendamentoConsulta() {
		
	}
   
    

	public Long getIdTipoAgendamentoConsulta() {
		return idTipoAgendamentoConsulta;
	}

	public void setIdTipoAgendamentoConsulta(Long idTipoAgendamentoConsulta) {
		this.idTipoAgendamentoConsulta = idTipoAgendamentoConsulta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	

	
	
	
	
	
}
