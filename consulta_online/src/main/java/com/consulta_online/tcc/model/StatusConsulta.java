package com.consulta_online.tcc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "status_consulta")
public class StatusConsulta {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_status_consulta")
	private Long idStatusConsulta;
	
	@Column(name = "situacao")
	private String situacao;
	
	
	

	public StatusConsulta() {
		
	}

	public StatusConsulta( String situacao) {
		

		this.situacao = situacao;
	}

	public Long getIdStatusConsulta() {
		return idStatusConsulta;
	}

	public void setIdStatusConsulta(Long idStatusConsulta) {
		this.idStatusConsulta = idStatusConsulta;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
   
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idStatusConsulta == null) ? 0 : idStatusConsulta.hashCode());
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
		StatusConsulta other = (StatusConsulta) obj;
		if (idStatusConsulta == null) {
			if (other.idStatusConsulta != null)
				return false;
		} else if (!idStatusConsulta.equals(other.idStatusConsulta))
			return false;
		return true;
	}
	
}
