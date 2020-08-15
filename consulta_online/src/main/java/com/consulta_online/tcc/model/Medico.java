package com.consulta_online.tcc.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "medico")
public class Medico {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_medico")
	private Long idMedico;
	
	@Column(name = "nome_medico")
	private String nomeMedico;
	
	@Column(name = "crm")
	private Integer crm;
/*
 @ManyToOne
 @JoinColumn(name = "id_especialidade", foreignKey = @ForeignKey( name ="id_especialidade"))
  private Especialidade especialidade;
*/ 


public Medico() {
	super();
}



public Long getIdMedico() {
	return idMedico;
}

public void setIdMedico(Long idMedico) {
	this.idMedico = idMedico;
}

public String getNomeMedico() {
	return nomeMedico;
}

public void setNomeMedico(String nomeMedico) {
	this.nomeMedico = nomeMedico;
}

public Integer getCrm() {
	return crm;
}

public void setCrm(Integer crm) {
	this.crm = crm;
}



@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((crm == null) ? 0 : crm.hashCode());
	result = prime * result + ((idMedico == null) ? 0 : idMedico.hashCode());
	result = prime * result + ((nomeMedico == null) ? 0 : nomeMedico.hashCode());
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
	Medico other = (Medico) obj;
	if (crm == null) {
		if (other.crm != null)
			return false;
	} else if (!crm.equals(other.crm))
		return false;
	if (idMedico == null) {
		if (other.idMedico != null)
			return false;
	} else if (!idMedico.equals(other.idMedico))
		return false;
	if (nomeMedico == null) {
		if (other.nomeMedico != null)
			return false;
	} else if (!nomeMedico.equals(other.nomeMedico))
		return false;
	return true;
}


    
    
	
	

}
