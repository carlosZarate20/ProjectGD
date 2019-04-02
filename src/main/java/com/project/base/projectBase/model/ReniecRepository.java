package com.project.base.projectBase.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ReniecRepository extends JpaRepository<Reniec, Long>{
	
	@Query("SELECT T.DocIdentidad FROM Reniec T where T.DocIdentidad =:docIdentidad") 
	public Reniec getCodReniec(@Param("docIdentidad")String docIdentidad);
}
