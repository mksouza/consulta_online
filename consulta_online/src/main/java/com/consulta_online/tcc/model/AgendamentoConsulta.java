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
@Table(name = "agendamento_consulta")
public class AgendamentoConsulta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_agendamento_consulta")
	private Long idAgendamentoConsulta;
	
	@Column(name = "data_consulta")
	private String data_consulta;
	
	@Column(name = "hora_consulta")
	private String hora_consulta;
	
	@ManyToOne
	@JoinColumn(name = "id_especialidade",foreignKey = @ForeignKey( name = "id_especialidade"))
	private  Especialidade especialidade;
	
	@ManyToOne
	@JoinColumn(name = "id_medico",foreignKey = @ForeignKey( name = "id_medico"))
	private Medico medico;
	
	@ManyToOne
	@JoinColumn(name = "id_tipo_agendamento_consulta",foreignKey = @ForeignKey( name ="id_tipo_agendamento_consulta"))
	private TipoAgendamentoConsulta tipoAgendaConsulta;
	
	@ManyToOne
	@JoinColumn(name = "id_status_consulta",foreignKey = @ForeignKey( name ="id_status_consulta"))
	private StatusConsulta statusConsulta;
		
	
	@ManyToOne
	@JoinColumn(name = "id_usuario", foreignKey = @ForeignKey( name ="id_usuario"))
	private UsuarioPaciente usuarioPaciente;
	
	@ManyToOne
	@JoinColumn(name = "id_cod_perfil",foreignKey = @ForeignKey( name ="id_cod_perfil"))
	private PerfilAcesso perfilAcesso;

	public Long getIdAgendamentoConsulta() {
		return idAgendamentoConsulta;
	}

	public void setIdAgendamentoConsulta(Long idAgendamentoConsulta) {
		this.idAgendamentoConsulta = idAgendamentoConsulta;
	}

	public String getData_consulta() {
		return data_consulta;
	}

	public void setData_consulta(String data_consulta) {
		this.data_consulta = data_consulta;
	}

	public String getHora_consulta() {
		return hora_consulta;
	}

	public void setHora_consulta(String hora_consulta) {
		this.hora_consulta = hora_consulta;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public TipoAgendamentoConsulta getTipoAgendaConsulta() {
		return tipoAgendaConsulta;
	}

	public void setTipoAgendaConsulta(TipoAgendamentoConsulta tipoAgendaConsulta) {
		this.tipoAgendaConsulta = tipoAgendaConsulta;
	}

	public StatusConsulta getStatusConsulta() {
		return statusConsulta;
	}

	public void setStatusConsulta(StatusConsulta statusConsulta) {
		this.statusConsulta = statusConsulta;
	}

	public UsuarioPaciente getUsuarioPaciente() {
		return usuarioPaciente;
	}

	public void setUsuarioPaciente(UsuarioPaciente usuarioPaciente) {
		this.usuarioPaciente = usuarioPaciente;
	}

	public PerfilAcesso getPerfilAcesso() {
		return perfilAcesso;
	}

	public void setPerfilAcesso(PerfilAcesso perfilAcesso) {
		this.perfilAcesso = perfilAcesso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idAgendamentoConsulta == null) ? 0 : idAgendamentoConsulta.hashCode());
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
		AgendamentoConsulta other = (AgendamentoConsulta) obj;
		if (idAgendamentoConsulta == null) {
			if (other.idAgendamentoConsulta != null)
				return false;
		} else if (!idAgendamentoConsulta.equals(other.idAgendamentoConsulta))
			return false;
		return true;
	}

	
	
	
	
	
}
