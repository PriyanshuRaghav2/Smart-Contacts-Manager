package com.scm.SmartContactsManager.Controllers;

import com.scm.SmartContactsManager.Entitys.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contacts {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private int Id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String phoneNo;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String relation;
	
	@ManyToOne
	private User user;

}
