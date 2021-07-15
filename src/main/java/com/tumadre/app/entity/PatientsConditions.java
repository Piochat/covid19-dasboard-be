package com.tumadre.app.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name = "Patients_Conditions")
@Data
public class PatientsConditions {

	@Id
	@SequenceGenerator(name = "patients_conditions_sequence", sequenceName = "patients_conditions_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "patients_conditions_sequence")
	@Column(name = "PatientConditionID")
	private Long id;

	@Column(name = "PatientConditionName")
	private String patientConditionName;
	
	@Column(name = "Created_At")
	@CreationTimestamp
	private LocalDateTime createdAt;
	
	@Column(name = "Updated_At")
	@UpdateTimestamp
	private LocalDateTime updatedAt;
}
