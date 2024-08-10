package com.scm.SmartContactsManager.Entitys;

import java.util.ArrayList;
import java.util.List;

import com.scm.SmartContactsManager.Controllers.Contacts;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.GenerationType;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private int Id;
	@Column(nullable = false)
	private String userName;
	private String name;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String phoneNo;
	@Column(nullable = false)
	private String password;
	private boolean emailVerified=false;
	
	@OneToMany(mappedBy ="user")
	private List<Contacts> contacts = new ArrayList<>();

}
