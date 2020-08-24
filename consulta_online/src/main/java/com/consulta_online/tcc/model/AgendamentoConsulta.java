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
	private String dataConsulta;
	

	@Column(name = "hora_consulta")
	private String horaConsulta;
	

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
	@JoinColumn(name = "id", foreignKey = @ForeignKey( name ="id"))
	private User users;

    public AgendamentoConsulta() {
    
		
	  }
  
    



	public Long getIdAgendamentoConsulta() {
		return idAgendamentoConsulta;
	}


	public void setIdAgendamentoConsulta(Long idAgendamentoConsulta) {
		this.idAgendamentoConsulta = idAgendamentoConsulta;
	}


	public String getDataConsulta() {
		return dataConsulta;
	}


	public void setDataConsulta(String dataConsulta) {
		this.dataConsulta = dataConsulta;
	}


	public String getHoraConsulta() {
		return horaConsulta;
	}


	public void setHoraConsulta(String horaConsulta) {
		this.horaConsulta = horaConsulta;
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


	public User getUsers() {
		return users;
	}


	public void setUsers(User users) {
		this.users = users;
	}


	

    
	
	
	
	
	
}
