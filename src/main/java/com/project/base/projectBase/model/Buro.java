package com.project.base.projectBase.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Buro", schema = "DataProject")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Buro  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="IdBuro")
	private int codBase;
}
