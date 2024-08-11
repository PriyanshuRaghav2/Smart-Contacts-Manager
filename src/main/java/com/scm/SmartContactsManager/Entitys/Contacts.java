package com.scm.SmartContactsManager.Entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
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

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Contacts() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contacts(int id, String name, String phoneNo, String email, String relation, User user) {
		super();
		Id = id;
		this.name = name;
		this.phoneNo = phoneNo;
		this.email = email;
		this.relation = relation;
		this.user = user;
	}
	
	

}
