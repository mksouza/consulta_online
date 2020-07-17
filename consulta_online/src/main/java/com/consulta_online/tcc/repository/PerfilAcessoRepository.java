package com.consulta_online.tcc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.consulta_online.tcc.model.PerfilAcesso;


@Repository
public interface PerfilAcessoRepository extends JpaRepository<PerfilAcesso, Long>{
	
	
        List<PerfilAcesso> findByIdCodPerfil(@Param("idCodPerfil") Long id);	
	


}
