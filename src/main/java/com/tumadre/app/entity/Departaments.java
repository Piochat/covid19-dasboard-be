package com.tumadre.app.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table
public class Departaments {

	@Id
	@Column(name = "DepartamentID")
	private Long id;

	@Column(name = "DepartamentName")
	private String departamentName;

	@Column(name = "Created_At")
	@CreationTimestamp
	private LocalDateTime createdAt;

	@Column(name = "Updated_At")
	@UpdateTimestamp
	private LocalDateTime updatedAt;
}
