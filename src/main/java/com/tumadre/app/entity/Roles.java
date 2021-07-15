package com.tumadre.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Roles", schema = "admins")
public class Roles {
	
	@Id
	@Column(name = "RoleID")
	private Long id;
	
	private String roleName;
}
