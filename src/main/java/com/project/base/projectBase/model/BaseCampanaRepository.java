package com.project.base.projectBase.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BaseCampanaRepository extends JpaRepository<BaseCampana, Long> {
	
	@Query("SELECT T.CodDoc FROM BaseCampana T where T.CodDoc =:docIdentidad") 
	public BaseCampana getCodBaseCampana(@Param("docIdentidad")String docIdentidad);

}
