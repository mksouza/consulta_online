package com.consulta_online.tcc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "especialidade")
public class Especialidade {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_especialidade")
	private Long idEspecialidade;
	
	@Column(name = "nome_especialidade")
	private String nomeEspecialidade;
	
	



	public Especialidade(Long idEspecialidade, String nomeEspecialidade) {
	
		this.idEspecialidade = idEspecialidade;
		this.nomeEspecialidade = nomeEspecialidade;
	}

	public Especialidade() {
		super();
	}

	public Long getIdEspecialidade() {
		return idEspecialidade;
	}

	public void setIdEspecialidade(Long idEspecialidade) {
		this.idEspecialidade = idEspecialidade;
	}

	public String getNomeEspecialidade() {
		return nomeEspecialidade;
	}

	public void setNomeEspecialidade(String nomeEspecialidade) {
		this.nomeEspecialidade = nomeEspecialidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEspecialidade == null) ? 0 : idEspecialidade.hashCode());
		result = prime * result + ((nomeEspecialidade == null) ? 0 : nomeEspecialidade.hashCode());
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
		Especialidade other = (Especialidade) obj;
		if (idEspecialidade == null) {
			if (other.idEspecialidade != null)
				return false;
		} else if (!idEspecialidade.equals(other.idEspecialidade))
			return false;
		if (nomeEspecialidade == null) {
			if (other.nomeEspecialidade != null)
				return false;
		} else if (!nomeEspecialidade.equals(other.nomeEspecialidade))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Especialidade [idEspecialidade=" + idEspecialidade + ", nomeEspecialidade=" + nomeEspecialidade + "]";
	}

	
	
  
	
	
	

}
