package com.tumadre.app.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table
public class Municipalities {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "MunicipalityID")
	private Long id;

	@Column(name = "MunicipalityName")
	private String municipalityName;

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "DepartamentID")
	private Departaments departament;

	@Column(name = "Created_At")
	@CreationTimestamp
	private LocalDateTime createdAt;

	@Column(name = "Updated_At")
	@UpdateTimestamp
	private LocalDateTime updatedAt;
}
