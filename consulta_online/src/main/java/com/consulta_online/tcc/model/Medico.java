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
	
 @ManyToOne
 @JoinColumn(name = "id_especialidade", foreignKey = @ForeignKey( name ="id_especialidade"))
  private Especialidade especialidade;
 


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

public Especialidade getEspecialidade() {
	return especialidade;
}

public void setEspecialidade(Especialidade especialidade) {
	this.especialidade = especialidade;
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((especialidade == null) ? 0 : especialidade.hashCode());
	result = prime * result + ((idMedico == null) ? 0 : idMedico.hashCode());
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
	if (especialidade == null) {
		if (other.especialidade != null)
			return false;
	} else if (!especialidade.equals(other.especialidade))
		return false;
	if (idMedico == null) {
		if (other.idMedico != null)
			return false;
	} else if (!idMedico.equals(other.idMedico))
		return false;
	return true;
}
 
   
	 
    
    
	
	

}
