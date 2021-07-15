package com.tumadre.app.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table
public class Patients {

	@Id
	@SequenceGenerator(name = "patients_sequence", sequenceName = "patients_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "patients_sequence")
	@Column(name = "PatientID")
	private Long id;
	
	@Column(name = "InfectedAt")
	@CreationTimestamp
	private LocalDateTime infectedAt;
	
	@Column(name = "LastStatusAt")
	@CreationTimestamp
	private LocalDateTime lastStatusAt;
	
	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "PatientConditionID")
	private PatientsConditions patientCondition;
	
	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "GenderID")
	private Genders gender;
	
	@OneToOne
	@JoinColumn(name = "MunicipalityID")
	private Municipalities municipality;
	
	@Column(name = "Created_At")
	@CreationTimestamp
	private LocalDateTime createdAt;
	
	@Column(name = "Updated_At")
	@UpdateTimestamp
	private LocalDateTime updatedAt;
}
