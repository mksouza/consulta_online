package com.consulta_online.tcc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "perfil_acesso")
public class PerfilAcesso {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cod_perfil")
	private Long idCodPerfil;
	
    @Column(name = "nome_perfil")
	private String nomePerfil;
    
    public Long getIdCodPerfil() {
		return idCodPerfil;
	}

	public void setIdCodPerfil(Long idCodPerfil) {
		this.idCodPerfil = idCodPerfil;
	}

	public String getNomePerfil() {
		return nomePerfil;
	}

	public void setNomePerfil(String nomePerfil) {
		this.nomePerfil = nomePerfil;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCodPerfil == null) ? 0 : idCodPerfil.hashCode());
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
		PerfilAcesso other = (PerfilAcesso) obj;
		if (idCodPerfil == null) {
			if (other.idCodPerfil != null)
				return false;
		} else if (!idCodPerfil.equals(other.idCodPerfil))
			return false;
		return true;
	}

	

   
	

}
