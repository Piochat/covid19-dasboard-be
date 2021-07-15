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
public class Genders {
	
	@Id
	@Column(name = "GenderID")
	private Long id;
	
	@Column(name = "GenderName")
	private String genderName;
	
	@Column(name = "Created_At")
	@CreationTimestamp
	private LocalDateTime createdAt;
	
	@Column(name = "Updated_At")
	@UpdateTimestamp
	private LocalDateTime updatedAt;
}
