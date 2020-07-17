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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTipoAgendamentoConsulta == null) ? 0 : idTipoAgendamentoConsulta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoAgendamentoConsulta other = (TipoAgendamentoConsulta) obj;
		if (idTipoAgendamentoConsulta == null) {
			if (other.idTipoAgendamentoConsulta != null)
				return false;
		} else if (!idTipoAgendamentoConsulta.equals(other.idTipoAgendamentoConsulta))
			return false;
		return true;
	}
	
	

	
	
	
	
	
}
