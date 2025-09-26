package com.ddu.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "members")
@SequenceGenerator(sequenceName = "MEMBERS_SEQ", name = "MEMBERS_SEQ_GENERATOR")
@Data
public class Member {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MEMBERS_SEQ_GENERATOR")
	private Long id;
	
	private String email;
	private String password;
	private String name;
	private String role;
	
}
