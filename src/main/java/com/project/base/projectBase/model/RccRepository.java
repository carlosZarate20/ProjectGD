package com.project.base.projectBase.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RccRepository extends JpaRepository<Rcc, Long>{

	@Query("SELECT T.DocIdentidad FROM Rcc T where T.DocIdentidad =:docIdentidad and T.PorDeudaClasNormal in (100)") 
	public Rcc getCodRcc(@Param("docIdentidad")String docIdentidad);
}
