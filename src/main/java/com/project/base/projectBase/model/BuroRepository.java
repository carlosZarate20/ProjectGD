package com.project.base.projectBase.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BuroRepository extends JpaRepository<Buro, Long> {
	@Query("SELECT T.CodDoc FROM Buro T where T.CodDoc =:docIdentidad and T.PorDeudaClasNormal in (100)") 
	public Buro getCodBuro(@Param("docIdentidad")String docIdentidad);
}
