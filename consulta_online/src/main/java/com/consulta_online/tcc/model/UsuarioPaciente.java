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
@Table(name = "usuario_paciente")
public class UsuarioPaciente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private Long idUsuario;
	
	@ManyToOne
	@JoinColumn(name = "id_cod_perfil", foreignKey = @ForeignKey( name ="id_cod_perfil"))
	private PerfilAcesso perfilacesso; 

	
	
	@Column(name = "nome_usuario")
	private String nomeUsusario;
	
	@Column(name = "cpf")
	private Integer cpf;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "senha_usuario")
	private String senha;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	

	public PerfilAcesso getPerfilacesso() {
		return perfilacesso;
	}

	public void setPerfilacesso(PerfilAcesso perfilacesso) {
		this.perfilacesso = perfilacesso;
	}

	public String getNomeUsusario() {
		return nomeUsusario;
	}

	public void setNomeUsusario(String nomeUsusario) {
		this.nomeUsusario = nomeUsusario;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idUsuario == null) ? 0 : idUsuario.hashCode());
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
		UsuarioPaciente other = (UsuarioPaciente) obj;
		if (idUsuario == null) {
			if (other.idUsuario != null)
				return false;
		} else if (!idUsuario.equals(other.idUsuario))
			return false;
		return true;
	}

	
	
	
	

}
